import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        int n;
        int a = 0, b = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter series");
        n= sc.nextInt();
        System.out.println(a +" "+ b);
        for(int i=2;i<n;i++){
            int c=a+b;
            System.out.println("" +c);
            a=b;
            b=c;

        }
    }
}