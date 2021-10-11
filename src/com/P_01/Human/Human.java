package com.P_01.Human;

import java.util.Map;

public class Human {
    private static Map<Integer, Human> allHumans;
    private static int ID = 0;
    private int hID;
    private String name;
    private int age;
    private Sex sex;

    public Human(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        ID++;
        this.hID = ID;
    }

    public int gethID() {
        return hID;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Sex getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (name == null ? 0 : name.hashCode());
        result = 37 * result + age;
        result = 37 * result + (sex == (Sex.MALE) ? 10 : 20);
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;

        Human humanTmp = (Human) obj;

        return name.equals(humanTmp.name) &&
                age == humanTmp.age &&
                sex == humanTmp.sex;
    }
}
