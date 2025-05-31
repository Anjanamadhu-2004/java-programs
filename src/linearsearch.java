import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit:");
        int n = sc.nextInt();
        int[] a = new int[n];
        int flag = 1;
        System.out.println("enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the target element:");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                flag = 0;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Found Element");
        } else {
            System.out.println("Element Not Found");
        }
    }
}