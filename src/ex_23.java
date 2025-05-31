// create a program that reads numbers and sum them until the user inputs a negative value


import java.util.Scanner;
public class ex_23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0,num;
        System.out.print("Enter a number: ");
        num = s.nextInt();
        while (num >= 0) {
            sum =sum+num;
            System.out.print("Enter a number: ");
            num = s.nextInt();
        }
        System.out.println("The total sum is: " + sum);
    }
}