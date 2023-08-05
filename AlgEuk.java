import java.util.Scanner;

public class AlgEuk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first num");
        int x = in.nextInt();
        System.out.println("Enter second num");
        int y = in.nextInt();
        System.out.print("GCF="+alg(x,y));
    }
    public static int alg (int x, int y){
        while (x != y) {
            if(x > y){
                x = x - y;
            } else {
                y = y -x;
            }
        }
        return x;
    }
}
