package andrew.carrierBuilder;

public class GenerateDeliveryLabel {
    public static void main(String[] args) {
        UpsCarrier ups = new UpsCarrier("UPS", 12345, 762634);
        String label = ups.generateLabel();
        System.out.println(label);
    }
}

