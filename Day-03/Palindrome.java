
import java.util.Scanner;

class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :   ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        // ham reverse nikalne ka doosra way bhi use kar sakte hain
        while (num > 0) {
            int r = num % 10;
            reverse = reverse * 10 + r;
            num = num / 10;
        }
        if(reverse==temp){
            System.out.println("yeah !" + " " +(temp) + " " + "is Palindrome number .");

        }
        else {
            System.out.println("Not Palindrome number");
        }
    }
}
