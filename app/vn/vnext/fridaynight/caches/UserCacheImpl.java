package vn.vnext.fridaynight.caches;

import play.db.jpa.JPAApi;
import vn.vnext.fridaynight.models.UserEntity;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
@Singleton
public class UserCacheImpl implements UserCache {

    private ConcurrentMap<String, UserEntity> userCache;
    private final JPAApi jpaApi;

    @Inject
    public UserCacheImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    @Override
    public void loadUser() {
        userCache = new ConcurrentHashMap<>();
        jpaApi.withTransaction(() -> {
            EntityManager em = jpaApi.em();
            List<UserEntity> users = em.createQuery("select u from UserEntity u", UserEntity.class).getResultList();
            for (UserEntity user : users) {
                userCache.put(user.getUsername(), user);
            }
        });
    }

    @Override
    public Map<String, UserEntity> getUserCache() {
        return userCache;
    }
}
