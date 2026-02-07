
import java.util.*;

class N_even_num{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int c = 0;
        while (c < n) {
            if (i % 2 == 0) {
                c++;
                System.out.println(i);

            }
            i++;

        }
    }

}
