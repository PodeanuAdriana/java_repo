import java.util.Scanner;

public class progression_ar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 0;
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int p = a;

            for (int j = 0; j < n; j++) {
                p += (int) Math.pow(2, j) * b;
                System.out.print(p + " ");
            }

        }
        in.close();

    }
}
