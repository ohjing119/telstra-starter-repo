package au.com.telstra.simcardactivator.service;

import java.util.Optional;
import org.springframework.stereotype.Service;

import au.com.telstra.simcardactivator.pojo.SimCard;
import au.com.telstra.simcardactivator.pojo.SimCardResponse;
import au.com.telstra.simcardactivator.repository.SimCardRepository;
import au.com.telstra.simcardactivator.exception.SimCardNotFoundException;

//@AllArgsConstructor
@Service
public class SimCardServiceImpl implements SimCardService{

    SimCardRepository simCardRepository;

    @Override
    public SimCardResponse getSimCard(Long id) {
        Optional<SimCard> course = simCardRepository.findById(id);
        return new SimCardResponse(unwrapSimCard(course, id));
    }

    @Override
    public SimCard saveSimCard(SimCard simCard) {
        return simCardRepository.save(simCard);
    }
 
    static SimCard unwrapSimCard(Optional<SimCard> entity, Long id) {
        if (entity.isPresent()) return entity.get();
        else throw new SimCardNotFoundException(id);
    }
}
