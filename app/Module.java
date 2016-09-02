import com.google.inject.AbstractModule;
import vn.vnext.fridaynight.caches.UserCache;
import vn.vnext.fridaynight.caches.UserCacheImpl;
import vn.vnext.fridaynight.dao.UserDAO;
import vn.vnext.fridaynight.dao.UserDAOImpl;
import vn.vnext.fridaynight.services.UserService;
import vn.vnext.fridaynight.services.UserServiceImpl;

/**
 * This class is a Guice module that tells Guice how to bind several
 * different types. This Guice module is created when the Play
 * application starts.
 *
 * Play will automatically use any class called `Module` that is in
 * the root package. You can create modules in other locations by
 * adding `play.modules.enabled` settings to the `application.conf`
 * configuration file.
 */
public class Module extends AbstractModule {

    @Override
    public void configure() {
        // Config inject Contructor
        bindDAO();
        bindService();
        bind(OnStart.class).asEagerSingleton();

    }

    private void bindDAO(){
        bind(UserDAO.class).to(UserDAOImpl.class);
    }

    private void bindService(){
        bind(UserService.class).to(UserServiceImpl.class);
        // Binding Caches
        bind(UserCache.class).to(UserCacheImpl.class);
        // Binding OnStart
    }

}
