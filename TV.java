package Lecture_5;

import java.util.Objects;

public class TV {
    private int channel;
    private int volume;
    private String manufacturer;
    private boolean isItOn;

    public TV(){
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void setItOn(boolean isItOn){
        this.isItOn = isItOn;
    }
    public boolean isItOn(boolean isItOn) {
        return isItOn;
    }
    @Override
    public String toString() {
        return "TV{" +
                "channel='" + channel + '\'' +
                ", volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isItOn=" + isItOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return volume == tv.volume && isItOn == tv.isItOn && Objects.equals(channel, tv.channel) && Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, volume, manufacturer, isItOn);
    }

    public boolean isItOn() {
        return false;
    }
}
