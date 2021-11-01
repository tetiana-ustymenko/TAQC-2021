
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class T8_main {
    public static void main(String[] args) {

        SalariedEmployee sEm1 = new SalariedEmployee("Gabriel", "150-36-XXXX", 25600);
        SalariedEmployee sEm2 = new SalariedEmployee("Elliott", "625-99-XXXX", 30450);
        SalariedEmployee sEm3 = new SalariedEmployee("Luke", "356-63-XXXX", 40900);
        ContractEmployee cEm1 = new ContractEmployee("Felix", "0587768570780", 186, 38);
        ContractEmployee cEm2 = new ContractEmployee("Matthew ", "5885022951561", 254, 35);
        Employee[] employees = new Employee[]{
                sEm1, sEm2, sEm3, cEm1, cEm2
        };


        System.out.println("Unsorted list of employees: ");
        sEm1.output();
        sEm2.output();
        sEm3.output();
        cEm1.output();
        cEm2.output();
        System.out.println();

        float[] arr = new float[5];
        arr[0] = sEm1.calculatePay();
        arr[1] = sEm2.calculatePay();
        arr[2] = sEm3.calculatePay();
        arr[3] = cEm1.calculatePay();
        arr[4] = cEm2.calculatePay();

        float tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        System.out.println("Sorted average monthly wage: " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Sorted list of employees: ");
        sEm1.output2();
        System.out.println("Average monthly wage: " + arr[0]);
        sEm2.output2();
        System.out.println("Average monthly wage: " + arr[1]);
        sEm3.output2();
        System.out.println("Average monthly wage: " + arr[2]);
        cEm1.output2();
        System.out.println("Average monthly wage: " + arr[3]);
        cEm2.output2();
        System.out.println("Average monthly wage: " + arr[4]);
    }
}

