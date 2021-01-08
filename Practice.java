abstract class Shape {
    abstract double computeArea();
}

class Circle extends Shape {
    int radius;
    Circle(int r) {
        radius = r;
    }
    double computeArea() {
        return 2 * 3.14 * radius;
    }
}

class Triangle extends Shape {
    int base;
    int height;
    Triangle(int b, int h) {
        base = b;
        height = h;
    }
    double computeArea() {
        return 0.5 * base * height;
    }
}

class Practice {
    public static void main(String[] args) {
        Shape c = new Circle(2);
        Shape t = new Triangle(2, 1);
        double cArea = c.computeArea();
        double tArea = t.computeArea();
        System.out.println(cArea);
        System.out.println(tArea);
    }
}