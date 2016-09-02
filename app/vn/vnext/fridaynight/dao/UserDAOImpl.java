package vn.vnext.fridaynight.dao;

import org.springframework.stereotype.Repository;
import play.db.jpa.JPAApi;
import vn.vnext.fridaynight.models.UserEntity;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.List;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
@Repository(value = "userDAO")
public class UserDAOImpl implements UserDAO {
    private final JPAApi jpaApi;
    private EntityManager em;

    @Inject
    public UserDAOImpl(JPAApi jpaApi) {
        this.jpaApi = jpaApi;
    }

    @Override
    public boolean checkLogin(UserEntity userEntity) {
        em = this.jpaApi.em();
        try {
            userEntity = em.createQuery("SELECT u FROM UserEntity u WHERE  u.username=:username AND u.password=:password", UserEntity.class)
                    .setParameter("username", userEntity.getUsername())
                    .setParameter("password", userEntity.getPassword())
                    .getSingleResult();
        }catch (NoResultException e){
            return false;
        }
        if (userEntity.getUserId() != 0) {
            return true;
        }
        return false;
    }

    @Override
    public List<UserEntity> findAll() {
        em = this.jpaApi.em();
        try {
            List<UserEntity> users = em.createQuery("SELECT u FROM UserEntity u", UserEntity.class)
                    .getResultList();
            return users;
        }catch (NoResultException e){
                return null;
        }
    }

    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        em = this.jpaApi.em();
        em.persist(userEntity);
        return userEntity;
    }

    @Override
    public UserEntity findUserByUsername(String username) {
        em = this.jpaApi.em();
        try {
            return em.createQuery("SELECT u FROM UserEntity u WHERE  u.username=:username", UserEntity.class)
                    .setParameter("username", username)
                    .getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }
}
