import java.util.*;
class Reversenum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number for reversing :  ");
        int num  = sc.nextInt();
        // Logic =  num jab 0 se bada rahega to num%10 jo ki last digit dega jaise ki 234 me 4 dega and then 4 print hoke , remainder bacha 23 ab 23 again 10 se % hoga to 3 print hoga bachega remainder 2 and so on ....... result : 4-3-2.
        // ALTERNATE WAY : int rev = o ; int r = num%10 , rev = rev*10+remainder , num = num/10 .print(rev);
        while(num>0){
            int r= num%10;
            System.out.print(r);
        num = num/10;

                    }



    }
}