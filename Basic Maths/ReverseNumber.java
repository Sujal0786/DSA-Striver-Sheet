import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(reverseNumber(n));
    }
        public static int reverseNumber(int n) {
            int sum=0;
            while(n>0){
         int ls = n%10;
             sum=(sum *10) + ls;
             n=n/10;
            }
            return sum;
        }
}
