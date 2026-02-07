import java.util.*;
class SwitchCalc{
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first num : ");
       int a = sc.nextInt();
       System.out.println("Enter Second num : ");
       int b = sc.nextInt();

       System.out.println(" Choose your Opinion :  ");
       System.out.println("1. Addition ");
       System.out.println("2. Substraction ");
       System.out.println("3. Multiplication ");
       System.out.println("4. Division ");
       int choice = sc.nextInt();
       switch(choice){
       case 1 :
        System.out.println("Sum of a+b = " + (a+b));
        break;
        case 2 :
        System.out.println("Sum of a-b = " + (a-b));
        break;
        case 3 :
        System.out.println("Sum of a X b = " + (a*b));
        break;
        case 4 :
        System.out.println("Sum of a / b = " + (a%b));
        break;
        default: 
        System.out.println("Invalid choice");
        break;

       }
 }
}

