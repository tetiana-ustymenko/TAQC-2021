import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    private String name;
    private int birthYear;

    public Person() {
    }

    Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public void setName(String name) {

        this.name = name;
    }


    public String getName() {

        return name;
    }


    public void setBirthYear(int birthYear) {

        this.birthYear = birthYear;
    }

    public int getBirthYear() {

        return birthYear;
    }



    public int age() {
        int age = 2021 - birthYear;
        return age;
    }

    /*
    public int age (){
       LocalDate a = LocalDate.now();
        int age = a.getYear()-birthYear;
        return age;
    }*/

    /*public int calculateAge(
            LocalDate birthDate,
            LocalDate currentDate) {
        // validate inputs ...
        return Period.between(birthDate, currentDate).getYears();
    }*/


    public void input(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void output() {
        System.out.println("Name of the person is  " + this.name + " and the birthday year is  " + this.birthYear);
    }

    public void changeName(String name) {
        System.out.print("A name of the person " + this.name + " changed to ");
        this.name = name;
        System.out.println(this.name);
    }

}

