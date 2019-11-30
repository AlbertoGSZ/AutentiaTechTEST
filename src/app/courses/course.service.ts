import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http";
import { RequestCreate, ResponseCreate } from "./course.model";

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private url = "http://localhost:8080/course";

  constructor(private http: HttpClient) {}

  getCourses(): Observable<[]>{
    return this.http.get<[]>(this.url);
  }

  createCourse(request:RequestCreate): Observable<ResponseCreate>{
    return this.http.post<ResponseCreate>(this.url,request);
  }


}
