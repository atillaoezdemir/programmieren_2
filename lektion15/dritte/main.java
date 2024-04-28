package de.thws.lektion15aa.dritte;

public class main {
    
    public static void main(String[] args){
        textQuestion tq = new textQuestion("Which city is the capital of Turkey?", "Ankara");
        tq.askQuestion();
        System.out.println("Your answer Istanbul is " + tq.checkAnswer("Istanbul"));

        String[] choice = {"London", "Moscow", "Istanbul", "St. Petersburg", "Berlin"};
        multipleChoiceQuestion mp = new multipleChoiceQuestion("Which city ist the most crowded city in Europe?", choice, "Istanbul");
        mp.askQuestion();
        System.out.println("Your answer Istanbul is " + mp.checkAnswer("Istanbul"));
    }
}
