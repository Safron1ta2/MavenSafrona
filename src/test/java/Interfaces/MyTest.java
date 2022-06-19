package Interfaces;

public class MyTest {
    public static void main(String[] args) {
        Animals firstAnimal = new Animals("tiger", 4);
        Person firstPerson = new Person("Hubert Blaine Wolfeschlegelsteinhausenbergerdorff Sr.", 99);

        firstAnimal.showInfo();
        firstPerson.showInfo();
    }
}
