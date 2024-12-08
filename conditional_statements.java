import java.util.*;

public class conditional_statements {
    // Challange Hackerrank ----> Given an integer n, perform the following
    // conditional actions:
    // ------------------------->If n is odd, prin Weird
    // ------------------------->If n is even and in the inclusive range of 2 to 5,
    // print Not Weird
    // ------------------------->If n is even and in the inclusive range of 6 to 20
    // , print Weird
    // ------------------------->If n is even and greater than 20, print Not Weird
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n % 2 == 1)
            System.out.print("Weird");
        else if (n % 2 == 0 && n >= 2 && n <= 5)
            System.out.print("Not Weird");
        if (n % 2 == 0 && n >= 6 && n <= 20)
            System.out.print("Weird");
        if (n % 2 == 0 && n > 20)
            System.out.print("Not Weird");
    }
}
