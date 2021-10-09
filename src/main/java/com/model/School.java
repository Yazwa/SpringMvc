package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {

    @Id
    private int schoolId;

    private String schoolName;

    public School() {

    }

    public School(int schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolId=" + schoolId +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    //CREATE TABLE School (schoolId int, schoolName varchar(255));

    //ALTER TABLE User ADD schoolId int;
}
