import java.util.*;
public class printingdigits {
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    while(n!=0){
        int digits=n%10;
        System.out.println(digits);
         n=n/10;
     }
  }
}