import vn.vnext.fridaynight.caches.UserCache;
import vn.vnext.fridaynight.configs.InitParameter;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * author Hoangptit
 * Date 9/1/2016
 */

@Singleton
public class OnStart {
    private final UserCache userCache;
    @Inject
    public OnStart(UserCache userCache){
        this.userCache = userCache;
        InitParameter.language = "en";
        InitParameter.isCache = true;
        if(InitParameter.isCache){
            userCache.loadUser();
        }
    }
}
