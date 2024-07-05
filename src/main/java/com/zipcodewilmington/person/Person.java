package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;

    // default has no parameters
    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }
    // constructor age
    public Person(int age) {
        this.age = age;
    }

    //constructor with name
    public Person(String name) {
        this.name = name;
    }

    // constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // these aren't constructors, they are methods
    // *******************************************

    // use this. because it's in the class itself
    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
