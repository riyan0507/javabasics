import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a :");
        long a = sc.nextLong();
        System.out.print("enter the value of b : ");
        long b = sc.nextLong();
        System.out.print("choose operation (* , + , - , / : ");
        char x =sc.next().charAt(0);
        if(x=='+'){
            System.out.println(a+b);
        }
        else if ( x=='-'){
            System.out.println(a-b);
        }
        else if ( x=='*'){
            System.out.println(a*b);
        }
        else if (x=='/'){
            System.out.println(a/b);
        }
        else {
            System.out.println("invalid");
        }

    }


}
