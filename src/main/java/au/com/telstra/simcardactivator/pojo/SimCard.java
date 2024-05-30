package au.com.telstra.simcardactivator.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
//import lombok.*;

@JsonIgnoreProperties(ignoreUnknown = true)
// @Getter
// @Setter
// @RequiredArgsConstructor
// @NoArgsConstructor
@Entity
@Table(name = "simcard")
public class SimCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //@NonNull
    @Column(name = "iccid", nullable = false, unique = true)
    private String iccid;

    @Column(name = "customerEmail", nullable = false, unique = true)    
    private String customerEmail;

    @Column(name = "activated")
    private boolean activated;
    
    public SimCard(){
        
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
