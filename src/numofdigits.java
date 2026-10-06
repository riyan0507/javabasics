import java.util.*;
public class numofdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digits=0;
        int n =sc.nextInt();
        while(n!=0){
            int x=n%10;
            digits++;
            n=n/10;
        }
        System.out.println(digits);
    }
}
