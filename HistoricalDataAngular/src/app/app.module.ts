import { HttpClientService } from './Services/http-client.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Components/header/header.component';
import { RequestedDataComponent } from './Components/requested-data/requested-data.component';
import { HttpClientModule } from '@angular/common/http';
import { BodyComponent } from './Components/body/body.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    RequestedDataComponent,
    BodyComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [HttpClientService],
  bootstrap: [AppComponent]
})
export class AppModule { }
