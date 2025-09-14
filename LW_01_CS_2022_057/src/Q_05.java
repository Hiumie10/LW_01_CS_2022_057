class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Q_05 {
    public static void main(String[] args) {
        Circle inner = new Circle(5);
        Circle outer = new Circle(10);

        double shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area = " + shadedArea);
    }
}
