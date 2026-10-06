import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int y=n;
        int x=0;
        while(n!=0){
            x=x*10 + n%10;
            n=n/10;
        }
        if(y==x){
            System.out.println("it is a pallindrome number ");
        }
        else{
            System.out.println("it is not a pallindrome number ");
        }
    }
}
