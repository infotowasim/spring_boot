package com.wasim.OneToOneMapping1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_student")
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String studentAbout;

    @OneToOne(mappedBy = "student")
    private Laptop laptop;

    public Student(int studentId, String studentName, String studentAbout, Laptop laptop) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAbout = studentAbout;
        this.laptop = laptop;
    }

    public Student(){

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAbout() {
        return studentAbout;
    }

    public void setStudentAbout(String studentAbout) {
        this.studentAbout = studentAbout;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAbout='" + studentAbout + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
