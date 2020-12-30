package Lecture_5;


public class TvController extends TvService {
    boolean tvIsConnected;
    public String pushOn;

    TvService tvService = new TvService();

    public void pushon(){
    switch (pushOn) {
        case "tvIsOff":
            tvService.tvIsOff();
            break;
        case "tvIsOn":
            tvService.tvIsOn();
            break;
        case "volumeMinus":
            tvService.volumeMinus();
            break;
        case "volumePlus":
            tvService.volumePlus();
            break;
        case "channelMinus":
            tvService.channelMinus();
            break;
        case "channelPlus":
            tvService.channelPlus();
            break;
        default:

    }
    }
    }

