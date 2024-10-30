//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(4,5,6);
        Recktangle recktangle=new Recktangle(5,4);
        Circle circle=new Circle(5);
        CemiCercle cemiCercle=new CemiCercle(5);
        Hexagon hexagon=new Hexagon(4);

        triangle.getPerimeter();
        recktangle.getPerimeter();
        circle.getPerimeter();
        cemiCercle.getPerimeter();
        hexagon.getPerimeter();
    }
}