/**
 * Created by SONY on 9/3/2016.
 */
import {NgModule}      from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';
import {AppComponent}   from './app.component';
import {FormsModule}    from '@angular/forms';
import {HttpModule} from '@angular/http';
import {UserComponent} from '../app/ts/user.component';

// Imports for loading & configuring the in-memory web api
import { InMemoryWebApiModule } from 'angular2-in-memory-web-api';

@NgModule({
    imports: [BrowserModule,
        FormsModule,
        HttpModule,
    ],
    declarations: [
        AppComponent,
        UserComponent
    ],
    bootstrap: [AppComponent]
})
export class AppModule {
}