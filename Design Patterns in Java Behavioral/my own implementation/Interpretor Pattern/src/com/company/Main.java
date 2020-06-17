package com.company;



public class Main {

    //Rule: Robert and John are male
    public static Expression getMaleExpression(){
        Expression me = new TerminalExpression("Alina");
        Expression you = new TerminalExpression("Andrei");
        return new OrExpression(me, you);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }



    public static void main(String[] args) {
	// write your code here
//        Expression isMale = getMaleExpression();
//        Expression isMarriedWoman = getMarriedWomanExpression();
//
//        System.out.println("John is male? " + isMale.interpret("John"));
//        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
//

//        Expression me = new TerminalExpression("Alina");
////        Expression you = new TerminalExpression("Andrei");
////        Expression rez = new AndExpression(me,you);
////        Expression rez3 = new OrExpression(me,you);


        String context="Alina Georgiana";
        Expression define = getMaleExpression();
        System.out.println(context + " "+define.interpret(context));

        Student s1 = new Student("Alina",10);
        Student s2 = new Student("Mirela",3);


    }



}
