//package com.thoughtworks.practice10;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.LinkedHashSet;
//
//import static org.junit.Assert.*;
//
//
//public class Practice10Test {
//    private Klass klass2;
//    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//
//    @Before
//    public void setup() {
//        klass2 = new Klass(2);
//        System.setOut(new PrintStream(outContent));
//    }
//
//    @Test
//    public void should_person_have_id_name_and_age() {
//        Person person = new Person(1, "Tom", 21);
//
//        assertEquals("Tom", person.getName());
//        assertEquals(21, person.getAge());
//    }
//
//    @Test
//    public void should_person_with_same_id_be_same_one() {
//        Person person1 = new Person(1, "Tom", 21);
//        Person person2 = new Person(1, "Tom", 21);
//
//        assertEquals(person1, person2);
//    }
//
//    @Test
//    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() {
//        Person tom = new Person(1, "Tom", 21);
//        String introduce = tom.introduce();
//
//        assertEquals("My name is Tom. I am 21 years old.", introduce);
//    }
//
//    @Test
//    public void should_class_have_a_number() {
//        assertEquals(2, klass2.getNumber());
//    }
//
//    @Test
//    public void should_class_get_display_name() {
//        assertEquals("Class 2", klass2.getDisplayName());
//    }
//
//    @Test
//    public void should_class_not_assign_a_student_as_leader_when_student_is_not_a_member() {
//        Student jerry = new Student(1, "Jerry", 8, new Klass(5));
//
//        klass2.assignLeader(jerry);
//
//        assertEquals("It is not one of us.\n", systemOut());
//        assertNotSame(jerry, klass2.getLeader());
//    }
//
//    private String systemOut() {
//        return outContent.toString();
//    }
//
//    @Test
//    public void should_class_assign_a_member_student_as_leader() {
//        Student jerry = new Student(1, "Jerry", 8, klass2);
//
//        klass2.appendMember(jerry);
//        klass2.assignLeader(jerry);
//
//        assertEquals(jerry, klass2.getLeader());
//    }
//
//    @Test
//    public void should_student_have_name_age_and_class_number() {
//        Student tom = new Student(1, "Tom", 21, klass2);
//
//        assertEquals("Tom", tom.getName());
//        assertEquals(21, tom.getAge());
//        assertEquals(klass2, tom.getKlass());
//    }
//
//    @Test
//    public void should_student_introduce_with_class() {
//        Student tom = new Student(1, "Tom", 21, klass2);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Student. I am at Class 2.", tom.introduce());
//    }
//
//    @Test
//    public void should_student_introduce_itself_as_class_leader() {
//        Student tom = new Student(1, "Tom", 21, klass2);
//
//        klass2.appendMember(tom);
//        klass2.assignLeader(tom);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2.", tom.introduce());
//    }
//
//    @Test
//    public void should_teacher_have_name_and_age_and_classes() {
//        LinkedHashSet<Klass> klasses = new LinkedHashSet<>();
//        klasses.add(klass2);
//        Teacher tom = new Teacher(1, "Tom", 21, klasses);
//
//        assertEquals("Tom", tom.getName());
//        assertEquals(21, tom.getAge());
//        assertEquals(1, tom.getClasses().size());
//        assertEquals(klass2, tom.getClasses().toArray()[0]);
//    }
//
//    @Test
//    public void should_teacher_introduce_itself_with_which_classes_it_teaches() {
//        LinkedHashSet<Klass> klasses = new LinkedHashSet<>();
//        Klass klass3 = new Klass(3);
//        klasses.add(klass2);
//        klasses.add(klass3);
//
//        Teacher tom = new Teacher(1, "Tom", 21, klasses);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3.", tom.introduce());
//    }
//
//    @Test
//    public void should_teacher_introduce_itself_with_no_class_teaching() {
//        Teacher tom = new Teacher(1, "Tom", 21);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.", tom.introduce());
//    }
//
//    @Test
//    public void should_teacher_isTeaching_return_true_when_the_student_is_in_any_classes_the_teacher_teaches() {
//        LinkedHashSet<Klass> klasses = new LinkedHashSet<>();
//        Klass klass3 = new Klass(3);
//        klasses.add(klass2);
//        klasses.add(klass3);
//
//        Teacher tom = new Teacher(1, "Tom", 21, klasses);
//        Student jerry = new Student(1, "Jerry", 8, klass2);
//
//        assertTrue(tom.isTeaching(jerry));
//    }
//
//    @Test
//    public void should_teacher_isTeaching_return_false_when_the_student_is_not_in_all_the_classes_the_teacher_teaches() {
//        LinkedHashSet<Klass> klasses = new LinkedHashSet<>();
//        klasses.add(klass2);
//
//        Teacher tom = new Teacher(1, "Tom", 21, klasses);
//        Student jerry = new Student(1, "Jerry", 8, new Klass(3));
//
//        assertFalse(tom.isTeaching(jerry));
//    }
//
//    @Test
//    public void should_teacher_introduce_a_student_it_teaches() {
//        LinkedHashSet<Klass> klasses = new LinkedHashSet<>();
//        klasses.add(klass2);
//
//        Teacher tom = new Teacher(1, "Tom", 21, klasses);
//        Student jerry = new Student(1, "Jerry", 8, klass2);
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.", tom.introduceWith(jerry));
//    }
//
//    @Test
//    public void should_teacher_introduce_a_student_it_does_not_teach() {
//        LinkedHashSet<Klass> klasses = new LinkedHashSet<>();
//        klasses.add(new Klass(1));
//
//        Teacher tom = new Teacher(1, "Tom", 21, klasses);
//        Student jerry = new Student(1, "Jerry", 8, new Klass(2));
//
//        assertEquals("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.", tom.introduceWith(jerry));
//    }
//}
