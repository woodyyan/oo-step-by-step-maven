//package com.thoughtworks.practice02;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class Practice02Test {
//    @Test
//    public void should_person_have_name_and_age() {
//        Person person = new Person("Tom", 21);
//
//        assertEquals("Tom", person.getName());
//        assertEquals(21, person.getAge());
//    }
//
//    @Test
//    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() {
//        Person tom = new Person("Tom", 21);
//        String introduce = tom.introduce();
//
//        assertEquals("My name is Tom. I am 21 years old.", introduce);
//    }
//
//    @Test
//    public void should_student_have_name_age_and_class_number() {
//        Student tom = new Student("Tom", 21, 2);
//
//        assertEquals("Tom", tom.getName());
//        assertEquals(21, tom.getAge());
//        assertEquals(2, tom.getKlass());
//    }
//
//    @Test
//    public void should_student_introduce_with_class() {
//        Student tom = new Student("Tom", 21, 2);
//
//        assertEquals("I am a Student. I am at Class 2.", tom.introduce());
//    }
//}
