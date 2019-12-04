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

    public void addTraining(String militaryBookNumber, String substantiation, String qualifications, String theoreticalPart,
                                String basicModule, String preOfficerModule, String trainingPlace, String universityAddress, long userId)
    {
        Training training = new Training();
        training.setMilitaryBookNumber(militaryBookNumber);
        training.setSubstantiation(substantiation);
        training.setQualifications(qualifications);
        training.setTheoreticalPart(theoreticalPart);
        training.setBasicModule(basicModule);
        training.setPreOfficerModule(preOfficerModule);
        training.setTrainingPlace(trainingPlace);
        training.setUniversityAddress(universityAddress);
        training.setUserId(userId);

        DAOFactory daoFactory = DAOFactory.getDAOFactory();
        TrainingDAO trainingDAO = daoFactory.getTrainingDAO();
        trainingDAO.createTraining(training);
    }

    public Training createTraining(Training training) {
        DAOFactory daoFactory = DAOFactory.getDAOFactory();
        TrainingDAO trainingDAO = daoFactory.getTrainingDAO();
        Training createdTraining = trainingDAO.createTraining(training);
        return createdTraining;
    }
}
