// create a program that reads 5 numbers and prints if the number is negative or positive


import java.util.Scanner;
public class ex_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the five numbers ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("enter the number " + i + ": ");
            double num = sc.nextDouble();
                if (num >= 0) {
                    System.out.println("Number " + num + " is Positive.");
                } else {
                    System.out.println("Number " + num + " is negative");
                }
            }
        }
    }

