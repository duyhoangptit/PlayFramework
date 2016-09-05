import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

import {User} from '../ts/user';
import {UserService} from '../service/user.service';

@Component({
    selector: 'my-login',
    templateUrl: 'app/pages/login.component.html',
    styleUrls: ['app/css/login.component.css']
})

export class UserComponent implements OnInit {
    constructor(private userService:UserService,
                private router:Router
    ) {
    }

    login() {
        this.userService.checkLogin(user:User).then
        (
            res => {
                if (res.status == 200)
                    this.router.navigate(['/dashboard']);
                else
                    this.message = "wrong username or password"
            }
        ).catch(error => {
            console.info("login " + error)
        });
    }
    ngOnInit(): void {

    }

    goBack(): void {
        window.history.back();
    }
}
