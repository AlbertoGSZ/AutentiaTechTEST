    export interface Course {
        id: number;
        name: string;
        durationHours: number;
        activatedCourse: boolean;
        difficultyLevel: string;
        teacherID: number;
    }

    export interface RequestCreate {
        name: string;
        durationHours: number;
        activatedCourse: boolean;
        difficultyLevel: string;
        teacherID: number;
    }

    export interface ResponseCreate {
    name: string;
    durationHours: number;
    activatedCourse: boolean;
    difficultyLevel: string;
    teacherID: number;
}
