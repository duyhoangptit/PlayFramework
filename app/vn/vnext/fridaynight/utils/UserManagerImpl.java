package vn.vnext.fridaynight.utils;

import com.google.inject.Inject;
import org.springframework.stereotype.Component;
import vn.vnext.fridaynight.caches.UserCache;
import vn.vnext.fridaynight.configs.InitParameter;
import vn.vnext.fridaynight.models.UserEntity;
import vn.vnext.fridaynight.services.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
@Component(value = "userManager")
public class UserManagerImpl implements UserManager {

    private final UserCache userCache;
    private final UserService userService;

    @Inject
    public UserManagerImpl(UserCache userCache, UserService userService) {
        this.userCache = userCache;
        this.userService = userService;
    }

    @Override
    public List<UserEntity> getAll() {
        if (InitParameter.isCache) {
            return new ArrayList<>(userCache.getUserCache().values());
        } else {
            return userService.findAll();
        }
    }

    @Override
    public UserEntity save(UserEntity user) {
        user = userService.saveUser(user);
        if (InitParameter.isCache && user != null) {
            userCache.getUserCache().put(user.getUsername(), user);
        }
        return user;
    }

    @Override
    public boolean login(String userName, String password) {
        UserEntity user = new UserEntity();
        user.setUsername(userName);
        user.setPassword(password);
        if (InitParameter.isCache) {
            user = userCache.getUserCache().get(userName);
            if (user != null && user.getPassword().equals(password)) {
                return true;
            }
        } else {
            boolean checkLogin = userService.checkLogin(user);
            return checkLogin;
        }
        return false;
    }

    @Override
    public UserEntity getUserEntityByUserEntityName(String userName) {
        if (InitParameter.isCache) {
            return userCache.getUserCache().get(userName);
        } else {
            return userService.findUserByUsername(userName);
        }
    }

    @Override
    public void setUserEntityToUserEntityCache(UserEntity UserEntity) {
        if (InitParameter.isCache) {
            userCache.getUserCache().put(UserEntity.getUsername(), UserEntity);
        }
    }

}
