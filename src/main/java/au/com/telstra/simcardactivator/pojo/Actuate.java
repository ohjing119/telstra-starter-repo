package au.com.telstra.simcardactivator.pojo;

public class Actuate {

    private String iccid;
    private String customerEmail;
    
    public Actuate(){
        
    } 

    public String getIccid() {
        return this.iccid;
    }
    
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }
    
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
    
}
