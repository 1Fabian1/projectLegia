package pl.Legia.factory;

import pl.Legia.model.User;

import java.util.List;

public interface UserDAO extends GenericDAO<User, Long> {

    List<User> getAll();
    User getUserByUsername(String username);
    User checkIfAdmin (String username);
    List<User> readAllUsersButLogged(String username);
}
