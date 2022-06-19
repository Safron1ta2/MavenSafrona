package Interfaces;

public class TestClassWithInterface implements in1 {
    @Override
    public void display() {
        System.out.println("What?");
    }

    public static void main(String[] args) {
        TestClassWithInterface i = new TestClassWithInterface();
        i.display();
        System.out.println(in1.a);
    }
}
