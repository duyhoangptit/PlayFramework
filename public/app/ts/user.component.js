"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var router_1 = require('@angular/router');
var user_1 = require('../ts/user');
var user_service_1 = require('../service/user.service');
var UserComponent = (function () {
    function UserComponent(userService, router) {
        this.userService = userService;
        this.router = router;
    }
    UserComponent.prototype.login = function () {
        var _this = this;
        this.userService.checkLogin(user, user_1.User).then(function (res) {
            if (res.status == 200)
                _this.router.navigate(['/dashboard']);
            else
                _this.message = "wrong username or password";
        }).catch(function (error) {
            console.info("login " + error);
        });
    };
    UserComponent.prototype.ngOnInit = function () {
    };
    UserComponent.prototype.goBack = function () {
        window.history.back();
    };
    UserComponent = __decorate([
        core_1.Component({
            selector: 'my-login',
            templateUrl: 'app/pages/login.component.html',
            styleUrls: ['app/css/login.component.css']
        }), 
        __metadata('design:paramtypes', [user_service_1.UserService, router_1.Router])
    ], UserComponent);
    return UserComponent;
}());
exports.UserComponent = UserComponent;
//# sourceMappingURL=user.component.js.map