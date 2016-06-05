package profiHomeWeek4.reflectionFormatter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectionFormatter {

    public String objectToJson(Object obj) {

        Class struc = obj.getClass();
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%s:%s\n", "type", struc.getName()));

        Field[] fields = struc.getDeclaredFields();

        for (Field field : fields) {
            try {
                if (field.isAnnotationPresent(Info.class)) {

                    Info info = field.getDeclaredAnnotation(Info.class);
                    String fieldName = field.getName();

                    String firstUpperCaseLetter = fieldName.substring(0, 1).toUpperCase();
                    Method getFieldValue = struc.getMethod("get" + firstUpperCaseLetter + fieldName.substring(1));
                    sb.append(String.format("%s:%s\n", info.name(), getFieldValue.invoke(obj)));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }

    public Object jsonToObject(String src){

        String[] lines = src.split("\n");
        String type = lines[0].split(":")[1];

        Map<String,String> keyValuesMap = new HashMap<>();

        for (int i = 1; i < lines.length; i++) {
            String[] keyValue = lines[i].split(":");
            keyValuesMap.put(keyValue[0], keyValue[1]);
        }

        try {
            Class cl = Class.forName(type);
            Object instance = cl.newInstance();

            Map<String, Field> fieldAnnotNameMap = new HashMap<>();
            for(Field field : cl.getDeclaredFields()){
                Info info = field.getAnnotation(Info.class);
                if(info != null){
                    fieldAnnotNameMap.put(info.name(), field);
                }
            }

            // iteration over map
            for (String key : keyValuesMap.keySet()) {
                // getField using Annotation property
                Field field = fieldAnnotNameMap.get(key);

                Class<?> fieldType = field.getType();

                String firstUpperCaseLetter = field.getName().substring(0, 1).toUpperCase();
                Method setMethod = cl.getMethod("set" + firstUpperCaseLetter + field.getName().substring(1), fieldType);

                if(int.class == fieldType){
                    setMethod.invoke(instance, Integer.parseInt(keyValuesMap.get(key)));
                } else if(double.class == fieldType){
                    setMethod.invoke(instance, Double.parseDouble(keyValuesMap.get(key)));
                } else if(String.class == fieldType){
                    setMethod.invoke(instance, keyValuesMap.get(key));
                } else if(Enum.class == fieldType.getSuperclass()){
                    String nameEnum = fieldType.toString();
                    nameEnum = nameEnum.substring(nameEnum.indexOf(".") + 1);
                    //setMethod.invoke(instance, Enum.valueOf(fieldType, keyValuesMap.get(key)));
                    //setMethod.invoke(instance, nameEnum + "." + nameEnum.valueOf(keyValuesMap.get(key)));
                }

            }

            return instance;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T extends Enum<T>> T getEnumFromString(Class<T> c, String string) {
        if( c != null && string != null ) {
            try {
                return Enum.valueOf(c, string.trim().toUpperCase());
            } catch(IllegalArgumentException ex) {
            }
        }
        return null;
    }
}