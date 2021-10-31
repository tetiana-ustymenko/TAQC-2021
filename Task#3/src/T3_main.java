import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T3_main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //part 1
        System.out.println("Please, enter radius of a flower bed: ");
        double r = Double.parseDouble(br.readLine());
        double P = 2 * r * 3.14;
        System.out.println("Perimeter of a flower bed: = " + P);
        double A = r * r * 3.14;
        System.out.println("Area of a flower bed = " + A);
        System.out.println();

        //part 2
        String name;
        String address;
        System.out.println("What is your name?");
        name = br.readLine();
        System.out.println("Where do you live, " + name + "?");
        address = br.readLine();
        System.out.println(name + " lives at " + address);
        System.out.println();

        //part 3
        System.out.print("Please, enter c1: ");
        int c1 = Integer.parseInt(br.readLine());
        System.out.print("Please, enter c2: ");
        int c2 = Integer.parseInt(br.readLine());
        System.out.print("PLease, enter c3: ");
        int c3 = Integer.parseInt(br.readLine());

        System.out.print("Please, enter t1: ");
        int t1 = Integer.parseInt(br.readLine());
        System.out.print("Please, enter t2: ");
        int t2 = Integer.parseInt(br.readLine());
        System.out.print("Please, enter t3: ");
        int t3 = Integer.parseInt(br.readLine());

        if ((c1 <= 0) || (c2 <= 0) || (c3 <= 0) || (t1 <= 0) || (t2 <= 0) || (t3 <= 0)) {
            System.out.println("The values which you entered are incorrect!");
            System.out.println("Value must be positive!");
            System.out.println("Please, enter ONLY positive value!");
        } else {

            int res1 = c1 * t1;
            System.out.println("For first call computer will count " + res1 + " standard units");
            int res2 = c2 * t2;
            System.out.println("for second - " + res2 + ", ");
            int res3 = c3 * t3;
            System.out.println("for third - " + res3 + ", ");
            int res = res1 + res2 + res3;
            System.out.println("and for all talk together - " + res + " standard units!");
        }
    }
}
