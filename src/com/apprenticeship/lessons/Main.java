package com.apprenticeship.lessons;

import com.apprenticeship.labs.Lab1;
import com.apprenticeship.projects.Project1;
import com.apprenticeship.practiceexercises.PracticeExercise1;

public class Main {
    public static void main(String[] args) {
        lesson1Example();
        practice1Example();
        lab1Example();
        project1Example();
    }

    public static void lesson1Example() {
        Lesson1 myLesson1 = new Lesson1();
        myLesson1.firstLesson();
    }

    public static void practice1Example() {
        PracticeExercise1 myFirstPracticeExercise1 = new PracticeExercise1();
        myFirstPracticeExercise1.firstPracticeExercise();
    }

    public static void lab1Example() {
        Lab1 myLab1 = new Lab1();
        myLab1.firstLab();
    }

    public static void project1Example() {
        Project1 myproject1 = new Project1();
        myproject1.firstProject();
    }
}
