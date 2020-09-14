package diana.homework_15_09;


public class createApartment {
    public static void main(String[] args) {
        LuxuryApartment myApartment = new LuxuryApartment("Lakes", 56.5, 2, true, 2018);

        myApartment.printHousingComplex();
        myApartment.printConstructionYear();
        myApartment.printArea();
        myApartment.printBalconyExists();
        myApartment.printRoomsNumber();
    }
}
