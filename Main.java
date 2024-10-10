package org.example;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner inp_1 = new Scanner(System.in);
        Scanner inp_2 = new Scanner(System.in);
        System.out.println("Wellcome to my calculator." +
                "(if you want to exit the programme you can just type END in operation input level)");


            while (true){

                System.out.println("Enter first number: ");
                float number_1 = inp_1.nextFloat();

                System.out.println("Choose +,-,*,/,'END' for exit");
                String order = inp_2.nextLine();
                if (Objects.equals(order,"END")) {
                    System.out.println("Have a good day.Bye");
                    break;
                }
                System.out.println("and the second one: ");
                float number_2 = inp_1.nextFloat();


                if (Objects.equals(order, "+")) {
                    sum(number_1, number_2);

                } else if (Objects.equals(order, "-")) {
                    sub(number_1, number_2);
                } else if (Objects.equals(order, "*")) {
                    multiple(number_1, number_2);
                } else if (Objects.equals(order, "/")) {
                    division(number_1, number_2);
                }
        }

    }


    static void sum(float num_1, float num_2) {
        System.out.println("The answer is " + (num_1 + num_2));
    }

    static void sub(float num_1, float num_2) {
        System.out.println("The answer is " + (num_1 - num_2));
    }


    static void multiple(float num_1, float num_2) {
        System.out.println("The answer is " + num_1 * num_2);
    }

    static void division(float num_1, float num_2) {
        if (num_2 == 0) {
            System.out.println("can not divide by zero");

        } else {
            System.out.println("The answer is " + num_1 / num_2);
        }
    }
}
// watch S09 E08