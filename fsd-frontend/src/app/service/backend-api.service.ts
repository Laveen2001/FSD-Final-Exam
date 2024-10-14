import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BackendApiService {

  apiGetHotels = "/api/v1"


  constructor(private httpClient: HttpClient) { }


  getAllHotels() : Observable<any>{
    return this.httpClient.get<any>(this.apiGetHotels);
  }


}
