package week2codingbat;

/*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"*/

public interface String1helloName {

    public static String helloName(String name) {

        return "Hello " + name + "!";
    }
}