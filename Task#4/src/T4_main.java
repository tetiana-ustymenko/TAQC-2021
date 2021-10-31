public class T4_main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        firstPerson.setName("Anna");
        firstPerson.setBirthYear(2002);

        Person secondPerson = new Person("Pavlo", 2001);

        Person thirdPerson = new Person();
        thirdPerson.input("Nina", 2002);
        //thirdPerson.input("Nina",2000);

        Person fourthPerson = new Person("Mark", 2003);

        Person fifthPerson = new Person("Marta", 2004);

        firstPerson.output();
        secondPerson.output();
        thirdPerson.output();
        fourthPerson.output();
        fifthPerson.output();
    }
}
