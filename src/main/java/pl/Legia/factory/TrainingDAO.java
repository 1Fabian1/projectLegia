package pl.Legia.factory;

import pl.Legia.model.Training;

import java.util.List;

public interface TrainingDAO extends GenericDAO<Training, Long> {

    Training getTrainingByUserId(long userId);
}
