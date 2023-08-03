package com.wasim.OneToOneMapping1.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_laptop")
public class Laptop {

    @Id
    private int laptopId;
    private String modelNumber;
    private String laptopBrand;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Laptop(int laptopId, String modelNumber, String laptopBrand, Student student) {
        this.laptopId = laptopId;
        this.modelNumber = modelNumber;
        this.laptopBrand = laptopBrand;
        this.student = student;
    }

    public Laptop(){

    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", modelNumber='" + modelNumber + '\'' +
                ", laptopBrand='" + laptopBrand + '\'' +
                ", student=" + student +
                '}';
    }
}
