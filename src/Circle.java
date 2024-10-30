public class Circle extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    void getPerimeter() {
        System.out.println("Perimeter of circle with radius: "+radius+" is: "+pi*radius*2);
    }
}
