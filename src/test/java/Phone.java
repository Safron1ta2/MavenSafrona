public class Phone {

    String number;
    String model;
    double weight;

    public Phone (String number, String model, double weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone (String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name){
        System.out.println("Вам телефонує " + name +"\n");
    }
    public String getNumber(){
        return number;
    }

    public static void main(String[] args) {
        Phone Samsung = new Phone ("+380674444444", "Samsung", 200.5);
        System.out.println("Телефон " + Samsung.model + ". Номер телефону: " + Samsung.number + ". Вага: " + Samsung.weight + "г.");
        Samsung.receiveCall("Валерій");
        Samsung.getNumber();

        Phone OnePlus = new Phone("+380635444444", "OnePlus", 190.8);
        System.out.println("Телефон " + OnePlus.model + ". Номер телефону " + OnePlus.number + ". Вага: " + OnePlus.weight + "г.");
        OnePlus.receiveCall("Богдан");
        OnePlus.getNumber();

        Phone Nokia = new Phone("+380635444455", "Nokia", 1000);
        System.out.println("Телефон " + Nokia.model + ". Номер телефону " + Nokia.number + ". Вага: " + Nokia.weight + "г.");
        Nokia.receiveCall("Аліна");
        Nokia.getNumber();
    }

}
