import { Component, OnInit } from '@angular/core';
import { HttpClientService } from './../../Services/http-client.service';
import { PostingData } from './../../Models/PostingData';
import { RequestedData } from './../../Models/RequestedData';

@Component({
  selector: 'body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit {

  constructor(private client: HttpClientService) { }

  ngOnInit() {
  }
  requestedData: RequestedData[];

  postingData: PostingData = {
    ticker: "",
    start_date: "",
    end_date: ""
  }

  submitRequestData(postFields){
    this.postingData.ticker = postFields.ticker;
    this.postingData.start_date = postFields.startDate;
    this.postingData.end_date = postFields.endDate;
    this.client.postToRequestData(this.postingData).subscribe(data => {
      this.requestedData = data;
      this.client.returnNextData(this.requestedData);
    });
  }

}
