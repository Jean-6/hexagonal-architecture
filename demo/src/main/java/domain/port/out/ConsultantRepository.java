package domain.port.out;

import domain.model.Skill;

public interface ConsultantRepository {

    public void updateAverageDailyRate(float averageDailyRate);

    public void updateSkill(Skill skill);

    public void updateTerm (String term);
    public void updateAvailability (String availability);

}
