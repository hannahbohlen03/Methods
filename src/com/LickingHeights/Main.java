package com.LickingHeights;

public class Main {


    public static void main(String[] args) {
        Greeting("Bob.");
        Greeting("Sarah.");
        Greeting("Dan.");
        Greeting("Jessica.");

        System.out.println(" ");

        Detail("loud");
        Detail("fast");
        Detail("sad");
        Detail("smelly");

        System.out.println(" ");

        Preference("tiger");
        Preference("bear");
        Preference("dog");
        Preference("penguin");

        System.out.println(" ");

        int a = 12;
        int b = 43;
        System.out.println(a + " times " + b + " is ");
        System.out.println(multiply(a, b));

        System.out.println(" ");

        int x = 435;
        int y = 24;
        System.out.println(x + " divided by " + y + " is ");
        System.out.println(Divide(x, y));

        System.out.println(" ");

        System.out.println("Since " + y + " does not fit into " + x + " evenly, the modulus of " + x + " by " + y + " is ");
        System.out.println(Modulus(x, y));

    }

    public static void Greeting(String names) {
        System.out.println("Good morning, " + names);
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static void Detail(String adjectives) {
        System.out.println("The lion was very " + adjectives + ".");
    }

    public static void Preference(String animal) {
        System.out.println("My favorite animal is a " + animal + ".");
    }

    public static int Divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public static int Modulus(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }

}



