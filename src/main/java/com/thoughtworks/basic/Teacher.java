package com.thoughtworks.basic;

public class Teacher extends Person {
    private String job ;

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String introduce (){
        return super.introduce() + " I am a " + this.getJob() + ".";
    }
}
