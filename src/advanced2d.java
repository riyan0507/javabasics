import java.util.*;
public class advanced2d {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter tha numbers of rows : ");
        int row=sc.nextInt();
        System.out.print("enter tha numbers  of columns  :" );
        int columns=sc.nextInt();
        int [][] array =new int[row][columns];
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<columns ; j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter the number that you want to find  : ");
        int x=sc.nextInt();
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<columns ; j++){
                if(x==array[i][j]){
                    System.out.print("the coordinate are : " + (i+1) + " ," + (j+1));
                }
            }
        }
    }
}
