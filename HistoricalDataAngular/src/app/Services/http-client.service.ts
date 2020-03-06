import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable, Subject } from 'rxjs'; 

@Injectable({
  providedIn: 'root'
})

export class HttpClientService {

  readonly ROOT_URL = 'http://localhost:8080/requestData';

  constructor(private http: HttpClient) { 
    this.observable$ = this.querySubject.asObservable();
  }

  observable$ : Observable<any>;
  private querySubject = new Subject<any>();

  postToRequest(){
    return this.observable$;
  }

  returnNextData(data: any){
    this.querySubject.next(data);
  }

  public postToRequestData(obj): Observable<any>{
    return this.http.post<Object>(this.ROOT_URL, obj);
  }

  
}
