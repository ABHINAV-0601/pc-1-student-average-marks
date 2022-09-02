package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student s1 = new Student("Abhishek",2,250);
        Student s2 = new Student("Vaibhav",12,300);
        Student s3 = new Student("Diwakar",15,275);
        Student s4 = new Student("Rudra",20,175);
        Student s5 = new Student("Samantha",22,265);
        Student s6 = new Student("Salman",25,295);

        //create HashSet object and add all the students object inside it
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        studentSet.add(s3);
        studentSet.add(s4);
        studentSet.add(s5);
        studentSet.add(s6);

        //return the HashSet object
        return studentSet;
    }


    public static Set<String> getAllStudentNameInSorted(Set<Student> studentSet){
        //Create a TreeSet object

        //Use Iterator object of type <Student> to iterate through the studentSet

        //get all the name and add it inside the TreeSet object

      //return the TreeSet object;
        return null;
    }

    public static Map<String,Integer> calculateAverage(Set<Student> studentSet){
        //create a HashMap object of type <String,Integer>

        //Use Iterator object of type <Student>to iterate through the studentSet

        //retrieve the Student object from the iterator

        //Use getter method to get TotalMarks of each student. calculate the average

        //add the student name and average marks in the HashMap object created in the
        //first line and return the map

           return null;

    }

    public static void main(String[] args) {
        Set<Student> studentName = getAllStudentData();
        System.out.println(studentName);
        System.out.println(getAllStudentNameInSorted(studentName));
        System.out.println(calculateAverage(studentName));
    }


}
