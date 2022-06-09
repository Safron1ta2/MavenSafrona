public class Person {

    int age;
    String fullName;

    public void move(){
        System.out.println("Person рухається");
    }

    public void talk(){
        System.out.println("Person говорить");
    }

    public Person(int age, String fullName){
        this.age = age;
        this.fullName = fullName;
    }

    public Person(){

    }

    public static void main(String[] args) {
        Person zeroPerson = new Person(54, "Денчік");
        zeroPerson.move();
        zeroPerson.talk();

        System.out.println("Імя: " + zeroPerson.fullName);
        System.out.println("Вік: " + zeroPerson.age + "\n");

        Person firstPerson = new Person();
        firstPerson.talk();
        firstPerson.move();


    }
}
