package com.example.springjpa_20_03;

import jakarta.persistence.Entity;

import java.time.LocalDate;
@Entity
public class Student extends Person{

    private float mark;
    private float mem;

    public Student() {
    }

    public Student(String name, LocalDate date, float mark, float mem) {
        super(name, date);
        this.mark = mark;
        this.mem = mem;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public float getMem() {
        return mem;
    }

    public void setMem(float mem) {
        this.mem = mem;
    }
}
