package com.designs.builder.test;

import com.designs.builder.User;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("vijay", "konkata")
                        .age(40)
                        .phone("123456")
                        .address("hyd")
                        .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Dhanu", "Konkata")
                        .age(11)
                        //.phone("456789")
                        .address("bang")
                        .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Via", "Konkat")
                        //No age
                        //No phone
                        //no address
                        .build();

        System.out.println(user3);
    }
}