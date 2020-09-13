package diana.homework_15_09;
import java.time.Year;


public abstract class Apartment implements ApartmentAbilities {
    String housingComplex;
    double area;
    int roomsNumber;
    boolean balcony;
    int constructionYear;

    int currentYear = Year.now().getValue();

    public abstract void printRoomsNumber();

    String getHousingComplex() {
        return this.housingComplex;
    }

    double getArea() {
        return this.area;
    }

    int getRoomsNumber() {
        return this.roomsNumber;
    }

    boolean getBalcony() {
        return this.balcony;
    }

    int getConstructionYear() {
        return this.constructionYear;
    }

    void setArea(double area) {
        if (area > 20 && area < 250) {
            this.area = area;
        } else {
            System.out.println(String.format("Wrong apartment area '%s'!", area));
        }
    }

    void setHousingComplex(String housingComplex) {
        if (!housingComplex.isEmpty()) {
            this.housingComplex = housingComplex;
        } else {
            System.out.println(String.format("Wrong housing complex '%s'!", housingComplex));
        }
    }

    void setRoomsNumber(int roomsNumber) {
        if (roomsNumber > 0 && roomsNumber < 10) {
            this.roomsNumber = roomsNumber;
        } else {
            System.out.println(String.format("Wrong number of rooms '%s'!", roomsNumber));
        }
    }

    void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    void setConstructionYear(int constructionYear) {
        if (constructionYear > 1950 && constructionYear < currentYear) {
            this.constructionYear = constructionYear;
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
