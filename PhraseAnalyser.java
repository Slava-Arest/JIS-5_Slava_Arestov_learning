package Lecture_4;

public class PhraseAnalyser {
public String analyse(String text){
    if (text.startsWith("Make") && text.endsWith("Great Again")){
        return "It stands no chance";
    }
    else if (text.startsWith("Make") || text.endsWith("Great Again")){
        return "It could be worse";
    }
    else{
        return "It is fine, really";
    }
}
}
