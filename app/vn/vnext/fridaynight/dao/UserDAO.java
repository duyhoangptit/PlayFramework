package vn.vnext.fridaynight.dao;

import vn.vnext.fridaynight.models.UserEntity;

import java.util.List;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
public interface UserDAO {

    boolean checkLogin(UserEntity userEntity);

    List<UserEntity> findAll();

    UserEntity saveUser(UserEntity userEntity);

    UserEntity findUserByUsername(String username);
}
