package pl.Legia.serviceLayer;

import pl.Legia.factory.DAOFactory;
import pl.Legia.factory.UserDAO;
import pl.Legia.model.User;

import java.util.List;

public class UserService {

    public void addUser(String username, String password, String email){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDAO = factory.getUserDAO();
        userDAO.create(user);
    }

    public User getUserById(long userId){
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDAO = factory.getUserDAO();
        User user = userDAO.read(userId);
        return user;
    }

    public User getUserByUsername(String username){
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDAO = factory.getUserDAO();
        User user = userDAO.getUserByUsername(username);
        return user;
    }

    public User checkIfAdmin(String username){
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDAO = factory.getUserDAO();
        User admin = userDAO.checkIfAdmin(username);
        return admin;
    }

    public List<User> readAllUsersButLogged(String username){
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDAO = factory.getUserDAO();
        List<User> allUsers = userDAO.readAllUsersButLogged(username);
        return  allUsers;
    }



}
