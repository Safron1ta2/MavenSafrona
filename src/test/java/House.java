public class House {
    double square;
    int quantityOfWindows;
    String colour;

    static int count;

    public void  getEelecricity(){
        System.out.println();
    }


    public static void main(String[] args) {
        House houseInBrovary = new House();
        houseInBrovary.colour = "red";
        houseInBrovary.quantityOfWindows = 10;
        houseInBrovary.square = 60.5;
        System.out.println("This house has square " + houseInBrovary.square);
        System.out.println("This house has " + houseInBrovary.quantityOfWindows +" windows");
        System.out.println("This house is  " + houseInBrovary.colour+"\n");
        count++;

        House houseInKyiv = new House();
        houseInKyiv.colour = "brown";
        houseInKyiv.quantityOfWindows = 6;
        houseInKyiv.square = 40.5;
        System.out.println("This house has square " + houseInKyiv.square);
        System.out.println("This house has " + houseInKyiv.quantityOfWindows +" windows");
        System.out.println("This house is  " + houseInKyiv.colour + "\n");
        count++;
    }
}
