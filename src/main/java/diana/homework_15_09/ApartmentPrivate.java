package diana.homework_15_09;

public class ApartmentPrivate extends Apartment {

    ApartmentPrivate(String housingComplex, double area, int roomsNumber, boolean balcony) {
        this.setHousingComplex(housingComplex);
        this.setArea(area);
        this.setRoomsNumber(roomsNumber);
        this.setBalcony(balcony);
        this.setConstructionYear(constructionYear);
    }

    public void printHousingComplex() {
        System.out.println("Housing complex is " + getHousingComplex());
    }

    public void printArea() {
        System.out.println("Apartment area is " + getArea());
    }

    public void printRoomsNumber() {
        System.out.println("Number of rooms in apartment is " + getRoomsNumber());
    }

    public void printBalconyExists() {
        System.out.println("Balcony is present in apartment " + getBalcony());
    }

    public void printConstructionYear() {
        System.out.println("House is constructed in " + getConstructionYear());
    }
}
