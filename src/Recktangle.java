public class Recktangle extends Shape{
    private int sideA;
    private int sideB;

    public Recktangle(int sideB, int sideA) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    @Override
    void getPerimeter() {
        System.out.println("Perimeter of recktangle with sides: "+sideA+","+sideB+" is: "+(sideA+sideB)*2);

    }
}
