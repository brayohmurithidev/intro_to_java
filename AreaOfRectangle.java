import java.util.*;

public class AreaOfRectangle {
    public static  void main(String[] args) {
        //Input data
        Scanner input = new Scanner(System.in);
        double area, length, width;
        System.out.println("Enter length and width: ");
        length = input.nextDouble();
        width = input.nextDouble();
        area = length * width;
        System.out.println("Area is " + area);
    }
}
