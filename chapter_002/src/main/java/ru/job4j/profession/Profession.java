package ru.job4j.profession;

import javax.print.Doc;

public class Profession {
    String name;
    String profession;
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