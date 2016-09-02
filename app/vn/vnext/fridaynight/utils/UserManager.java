package vn.vnext.fridaynight.utils;


import vn.vnext.fridaynight.models.UserEntity;

import java.util.List;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
public interface UserManager {

    List<UserEntity> getAll();

    UserEntity save(UserEntity UserEntity);

    boolean login(String UserEntityName, String password);

    UserEntity getUserEntityByUserEntityName(String UserEntityName);

    void setUserEntityToUserEntityCache(UserEntity UserEntity);
}
