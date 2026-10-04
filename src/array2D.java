import java.util.*;
public class array2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int row=sc.nextInt();
        System.out.print("enter the number  of columns :");
        int columns =sc.nextInt();
        int[][] findingcoordinates = new int[row][columns];
        //for input
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<columns ; j++){
                findingcoordinates[i][j]=sc.nextInt();
            }
        }
        //for output
        for(int i=0 ; i<row ; i++){
            for(int j=0 ; j<columns ; j++){
                System.out.print(findingcoordinates[i][j] + " ");
            }
            System.out.println()
        }
    }
}
