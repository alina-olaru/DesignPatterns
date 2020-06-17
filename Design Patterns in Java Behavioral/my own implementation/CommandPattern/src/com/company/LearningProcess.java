package com.company;

public class LearningProcess {

    boolean isReading = false;
    boolean isLearning = false;
    boolean isEvaluated = false;

    public void toggle() {

        if (isReading == true) {
         learn();
            isLearning = true;
            isReading = false;
            isEvaluated = false;
            return;
        }
        if (isLearning == true) {
            evaluated();
            isLearning = false;
            isEvaluated = true;
            isReading = false;
            return;
        }
        if (isEvaluated == true) {
            read();
            isReading = true;
            isEvaluated = false;
            isLearning = false;
            return;
        }

        else{
            read();
            isReading = true;
            isEvaluated = false;
            isLearning = false;
            return;
        }
    }
        public void learn(){
            System.out.println("Invata");
        }
        public  void read(){
            System.out.println("citeste");

        }
        public void evaluated(){
            System.out.println("este evaluat");
        }
}
