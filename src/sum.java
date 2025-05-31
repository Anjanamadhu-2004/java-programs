import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int flag = 0;
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the sum:");
        int sum = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i] + a[j] == sum) {
                    System.out.println("To generate sum " + sum + " we require numbers:" + a[i] + "and" + a[j]);
                    flag = 1;

                }
            }
        }
        if (flag == 0) {
            System.out.println("The sum " + sum + " can't be generated using the given numbers");
        }
    }
}
