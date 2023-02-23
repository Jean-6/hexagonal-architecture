package domain.port;

import domain.model.Skill;

public interface IConsultantRepository {

    public void updateAverageDailyRate(float averageDailyRate);

    public void updateSkill(Skill skill);

    public void updateTerm (String term);
    public void updateAvailability (String availability);

}
