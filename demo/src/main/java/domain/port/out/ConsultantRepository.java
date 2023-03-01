package domain.port.out;

import domain.model.Skill;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultantRepository {

    /*public void updateAverageDailyRate(float averageDailyRate);

    public void updateSkill(Skill skill);

    public void updateTerm (String term);
    public void updateAvailability (String availability);*/
    void updateItemQuantity(String name, float newQuantity);

}
