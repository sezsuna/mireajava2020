package Lab_3;

public class Circle {
    private String color;
    private boolean filled;
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }


    @Override
    public String toString() {
        return String.format("Circle {Radius: %2f, Color: %s, Filled: %s}",
                this.radius,
                this.getColor(),
                this.isFilled());
    }
}
