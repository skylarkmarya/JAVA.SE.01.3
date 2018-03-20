import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter [a,b] and count h:");
        System.out.println("Enter a:");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Enter b:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Enter h:");
        int h = Integer.parseInt(reader.readLine());
        if (a < b) {
            double f;
            System.out.println("[" + a + "," + b + "] " + "h=" + h + ":");
            for (int x = a; x <= b; x = x + h) {
                f = Math.tan(2 * x) - 3;
                System.out.println("x= " + x + " f= " + f);
            }
        } else
            System.out.println("Input error: a > b, make a<b.");
    }
}