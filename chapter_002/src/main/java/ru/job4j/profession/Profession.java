package ru.job4j.profession;

public class Profession {
    private String name;
    private String profession;
}

class Engineer extends Profession {
    void build(Home name) {
    }
}

class Teacher extends Profession {
    void learn(Student student) {
    }
}

class Doctor extends Profession {
    void treat(Patient patient) {
    }
}

class Home extends Engineer {
}

class Student extends Teacher {
}

class Patient extends Doctor {
}