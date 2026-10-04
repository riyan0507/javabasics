import java.util.*;
public class strings {
    public static void main(String[] args){
        int vowels=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your sentence : ");
        String word=sc.nextLine();
        for(int i =0 ; i<word.length() ; i++){
        char ch=word.charAt(i);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            vowels++;
        }
        }
        System.out.println(vowels);
    }
}
