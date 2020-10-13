package andrew.zoolaAuto.homeWork4;

public enum Phone {
    Iphone7Plus("Iphone", "7 Plus", "IOS", 14.0, 5.5, 123456),
    SamsungGalaxy("Samsung", "Galaxy S9", "Android", 10, 6.5, 123131),
    Pixel4("Google Pixel", "4 XL", "Android", 11.1, 6, 111111);

    private final String Name;
    private final String Model;
    private final String OS;
    private final double OSVersion;
    private final double ScreenSize;
    private final int UnlockCode;


    Phone(String Name, String Model, String os, double OSVersion, double screenSize, int unlockCode) {
        this.Name = Name;
        this.Model = Model;
        this.OS = os;
        this.OSVersion = OSVersion;
        this.ScreenSize = screenSize;
        this.UnlockCode = unlockCode;
    }

    public String getName() {
        return Name;
    }

    public String getModel() {
        return Model;
    }

    public String getOS() {
        return OS;
    }

    public double getOSVersion() {
        return OSVersion;
    }

    public double getScreenSize() {
        return ScreenSize;
    }

    public int getUnlockCode() {
        return UnlockCode;
    }

    public String toString() {
        return "Phone name - " + Name +
                "\nPhone model - " + Model +
                "\nOS - " + OS +
                "\nOS Version - " + OSVersion +
                "\nScreen size - " + ScreenSize +
                "\nUnlock Code - " + UnlockCode;
    }
}
