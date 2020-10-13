package andrew.zoolaAuto.homeWork5;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Carrier {

    private String accountNumber;
    private String carrierName;
    private int carrierId;

    public Carrier(String accountNumber, String carrierName, int carrierId) {
        this.accountNumber = accountNumber;
        this.carrierName = carrierName;
        this.carrierId = carrierId;
    }

    public  Carrier(){

    }

}
