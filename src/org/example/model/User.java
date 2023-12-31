package org.example.model;

public class User {
    private final String name;
    private final int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User createUser(String name, int age) {
        return new User(name, age);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
               "name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
