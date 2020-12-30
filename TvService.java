package Lecture_5;

import java.util.Objects;

public class TvService {

    TV tv = new TV();

    int channel;
    int volume;

    public int channelPlus() {
        tv.setChannel(4);
        if (!tv.isItOn())
            channel = tv.getChannel() + 1;
            return channel;
    }
    public int channelMinus() {
        tv.setChannel(4);
        if (!tv.isItOn())
            channel = tv.getChannel() - 1;
            return channel;
    }
    public int volumePlus(){
        tv.setVolume(26);
        if (!tv.isItOn()){
            volume = tv.getVolume() + 5;
        }
        return volume;
    }
    public int volumeMinus(){
        tv.setVolume(26);
        if (!tv.isItOn()){
            volume = tv.getVolume() -5;
        }
        return volume;
    }
    public boolean tvIsOn(){
        tv.setItOn(false);
        return tv.isItOn();
    }
    public boolean tvIsOff(){
        tv.setItOn(true);
        return tv.isItOn();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TvService tvService = (TvService) o;
        return channel == tvService.channel && volume == tvService.volume && Objects.equals(tv, tvService.tv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tv, channel, volume);
    }
}
