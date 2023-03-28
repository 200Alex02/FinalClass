package Oop;

import Oop.Animals;

public class Bird extends Animals {
    private String name;
    private int age;
    private int id;

    public Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println("Птица ест");
    }

    @Override
    public void voice() {
        System.out.println("Звук птицы");
    }

    public int getId(){

        return hashCode();
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }
}
