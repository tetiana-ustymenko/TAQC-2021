package com.company;

import com.company.Book;

public class T6_main {
    public static void main(String[] args) {

        Book b1 = new Book();
        b1.input("Macbeth", "William Shakespeare", 1992, "Waterloo",
                "Sonnets", 128, 80.75);

        Book b2 = new Book();
        b2.input("Kobzar", "Taras Shevchenko", 2020, "Poltava",
                "Poetry", 352, 581.00);

        System.out.println("Book#1 : ");
        b1.output();
        System.out.println();
        System.out.println("Book#2 : ");
        b2.output();

        System.out.println();
        System.out.println("Is Book#1 cheaper than Book#2 ?");
        System.out.println(b1.compareBookPrice(b2));

        System.out.println();
        System.out.println("Is Book#1 newer than Book#2 ?");
        System.out.println(b1.compareBookYear(b2));
    }
}


