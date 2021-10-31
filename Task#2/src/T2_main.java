import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

                                                                                                    //part a
public class T2_main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter any NATURAL number!");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Your entered number:  " + n);

        n *= n;
        System.out.println("Square of your number:  " + n);

        String s = Integer.toString(n);
        if (s.contains("3")) {
            System.out.println("Digit 3 was found!");
        } else System.out.println("Digit 3 was NOT found");
    }
}
                                                                                                    //part b
/*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter any NATURAL number!");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Your entered number:  " + n);

        String str = Integer.toString(n);
        System.out.println ("Your modified number:  " + reverseString(str));
    }
        public static String reverseString(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                result = str.charAt(i) + result;
            }
            return result;

    }
}
*/

                                                                                                    //part c
  /* public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Please, enter any NATURAL number!");
       int n = Integer.parseInt(br.readLine());
       System.out.println("Your entered number:  " + n);

       String s1 = Integer.toString(n);
       char first = s1.charAt(0);
       char last = s1.charAt(s1.length() - 1);
       String s = s1.substring(1, s1.length() - 1);
       String s2 = (last + s + first);
       System.out.println("Your modified number:  " + s2);
   }
}
*/


                                                                                                    //part d
  /* public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Please, enter any NATURAL number!");
       int n = Integer.parseInt(br.readLine());
       System.out.println("Your entered number:  " + n);
       String s1 = Integer.toString(n);
       String s2 = "1" + s1 + "1";
       System.out.println("Your modified number:  " + s2);
   }
}
*/