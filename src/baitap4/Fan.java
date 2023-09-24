package baitap4;

public class Fan {
    // Khai báo các hằng
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGHT  = 3;

    // Các trường
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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

    // Phương thức toString
    public String toString() {
        if (on) {
            return "Fan is on - Speed: " + speed + ", Color: " + color + ", Radius: " + radius;
        } else {
            return "Fan is off - Color: " + color + ", Radius: " + radius;
        }
    }
}
