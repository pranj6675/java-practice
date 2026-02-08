import java.util.*;
class Primenum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int num = sc.nextInt();
int count = 0 ;
for(int i = 1 ; i<=num ;  i++){
    if(num%i == 0){
        count++;
    }

}
// jitni baar num%i == 0 aayega utni baar count calc hoga , technically primek liy2 2 baaar hi aana chahiye 1 se aur itself se to in the case coount ++ ki value 2 rhegi to prime nuum else not prime 
// aur claify ke liye ek line aur liklh skte hai ki num <=1 -- Non - Prime
if(count==2){
    System.out.println("Prime number");
}
else{
    System.out.println("Non- Prime");
}
    
}
    }
