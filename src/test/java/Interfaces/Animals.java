package Interfaces;

public class Animals implements Info {
    String kind;
    int age;
    public Animals(String kind, int age){
        this.kind = kind;
        this.age = age;
    }

    @Override
    public void showInfo() {
        System.out.println("This is " + kind + ". It's " + age + ".");
    }
}
