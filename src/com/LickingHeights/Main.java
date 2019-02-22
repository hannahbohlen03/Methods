package com.LickingHeights;

public class Main {


    public static void main(String[] args) {
        Greeting("Bob.");
        Greeting("Sarah.");
        Greeting("Dan.");
        Greeting("Jessica.");

        System.out.println(" ");

        int a = 12;
        int b = 43;
        System.out.println(multiply(a, b));
        int c = multiply(a, b);
        int d = multiply(c, b);

        System.out.println(" ");

        Detail("loud");
        Detail("fast");
        Detail("sad");
        Detail("smelly");


    }

    public static void Greeting(String names) {
        System.out.println("Good morning, " + names);
    }
    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public static void Detail(String adjectives){
        System.out.println("The lion was very " + adjectives +".");
    }
}
}


