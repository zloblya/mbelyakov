package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    public double area() {
        double rls = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.b.distanceTo(this.c);
        double bc = this.c.distanceTo(this.a);
        double perimeter = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rls = Math.sqrt(perimeter * (perimeter - ab) * (perimeter - ac) * (perimeter - bc));
        }
        return rls;
    }

    private boolean exist(double ab, double ac, double bc) {
        return ab < (ac + bc) || ac < (ab + bc) || bc < (ab + ac);
    }

}
