package au.com.telstra.simcardactivator.service;

import au.com.telstra.simcardactivator.pojo.SimCard;
import au.com.telstra.simcardactivator.pojo.SimCardResponse;

public interface SimCardService {
    public SimCardResponse getSimCard(Long id);

    SimCard saveSimCard(SimCard simCard);

}
