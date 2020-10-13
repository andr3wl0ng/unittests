package andrew.carrierBuilder;

public class UpsCarrier extends Carrier{

    private int upsCarrierIdentifier;

    public UpsCarrier(String carrierName, int accountNumber, int upsCarrierIdentifier){
       super(carrierName, accountNumber);
       this.upsCarrierIdentifier = upsCarrierIdentifier;
    };

    public String generateLabel(){
        String label = getCarrierName()+getAccountNumber()+upsCarrierIdentifier+"-Label";
        return label;
    }

}

