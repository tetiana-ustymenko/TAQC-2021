import java.util.*;

public class T10_main {
    public static void main(String[] args) {
        Set<Integer> countries = new HashSet();
        countries.add(5);
        countries.add(7);
        countries.add(9);

        Set<Integer> countriesCitizens = new HashSet();
        countriesCitizens.add(3);
        countriesCitizens.add(5);
        countriesCitizens.add(9);
        countriesCitizens.add(12);

        System.out.println(union(countries, countriesCitizens));
        System.out.println(intersect(countries, countriesCitizens));


        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Pearl", "Eaton");
        personMap.put("Byrne", "Amber");
        personMap.put("Peters", "Samson");
        personMap.put("Thorpe", "Orest");
        personMap.put("Mcneil", "Sierra");
        personMap.put("Tierney", "Lukas");
        personMap.put("Edwin", "Tymon");
        personMap.put("Beach", "Jacqueline");
        personMap.put("Lawrence", "Orest");
        personMap.put("Woodcock", "Adrianna");

        System.out.println();
        for (Map.Entry<String, String> item : personMap.entrySet()) {
            System.out.printf("Last name: %s  First name: %s \n", item.getKey(), item.getValue());
        }

        boolean fn = false;
        Map<String, String> personFn = new HashMap<String, String>();

        for (Map.Entry<String, String> i : personMap.entrySet()) {
            for (Map.Entry<String, String> j : personMap.entrySet()) {
                if (i.getValue().equals(j.getValue()) && !(i.getKey().equals(j.getKey()))) {
                    personFn.put(i.getKey(), i.getValue());
                    personFn.put(j.getKey(), j.getValue());
                    fn = true;
                }
            }
        }
        if (fn) {
            System.out.println();
            System.out.println("Persons with the same first name:");
            for (Map.Entry<String, String> i : personFn.entrySet()) {
                System.out.printf("Last name: %s  First name: %s  \n", i.getKey(), i.getValue());
            }
        } else {
            System.out.println();
            System.out.println("No two persons with the same first name.");
        }
        while (personMap.containsValue("Orest")) {
            for (Map.Entry<String, String> i : personMap.entrySet()) {
                if (i.getValue().equals("Orest")) {
                    personMap.remove(i.getKey());
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("Without Orest:  ");
        for (Map.Entry<String, String> i : personMap.entrySet()) {
            System.out.printf("Last name: %s  First name: %s \n", i.getKey(), i.getValue());
        }

    }

    public static Set union(Set set1, Set set2) {
        Set<Object> union = new HashSet();

        for (Object temp : set1) {
            union.add(temp);
        }
        for (Object temp : set2) {
            union.add(temp);
        }
        System.out.println();
        System.out.println("The union of two sets:  ");
        return union;
    }


    public static Set intersect(Set set1, Set set2) {
        Set<Object> intersect = new HashSet();

        for (Object temp : set1) {
            boolean is = set2.contains(temp);
            if (is) {
                intersect.add(temp);
            }
        }
        System.out.println();
        System.out.println("The intersect of two sets:  ");
        return intersect;
    }
}
