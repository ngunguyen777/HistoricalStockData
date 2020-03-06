import { RequestedData } from './../../Models/RequestedData';
import { Component, OnInit } from '@angular/core';
import { HttpClientService } from './../../Services/http-client.service';
import { PostingData } from './../../Models/PostingData';

@Component({
  selector: 'requested-data',
  templateUrl: './requested-data.component.html',
  styleUrls: ['./requested-data.component.css']
})
export class RequestedDataComponent implements OnInit {

  requestedData: RequestedData[];
  
  constructor(private httpClientService: HttpClientService) { 
    httpClientService.observable$.subscribe(result => this.requestedData = result);
  }
  
 

  ngOnInit() {
    
  }





}
