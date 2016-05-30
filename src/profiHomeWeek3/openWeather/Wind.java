package profiHomeWeek3.openWeather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Wind {

    @SerializedName("speed")
    @Expose
    private int speed;
    @SerializedName("deg")
    @Expose
    private int deg;

    /**
     * No args constructor for use in serialization
     *
     */
    public Wind() {
    }

    /**
     *
     * @param speed
     * @param deg
     */
    public Wind(int speed, int deg) {
        this.speed = speed;
        this.deg = deg;
    }

    /**
     *
     * @return
     * The speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     * The speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     * The deg
     */
    public int getDeg() {
        return deg;
    }

    /**
     *
     * @param deg
     * The deg
     */
    public void setDeg(int deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                ", deg=" + deg +
                '}';
    }
}