package com.company;

public class Dog {
    private String name;
    private DogBreed breed;
    private int age;

    public Dog() {
    }
    public Dog(String name) {
        this.name = name;
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name, DogBreed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public DogBreed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

}

