package org.play.ground.atomic.data;


import javax.persistence.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by scruz on 13/08/18.
 */
@Entity
@Table(name="student")
public class Student implements Serializable {

    @Id
    @Column(name="student_id")
    private int id;

    @Column(name = "student_age")
    private int age;

    @Column(name = "student_name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
