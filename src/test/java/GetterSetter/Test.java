package GetterSetter;
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Safron");
        System.out.println(person.getName());
        person.setAge(99);
        System.out.println(person.getAge());
    }
}
