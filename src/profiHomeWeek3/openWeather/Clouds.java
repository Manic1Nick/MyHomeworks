package profiHomeWeek3.openWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Clouds {

    @SerializedName("all")
    @Expose
    private int all;

    /**
     * No args constructor for use in serialization
     *
     */
    public Clouds() {
    }

    /**
     *
     * @param all
     */
    public Clouds(int all) {
        this.all = all;
    }

    /**
     *
     * @return
     * The all
     */
    public int getAll() {
        return all;
    }

    /**
     *
     * @param all
     * The all
     */
    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}