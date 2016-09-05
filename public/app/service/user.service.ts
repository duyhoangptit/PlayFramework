import { Injectable }    from '@angular/core';
import { Headers, Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

import {User} from '../ts/user';

@Injectable()
export class UserService{

    private headers = new Headers({'Content-Type': 'application/json'});
    private userUrl = "/checkLogin";

    constructor(private http: Http){}

    checkLogin(user: User): Promise<User>{
        return this.http
            .post(this.userUrl, JSON.stringify(user), {headers: this.headers})
            .toPromise()
            .then(res=>res.json().data)
            .catch(this.handleError);
    }

    private handleError(error: any): Promise<any>{
        console.error('Error', error);
        return Promise.reject(error.message || error);
    }
}