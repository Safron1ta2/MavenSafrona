public class Reader {

    String firstName;
    String secondName;
    String lustName;
    int tiсketNumber;
    String phoneNumber;

    public Reader(String firstName,  String lustNamedName, String secondName, String phoneNumber, int tiсketNumber){
        this.firstName = firstName;
        this.lustName = lustNamedName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.tiсketNumber = tiсketNumber;
    }

    public static void main(String[] args) {
        Reader safron = new Reader("Серафим", "Тугай", "Миколайовч", "+380988888888", 1);
        safron.takeBooks(4, 4);
        safron.returnBooks(10, 3);

    }

    public void takeBooks(int quantityTaken, int quantityTaking){
        int sumBooks = quantityTaken + quantityTaking;
        int limitBooks = 5;
        int fine = 50;
        int diferenceOfSumAndLimit = sumBooks - limitBooks;
        int totalFine = 0;
        System.out.println("Читач " + lustName + " взяв " + quantityTaking + " книги. Загалом читач взяв " + sumBooks + " книг.");
        if (sumBooks > limitBooks){
            for (int i = 0; i < diferenceOfSumAndLimit; i++) {
                totalFine = diferenceOfSumAndLimit * fine;
            }
            System.out.println("Ліміт перевищено на " + diferenceOfSumAndLimit + " книг." + " Штраф становить " + totalFine + "грн" + "\n");
        }
    }

    public void returnBooks(int quantityTaken, int quantityReturning){
        int leftBooks = quantityTaken - quantityReturning;
        int limitBooks = 5;
        int fine = 50;
        int diferenceOfLeftAndLimit = leftBooks - limitBooks;
        int diferenceOfTakenAndLimit = quantityTaken - limitBooks;
        int totalFine = 0;
        System.out.println("Читач " + lustName + " повернув " + quantityReturning + " книг. Загалом в читача лишається " + leftBooks + " книг.");
        if(quantityTaken > limitBooks){
            for (int i = 0; i < quantityTaken; i++) {
                totalFine = diferenceOfTakenAndLimit * fine;
            }
            System.out.println("Загалом читач взяв " + quantityTaken + " книг. Ліміт перевищено на " + diferenceOfTakenAndLimit + " книг. Штраф становить " + totalFine + "грн." + "\n");
        }
        if(leftBooks > limitBooks){
            for (int i = 0; i < diferenceOfLeftAndLimit; i++) {
                totalFine = diferenceOfLeftAndLimit * fine;
            }
            System.out.println("Читач " + lustName + " повернув " + quantityReturning + " книги. Книг залишилось " + leftBooks +". Ліміт перевищено на " + diferenceOfLeftAndLimit + " книги.");
            System.out.println("Штраф становить " + totalFine + "грн.");
        }

    }

}


