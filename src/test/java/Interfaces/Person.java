package Interfaces;

public class Person implements Info {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void showInfo() {
        System.out.println("This is " + this.name + ". He/She is " + this.age + ".");
    }
}
