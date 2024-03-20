package com.example.springjpa_20_03;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
@Transactional
public class TestPerson implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;




    private void insertPerson(Person user) {
        entityManager.persist(user);  // insert  מכאן והלאה האוביקט מנוהל והשינוים משתקפים במסד נתונים
        user.setName("bbbb"); // השינוי ישתקף במסד הנתונים

    }

    public Person find(long id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = new Person("aaa", LocalDate.now()); // new  קים אוביקט עדין לא שמור במסד נתונים
        Student student= new Student("dddd",LocalDate.now(),54.7f,77);
      //  insertPerson(person);
      //  insertPerson(student);

         Address address = new Address();
      //  entityManager.persist(address);
         Person person1= new Person("dfsg", Month.AUGUST,new Bmi(45,876),address);
    //    entityManager.persist(person1);
        entityManager.persist(new Person("mmmm",Month.AUGUST,new Bmi(21,54),new Address()));
        person.setName("xxxx");

        //    Person person1 = entityManager.find(Person.class, 52);// חיפוש רשומה לפי מפתח ראשי
       // System.out.println(person1);
        entityManager.merge(person1);
        entityManager.find(Person.class,1); // שאילתא לפי מפתח ראשי

        List<Person> resultList = entityManager.createQuery("select p from Person p", Person.class).setMaxResults(3).getResultList();
        System.out.println(resultList);

       // entityManager.createNamedQuery("GET_ALL_persons");

    }
}
