//abstract class
//SOURCE CODE
import java.util.*;

abstract class Area{
    abstract float calculateArea(float x, float y);
}

class Rectangle extends Area{
    public float calculateArea(float x, float y){
        float area = x*y;
        return area;
    }
}

class Triangle extends Area{
public float calculateArea(float x, float y){
        float area = (float) 0.5 * x * y;
        return area;
        }
}

class Circle extends Area{
    public float calculateArea(float x, float y){
        float area = (float) 3.14159 * x * x * y;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        float area=0, a,b;
        int ch;
        Scanner sc = new Scanner(System.in);
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        do {
            System.out.println("1:Rectangle\n2:Triangle\n3:Circle\n4:Exit\nEnter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter height & breadth of the rectangle :");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    area = r.calculateArea(a, b);
                    System.out.println("Area is " + area);
                    break;
                case 2:
                    System.out.println("Enter base and height of the triangle :");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    area = t.calculateArea(a, b);
                    System.out.println("Area is " + area);
                    break;
                case 3:
                    System.out.println("Enter radius of the circle :");
                    a = sc.nextFloat();
                    area = c.calculateArea(a, 1);
                    System.out.println("Area is " + area);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(ch != 4);
    }
]
