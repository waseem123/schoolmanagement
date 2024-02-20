package com.infostack.schoolmanagement.Models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roll_no", nullable = false)
    private Long rollNo;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_city")
    private String city;

    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
