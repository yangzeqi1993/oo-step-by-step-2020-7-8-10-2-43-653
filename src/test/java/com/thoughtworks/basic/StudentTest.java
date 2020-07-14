package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void hello_world_test() {
        //given
        String name = "Tom";
        int age = 21;
        Klass classOne = new Klass(2);
        Student student = new Student(name, age, classOne);

        //when
        String introduce = student.introduce();

        //then
        String introduceRequirement = "My name is Tom. I am 21 years old. I am a Student of Class 2.";
        assertEquals(introduceRequirement,introduce);
    }
}
