package pl.Legia.serviceLayer;

import pl.Legia.factory.DAOFactory;
import pl.Legia.factory.TrainingDAO;
import pl.Legia.model.Training;

public class TrainingService {

    public Training getTrainingByUserId(long userId){
        DAOFactory daoFactory = DAOFactory.getDAOFactory();
        TrainingDAO trainingDAO = daoFactory.getTrainingDAO();
        Training training = trainingDAO.getTrainingByUserId(userId);
        return training;
    }
}
