public class CemiCercle extends Shape{
    private int radius;

    public CemiCercle(int radius) {
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
        System.out.println("Perimeter of semicircle with radius: "+radius+" is: "+pi*radius);
    }
}
