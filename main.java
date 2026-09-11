import java.util.*;

class simple_quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = 0;
        int answer;

        System.out.println("--- SIMPLE QUIZ ---");

        System.out.println("\n1. Which keyword is used to take input?");
        System.out.println("1. Scanner");
        System.out.println("2. Input");
        System.out.println("3. Read");

        System.out.print("Enter answer: ");
        answer = sc.nextInt();

        if (answer == 1) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }


        System.out.println("\n2. Which loop is used for repetition?");
        System.out.println("1. if");
        System.out.println("2. for");
        System.out.println("3. switch");

        System.out.print("Enter answer: ");
        answer = sc.nextInt();

        if (answer == 2) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }


        System.out.println("\n3. Which operator is used for multiplication?");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");

        System.out.print("Enter answer: ");
        answer = sc.nextInt();

        if (answer == 3) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong!");
        }

        System.out.println("\nYour Score = " + score + "/3");

    }
}