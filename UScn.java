import java.util.Scanner;

public class UScn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        char x = '\"';
        String word = in.nextLine();
        System.out.print( word + x + word +x );


    }
}
