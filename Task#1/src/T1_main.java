import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T1_main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("What is the height of the brick?");
        int a = Integer.parseInt(br.readLine());
        System.out.println(" What is the width of the brick?");
        int b = Integer.parseInt(br.readLine());
        System.out.println(" What is the depth of the brick?");
        int c = Integer.parseInt(br.readLine());
        System.out.println(" What is the height of the hole?");
        int x = Integer.parseInt(br.readLine());
        System.out.println(" What is the width of the hole?");
        int y = Integer.parseInt(br.readLine());

        if ((a <= 0) || (b <= 0) || (c <= 0) || (x <= 0) || (y <= 0)) {
            System.out.println(" Entered value is not correct!");
        } else {
            if (((a < x) && (b < y)) || ((a < y) && (b < x)) || ((a < x) && (c < y)) || ((a < y) && (c < x)) ||
                    ((b < x) && (c < y)) || ((b < y) && (c < x))) {
                System.out.println("Yes. It is possible!");
            } else {
                System.out.println("No. It is impossible!");
            }
        }
    }
}
