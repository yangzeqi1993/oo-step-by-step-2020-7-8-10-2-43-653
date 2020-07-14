package com.thoughtworks.basic;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tom",18);
        System.out.println(person.introduce());

        Klass classOne = new Klass(1);
        Student student = new Student("Tom",18,classOne);
        System.out.println(student.introduce());
    }
}
