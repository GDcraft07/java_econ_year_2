import java.io.PrintStream;
import java.io.IOException;
import java.util.Scanner;

class Main {
    static PrintStream out = new PrintStream(System.out);
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int number = in.nextInt();

        out.println(number);
    }
}