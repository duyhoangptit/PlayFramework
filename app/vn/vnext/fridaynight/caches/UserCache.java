package vn.vnext.fridaynight.caches;

import vn.vnext.fridaynight.models.UserEntity;

import java.util.Map;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
public interface UserCache {

    void loadUser();
    Map<String, UserEntity> getUserCache();
}
