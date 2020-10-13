package andrew.carrierBuilder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Carrier {
        private String carrierName;
        private int accountNumber;

    public Carrier(String carrierName, int accountNumber){
        this.carrierName = carrierName;
        this.accountNumber = accountNumber;
    }

    public void carrierInfo() {
        System.out.println("Carrier: " + carrierName + "\n AccountNumber is:" + accountNumber);
    }

    public String generateLabel(){
        String label = accountNumber+carrierName+"Label";
        System.out.println(label);
        return label;
    }

}
