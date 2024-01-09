package com.metlife.student_runner;

import com.metlife.student.StudentType;

public class StudentRunner {
    public static void main(String[] args) {
        StudentType T1= new StudentType();
        T1.StudentRollno = 10001;
        T1.StudentName = "jack";
        T1.StudentMailid ="jack@gmail.com";
        T1.StudentPercentage = 45.2;
        StudentType.SchoolName="Global school";
        StudentType.SchoolAddress= "Chennai";

        StudentType T2= new StudentType();
        T2.StudentRollno = 10002;
        T2.StudentName = "jhon";
        T2.StudentMailid ="jhon@gmail.com";
        T2.StudentPercentage = 40.2;
        StudentType.SchoolName="Global school";
        StudentType.SchoolAddress= "Chennai";

        StudentType T3= new StudentType();
        T3.StudentRollno = 10003;
        T3.StudentName = "robert";
        T3.StudentMailid ="robert@gmail.com";
        T3.StudentPercentage = 60;
        StudentType.SchoolName="Global school";
        StudentType.SchoolAddress= "Chennai";
    }
}
