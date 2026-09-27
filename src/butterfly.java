public class butterfly {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int k = 1; k <= (8 - 2 * i); k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();

        }
        for (int x =n ; x>=1 ; x--){
            for(int y=x ; y>=1 ; y--){
                System.out.print("*");
            }
            for(int y =1 ; y<=(8-2*x) ; y++){
                System.out.print(" ");
            }
            for(int z=x ; z>=1 ; z--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}