package vn.vnext.fridaynight.validator;

import play.api.libs.json.Json;
import play.data.Form;
import play.data.FormFactory;
import vn.vnext.fridaynight.models.UserEntity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * author Hoangptit
 * Date 9/1/2016
 */
@Singleton
public class UserValidator {

    @Inject
    private FormFactory formFactory;

    public boolean validate(UserEntity userEntity) {
//        Form<UserEntity> userForm = formFactory.form(UserEntity.class).bind(Json.toJson(userEntity));
//        if (userForm.hasErrors()) {
//            return false;
//        }
        return true;
    }
}
