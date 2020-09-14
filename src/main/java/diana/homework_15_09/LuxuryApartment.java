package diana.homework_15_09;

public class LuxuryApartment extends Apartment {

    LuxuryApartment(String housingComplex, double area, int roomsNumber, boolean balcony, int constructionYear) {
        this.setHousingComplex(housingComplex);
        this.setArea(area);
        this.setRoomsNumber(roomsNumber);
        this.balcony = balcony;
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
        System.out.println("Balcony is present in apartment: " + getBalcony());
    }

    public void printConstructionYear() {
        System.out.println("House is constructed in " + getConstructionYear());
    }

    @Override
    public void setConstructionYear(int constructionYear) {
        if (constructionYear > 2010 && constructionYear < currentYear) {
            this.constructionYear = constructionYear;
        } else {
            System.out.println(String.format("Wrong construction year of luxury apartment '%s'!", constructionYear));
        }
    }

    @Override
    public void setArea(double area) {
        if (area > 54) {
            this.area = area;
        } else {
            System.out.println(String.format("Luxury apartment should be bigger than '%s'!", area));
        }
    }

}
