package diana.homework_8_09;

public class Phones {

    enum Smartphone {
        iPhone_6("iPhone_6", "iPhone 6", 12.1, 4.7, 1111),
        iPhone_X("iPhone_X", "iPhone X", 13.6, 5.8, 2222),
        Samsung("Samsung", "Galaxy S20", 13.4, 6.2, 3333),
        Xiaomi("Xiaomi", "Redmi Note 9", 12.6, 6.53, 4444),
        Meizu("Meizu", "Meizu M10", 10.8, 10.8, 5555);

        private String phoneName;
        private String model;
        private double os_version;
        private double display;
        private int pincode;

        Smartphone(String phoneName, String model, double os_version, double display, int pincode) {
            this.phoneName = phoneName;
            this.model = model;
            this.os_version = os_version;
            this.display = display;
            this.pincode = pincode;
        }

        public static void main(String[] args) {
        }

        public String getPhoneName() {
            return phoneName;
        }

        public String getModel() {
            return model;
        }

        // Method name
        public double getOsVersion() {
            return os_version;
        }

        public double getDisplay() {
            return display;
        }

        public int getPinCode() {
            return pincode;
        }
    }
}
