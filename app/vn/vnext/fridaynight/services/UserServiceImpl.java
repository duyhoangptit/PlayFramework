package vn.vnext.fridaynight.services;

import org.springframework.stereotype.Service;
import vn.vnext.fridaynight.dao.UserDAO;
import vn.vnext.fridaynight.models.UserEntity;

import javax.inject.Inject;
import java.util.List;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Inject
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean checkLogin(UserEntity userEntity) {
        return userDAO.checkLogin(userEntity);
    }

    @Override
    public List<UserEntity> findAll() {
        return userDAO.findAll();
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        return userDAO.saveUser(userEntity);
    }

    @Override
    public UserEntity findUserByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }
}
