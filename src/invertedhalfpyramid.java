import java.util.Scanner;
public class invertedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=i;j<=rows;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
