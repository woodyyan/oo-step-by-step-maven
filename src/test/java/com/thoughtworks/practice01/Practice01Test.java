package com.thoughtworks.practice01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Practice01Test {
    @Test
    public void should_person_have_name_and_age() {
        Person person = new Person("Tom", 21);

        assertEquals("Tom", person.getName());
        assertEquals(21, person.getAge());
    }

    // 打开注释以继续
//    @Test
//    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() {
//        Person tom = new Person("Tom", 21);
//
//        String introduce = tom.introduce();
//        assertEquals("My name is Tom. I am 21 years old.", introduce);
//    }
}
