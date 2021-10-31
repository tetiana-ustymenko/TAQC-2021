package com.company;

import com.company.Dog;
import com.company.DogBreed;
import com.company.HTTPErrors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T5_main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //1)
        System.out.println("Please, enter first float number: ");
        float firstFloat = Float.parseFloat(br.readLine());
        System.out.println("PLease, enter second float number: ");
        float secondFloat = Float.parseFloat(br.readLine());
        System.out.println("Please, enter third float number: ");
        float thirdFloat = Float.parseFloat(br.readLine());

        if (firstFloat >= -5 && firstFloat <= 5 &&
                secondFloat >= -5 && secondFloat <= 5 &&
                thirdFloat >= -5 && thirdFloat <= 5) {
            System.out.println("All entered float numbers belong to the range [-5;5]");
        } else {
            System.out.println("Not all float numbers belong to the range [-5;5]");
        }

        //2)
        int[] intNumbers = new int[3];

        for (int i = 0; i < intNumbers.length; i++) {
            System.out.println("Please, enter " + (i + 1) + " integer number: ");
            intNumbers[i] = Integer.parseInt(br.readLine());
        }

        int intMax = intNumbers[0];
        int iMax = 0;
        int intMin = intNumbers[0];
        int iMin = 0;
        int i = 0;
        int j = 0;

        while (i < intNumbers.length) {
            if (intNumbers[i] > intMax) {
                intMax = intNumbers[i];
                iMax = i;
            }
            i++;
        }
        System.out.println("Maximum number among integers is " + intMax);

        while (j < intNumbers.length) {
            if (intNumbers[j] < intMin) {
                intMin = intNumbers[j];
                iMin = j;
            }
            j++;
        }
        System.out.println("Minimum number among integers is " + intMin);
        System.out.println();

        //3)

        HTTPErrors httpError = HTTPErrors.ERROR499;
        System.out.println("Error name is:  " + httpError.errorName());
        System.out.println();


        //2 part
        System.out.println("2)");
        Dog firstDog = new Dog("Oskar", DogBreed.Labrador, 2);
        Dog secondDog = new Dog("Duke", DogBreed.Spaniel, 3);
        Dog thirdDog = new Dog("Simba", DogBreed.Poodle, 4);

        if (firstDog.getName().equals(secondDog.getName()) ||
                firstDog.getName().equals(thirdDog.getName()) ||
                secondDog.getName().equals(thirdDog.getName())) {
            System.out.println("There is two dogs with the same name!");
        } else {
            System.out.println("There is no two dogs with the same name!");
        }

        if (firstDog.getAge() > secondDog.getAge() && firstDog.getAge() > thirdDog.getAge()) {
            System.out.println(firstDog.getName() + " is the oldest dog. Its breed is " + firstDog.getBreed() + ".");
            System.out.println("It is " + firstDog.getAge() + " years old.");
        } else if (secondDog.getAge() > firstDog.getAge() && secondDog.getAge() > thirdDog.getAge()) {
            System.out.println(secondDog.getName() + " is the oldest dog. Its breed is " + secondDog.getBreed() + ".");
            System.out.println("It is " + secondDog.getAge() + " years old.");
        } else if (thirdDog.getAge() > firstDog.getAge() && thirdDog.getAge() > secondDog.getAge()) {
            System.out.println(thirdDog.getName() + " is the oldest dog. Its breed is " + thirdDog.getBreed() + ".");
            System.out.println("It is " + thirdDog.getAge() + " years old.");
        }
    }
}


