package com.thoughtworks.basic;

public class Student extends Person {

    private Klass classNumber;

    public Student(String name, int age, Klass classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public Klass getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Klass classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String introduce (){
        return super.introduce() + " I am a Student of Class " + this.getClassNumber().getNumber() + ".";
    }
}
