
import java.util.Scanner;

class Fibonacci{
public static void main(String[] args) {
     int a = 0 , b = 1 ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number : ");
    int num = sc.nextInt();
     
     for(int i = 1; i<=num ; i++){
        System.out.println( a + " ");
        int c = a+b;
        a=b;
        b=c;

    }
}
}