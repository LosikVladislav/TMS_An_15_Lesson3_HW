import java.util.Scanner;

public class BankDep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double sumDep = in.nextDouble();
        System.out.println("Enter number of years");
        int numOfYear = in.nextInt();
        System.out.println(deposit(sumDep,numOfYear));
    }
    public static double deposit (double sumDep, int numOfYear){
     double rate = 0.1;
        for (int i=1; i<=numOfYear; i++){
            double interval = sumDep*rate;
            sumDep = interval+sumDep;
        }
        return sumDep;
    }
}
