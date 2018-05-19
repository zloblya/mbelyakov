package ru.job4j.profession;

public class Profession {
    String name;
    String profession;

    class Doctor {
        void heal(Patient patient) {
        }
    }

    class Patient {
        String name;
    }

    class Engineer {
        void build(Home home){
        }
    }

    class Home {
    }

    class Teacher {
        void learn(Student student) {

        }
    }

    class Student{

    }
}
