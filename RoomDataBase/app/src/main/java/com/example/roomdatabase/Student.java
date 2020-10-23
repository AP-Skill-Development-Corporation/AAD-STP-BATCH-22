package com.example.roomdatabase;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Student
{

    @ColumnInfo(name = "rollno")
    @PrimaryKey
    @NonNull
    String rollno;

    @ColumnInfo(name = "name")
    String name;

    public Student(String rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }
}
