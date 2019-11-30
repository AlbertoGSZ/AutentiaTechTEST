import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { AppModule } from './app/app.module';
import { environment } from './environments/environment';
import { Routes, RouterModule } from '@angular/router';
import { CoursesComponent } from './app/courses/courses.component';



const routes: Routes = [
  {path: 'courses', component: CoursesComponent}
];

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
