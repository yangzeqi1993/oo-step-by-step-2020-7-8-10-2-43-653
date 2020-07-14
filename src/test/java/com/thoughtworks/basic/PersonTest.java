package com.thoughtworks.basic;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void hello_world_test() {
        //given
        String name = "Tom";
        int age = 21;
        Person person = new Person(name, age);

        //when
        String introduce = person.introduce();

        //then
        assertEquals("My name is Tom. I am 21 years old.", introduce);
    }
}
