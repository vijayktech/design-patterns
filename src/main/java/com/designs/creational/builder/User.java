package com.designs.creational.builder;

public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    // UserBuilder object is passing to constructor
    public User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

    // Inner class UserBuilder with static
     public static class UserBuilder{
         private final String firstName; // required
         private final String lastName; // required
         private int age; // optional
         private String phone; // optional
         private String address; // optional

         public UserBuilder(String firstName, String lastName){
             this.firstName = firstName;
             this.lastName = lastName;
         }

         public UserBuilder age(int age){
             this.age = age;
             return this;
         }

         public UserBuilder phone(String phone){
             this.phone = phone;
             return this;
         }

         public UserBuilder address(String address){
             this.address = address;
             return this;
         }

         // Return the finally consrcuted User object
         public User build(){
             User userObj = new User(this);
             validateUserObject(userObj);
             return userObj;
         }

        private void validateUserObject(User userObj) {
             // Do some validations on User Object
        }
    } // end of Inner class UserBuilder
}
