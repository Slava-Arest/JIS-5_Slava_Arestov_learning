package Lecture_4;

public class LightColorDetector {

    public void colorDetect() {
    }
    public String colorDetect(int colorDetection){
        if (colorDetection>380 && colorDetection<449){
            return "Violet";
        }
        else if(colorDetection>450 && colorDetection<494){
            return "Blue";
        }
        else if (colorDetection>496 && colorDetection<569){
            return "Green";
        }
        else if(colorDetection>570 && colorDetection<589){
            return "Yellow";
        }
        else if (colorDetection>590 && colorDetection<619){
            return "Orange";
        }
        else if (colorDetection>620 && colorDetection<750){
            return "Red";
        }
        else {
        return "Invisible light";
        }
    }
}
