package com.thoughtworks.basic;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KlassTest {
    @Test
    public void klass_test() {
        //given
        Klass klass = new Klass(1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tom", 21, klass));
        students.add(new Student("John", 22, klass));
        students.add(new Student("Kathy", 20, klass));
        Teacher teacher = new Teacher("Matt", 30, "Teacher");
        klass.setTeacher(teacher);
        klass.setStudents(students);

        //when
        String teacherIntroduce = klass.getTeacher().introduce();
        String studentTomIntroduce = klass.getStudents().get(0).introduce();
        String studentJohnIntroduce = klass.getStudents().get(1).introduce();
        String studentKathyIntroduce = klass.getStudents().get(2).introduce();

        //then
        String teacherIntroduceRequirement = "My name is Matt. I am 30 years old. I am a Teacher.";
        assertEquals(teacherIntroduceRequirement,teacherIntroduce);

        String studentTomIntroduceRequirement = "My name is Tom. I am 21 years old. I am a Student of Class 1.";
        assertEquals(studentTomIntroduceRequirement,studentTomIntroduce);

        String studentJohnIntroduceRequirement = "My name is John. I am 22 years old. I am a Student of Class 1.";
        assertEquals(studentJohnIntroduceRequirement,studentJohnIntroduce);

        String studentKathyIntroduceRequirement = "My name is Kathy. I am 20 years old. I am a Student of Class 1.";
        assertEquals(studentKathyIntroduceRequirement,studentKathyIntroduce);
    }
}
