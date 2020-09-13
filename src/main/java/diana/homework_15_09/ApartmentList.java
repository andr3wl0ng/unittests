package diana.homework_15_09;

public enum ApartmentList {
    Apt1("The Lakes", 28.5, 1, true, 2018),
    Apt2("Park Land", 62, 2, false, 2017),
    Apt3("Sky Land", 81, 3, false, 2019),
    Apt4("Poetica", 58.5, 2, true, 2017),
    Apt5("New England", 47, 1, true, 2013);

    String housingComplex;
    double area;
    int roomsNumber;
    boolean balcony;
    int constructionYear;

    ApartmentList(String housingComplex, double area, int roomsNumber, boolean balcony, int constructionYear) {
        this.housingComplex = housingComplex;
        this.area = area;
        this.roomsNumber = roomsNumber;
        this.balcony = balcony;
        this.constructionYear = constructionYear;
    }
}
