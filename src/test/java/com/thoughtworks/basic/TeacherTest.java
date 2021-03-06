package com.thoughtworks.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeacherTest {
    @Test
    public void teacher_test() {
        //given
        String name = "Matt";
        int age = 30;
        String job = "Teacher";
        Teacher teacher = new Teacher(name, age, job);

        //when
        String introduce = teacher.introduce();

        //then
        String introduceRequirement = "My name is Matt. I am 30 years old. I am a Teacher.";
        assertEquals(introduceRequirement,introduce);
    }
}
