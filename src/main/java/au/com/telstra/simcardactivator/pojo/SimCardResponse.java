package au.com.telstra.simcardactivator.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SimCardResponse {
    
    private String iccid;
    private String customerEmail;
    private boolean activated;
    
    public SimCardResponse(SimCard simCard){
        this.iccid = simCard.getIccid();
        this.customerEmail = simCard.getCustomerEmail();
        this.activated = simCard.getActivated();
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
    
    public boolean getActivated() {
        return this.activated;
    }
    
    public void setActivated(boolean activate) {
        this.activated = activate;
    }
}
