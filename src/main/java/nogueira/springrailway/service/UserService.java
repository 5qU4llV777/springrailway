package nogueira.springrailway.service;

import nogueira.springrailway.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
