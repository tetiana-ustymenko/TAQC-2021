
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T8_main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        try (BufferedReader br = new BufferedReader(new FileReader("employee.txt"))) {
            String s;
            int i = -1;

            while ((s = br.readLine()) != null) {
                String[] words = s.split(" ");
                SalariedEmployee sEm = new SalariedEmployee();
                ContractEmployee cEmt = new ContractEmployee();

                if (words.length == 3) {
                    ++i;
                    float temp = Float.parseFloat(words[2]);
                    employees[i] = new SalariedEmployee(words[0], words[1], temp);
                }

                if (words.length == 4) {
                    ++i;
                    int temp = Integer.parseInt(words[2]);
                    int temp2 = Integer.parseInt(words[2]);
                    employees[i] = new ContractEmployee(words[0], words[1], temp, temp2);
                }
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
/*
        SalariedEmployee sEm1 = new SalariedEmployee("Gabriel", "150-36-XXXX", 25600);
        SalariedEmployee sEm2 = new SalariedEmployee("Elliott", "625-99-XXXX", 30450);
        SalariedEmployee sEm3 = new SalariedEmployee("Luke", "356-63-XXXX", 40900);
        ContractEmployee cEm1 = new ContractEmployee("Felix", "0587768570780", 186, 38);
        ContractEmployee cEm2 = new ContractEmployee("Matthew ", "5885022951561", 254, 35);
        Employee[] employees = new Employee[]{
                sEm1, sEm2, sEm3, cEm1, cEm2
        };*/

        QuickSort(employees, 0, employees.length - 1);

        for (Employee emp : employees) {
            emp.output();
        }

    }

    static int Partitioning(Employee arr[], int start, int end) {
        float x = arr[end].calculatePay();
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j].calculatePay() <= x) {
                i++;
                Employee temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Employee temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    static void QuickSort(Employee employees[], int left, int right) {
        int s;
        if (left < right) {
            s = Partitioning(employees, left, right);
            QuickSort(employees, left, s - 1);
            QuickSort(employees, s + 1, right);
        }
    }
}
