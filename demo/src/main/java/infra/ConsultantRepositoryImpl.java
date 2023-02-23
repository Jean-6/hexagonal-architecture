package infra;

import domain.model.Skill;
import domain.port.IConsultantRepository;
import org.springframework.stereotype.Service;


@Service
public class ConsultantRepositoryImpl implements IConsultantRepository {
    @Override
    public void updateAverageDailyRate(float averageDailyRate) {

    }

    @Override
    public void updateSkill(Skill skill) {

    }

    @Override
    public void updateTerm(String term) {

    }

    @Override
    public void updateAvailability(String availability) {

    }
}
