package com.example.springjpa_20_03;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

@Table(name = "persons")
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_person", nullable = false )
    private Long id;

  @Basic(fetch = FetchType.LAZY)
    private  String name;
    private LocalDate date;
     @Enumerated(EnumType.STRING)
    private Month month;

     @Embedded
     private  Bmi bmi;

private int num;
//    @Temporal(TemporalType.TIME)
//    private Date date1;

    public Person() {
    }

    public Person( String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public Person(String mmmm, Month august, Bmi bmi, Address address) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
