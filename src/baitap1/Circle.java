package baitap1;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 2.5;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    public double dienTich() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Phương thức nhập thông tin
    public void inputData(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}
