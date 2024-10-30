public class Hexagon extends Shape{
    private int side;

    public Hexagon(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    void getPerimeter() {
        System.out.println("Perimeter of hexagon with sides: "+side+" is: "+side*6);

    }
}
