import java.util.Scanner;
public class palindrome {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("enter the number: ");
            int num=sc.nextInt();
            int temp = num;
            int rev=0;
            while(num!=0)
            {
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            if(temp==rev)
            {
                System.out.println("The given number is palindrome");
            }
            else {
                System.out.println("The given number is not palindrome");
            }
        }
}
