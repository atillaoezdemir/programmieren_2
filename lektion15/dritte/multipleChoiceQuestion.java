package de.thws.lektion15aa.dritte;

public class multipleChoiceQuestion extends question{
    
    String[] choice;
    
    public multipleChoiceQuestion(String question, String[] choice, String antwort){
        super(question, antwort);
        this.choice = choice;
    }
    public void askQuestion(){
        System.out.println(question);
        for(String c : choice)
            System.out.println(c);
    }
    
    public boolean checkAnswer(String antwort){
        return this.antwort.equals(antwort);
    }
}
