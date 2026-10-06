import java.util.*;
public class reversingdigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n : ");
        int n =sc.nextInt();
        int x=0;
        while(n!=0){
            x=x*10+n%10;
            n=n/10;
        }
        System.out.println(x);
    }
}
