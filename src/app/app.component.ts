import { Component, OnInit } from '@angular/core';
import { CourseService } from "./courses/course.Service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  title = 'Catálogo de cursos';
  pageActual : number = 1;
  responseCourses: [];

  constructor(private courseService: CourseService) { }

  ngOnInit() {
    this.courseService.getCourses()
      .subscribe(res => this.responseCourses = res)
  }


}
