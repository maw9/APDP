package oop_exe_2;

import java.util.Objects;

public class UseChildren {

    public static Child[] children = {
            new Male("Mike", "Male", 24),
            new Male("Kyle", "Male", 21),
            new Female("Suzy", "Female", 16),
            new Female("Jessica", "Female", 8)
    };

    public static void main(String[] args) {
        for (Child each: children) {
            each.sayGreeting();
        }
    }


}

abstract class Child implements Greeting{
    String name;
    String gender;
    int age;

    public Child(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public abstract void setAge(int age);
}

class Male extends Child{

    public Male(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String getName() {
        return "Mg " + name;
    }


    @Override
    public void setAge(int age) {
        if (age > 0 && age < 100)
            this.age = age;
    }

    @Override
    public void sayGreeting() {
        System.out.println("My name is " + getName() + ". I'm " + age + " years old and my gender is " + gender);
    }
}

class Female extends Child {

    public Female(String name, String gender, int age) {
        super(name, gender, age);
    }

    @Override
    public String getName() {
        return "Ma " + name;
    }


    @Override
    public void setAge(int age) {
        if (age > 0 && age < 100)
            this.age = age;
    }

    @Override
    public void sayGreeting() {
        System.out.println("My name is " + getName() + ". I'm " + age + " years old and my gender is " + gender);
    }
}

interface Greeting {
    public void sayGreeting();
}

