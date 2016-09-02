package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;

import views.html.*;
import vn.vnext.fridaynight.models.UserEntity;
import vn.vnext.fridaynight.services.UserService;
import vn.vnext.fridaynight.utils.MessageUltil;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private final UserService userService;

    @Inject
    public HomeController(UserService userService) {
        this.userService = userService;
    }

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    @Transactional(readOnly = true)
    public Result findUserAll() {
        List<UserEntity> users = userService.findAll();
        return ok(Json.toJson(users));
    }

    @Transactional
    public Result checkLogin() {
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        UserEntity user = new UserEntity();
        user.setUsername(dynamicForm.get("username"));
        user.setPassword(dynamicForm.get("password"));
        boolean isLogin = userService.checkLogin(user);
        if(isLogin){
            return ok("success");
        }else{
            return ok("error");
        }
    }


    @Transactional
    public Result registerUser(){
        MessageUltil mu = new MessageUltil();
        DynamicForm dynamicForm = Form.form().bindFromRequest();
        String username = dynamicForm.get("username");
        String password = dynamicForm.get("password");
        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password);
        mu.message = "success";
        if(userService.findUserByUsername(username)!=null){
            mu.message = "error";
        }
        user.setRole(1);
        byte a = 68;
        user.setEnable(a);
        userService.saveUser(user);
        mu.code = user.getUsername();
        return ok(Json.toJson(mu));
    }


}
