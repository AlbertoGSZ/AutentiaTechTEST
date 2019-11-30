import { Component, OnInit } from '@angular/core';
import { CourseService } from "./course.Service";
import { RequestCreate, ResponseCreate } from "./course.model";

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {

  title:'Catálogo de cursos';
  responseCourses: [];
  request: RequestCreate = {
    name: '',
    durationHours: 12,
    activatedCourse: false,
    difficultyLevel: '',
    teacherID: 21
  }

  response: ResponseCreate;



  constructor(private courseService: CourseService) { }

  ngOnInit() {
    this.courseService.getCourses()
      .subscribe(res => this.responseCourses = res)
  }

  save(){
    this.courseService.createCourse(this.request).subscribe(res => {
      this.response = res;
    });
  }



}
