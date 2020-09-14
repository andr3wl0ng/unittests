package diana.homework_15_09;

import java.time.Year;


public abstract class Apartment implements ApartmentAbilities {
    private String housingComplex;
    protected double area;
    private int roomsNumber;
    public boolean balcony;
    protected int constructionYear;

    int currentYear = Year.now().getValue();

    public abstract void printRoomsNumber();

    public String getHousingComplex() {
        return this.housingComplex;
    }

    public double getArea() {
        return this.area;
    }

    public int getRoomsNumber() {
        return this.roomsNumber;
    }

    public boolean getBalcony() {
        return this.balcony;
    }

    public int getConstructionYear() {
        return this.constructionYear;
    }

    public void setArea(double area) {
        if (area > 20 && area < 250) {
            this.area = area;
        } else {
            System.out.println(String.format("Wrong apartment area '%s'!", area));
        }
    }

    public void setHousingComplex(String housingComplex) {
        if (!housingComplex.isEmpty()) {
            this.housingComplex = housingComplex;
        } else {
            System.out.println(String.format("Wrong housing complex '%s'!", housingComplex));
        }
    }

    public void setRoomsNumber(int roomsNumber) {
        if (roomsNumber > 0 && roomsNumber < 10) {
            this.roomsNumber = roomsNumber;
        } else {
            System.out.println(String.format("Wrong number of rooms '%s'!", roomsNumber));
        }
    }

    public void setConstructionYear(int constructionYear) {
        if (constructionYear > 1950 && constructionYear < currentYear) {
            this.constructionYear = constructionYear;
        } else {
            System.out.println(String.format("Wrong construction year '%s'!", constructionYear));
        }
    }

/*    public static void main(String[] args) {
        Apartment test1 = new Apartment();
        test1.start();
    }

    public void start() {
        System.out.println(currentYear);
    }*/

}
