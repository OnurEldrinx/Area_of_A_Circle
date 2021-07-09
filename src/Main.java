import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double radius,area,perimeter,angle;
        final double pi = Math.PI;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a radius value in centimeters: ");
        radius = keyboard.nextDouble();

        area = pi * radius * radius;
        perimeter = 2 * pi * radius;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Radius    : " + radius + " cm");
        System.out.println("Perimeter : " + perimeter + " cm");
        System.out.println("Area      : " + area + " square centimeter");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("\n********* Calculating a Minor Area by Using Radius and Angle *********");

        System.out.print("Enter a new radius value in centimeters: ");
        radius = keyboard.nextDouble();
        System.out.print("Enter an angle value in degrees: ");
        angle = keyboard.nextDouble();

        area = ( pi * Math.pow(radius,2) * angle ) / 360;

        System.out.println("----------------------------------------------------------------------");
        System.out.println("Radius    : " + radius + " cm");
        System.out.println("Angle     : " + angle + " degrees");
        System.out.println("Perimeter : " + perimeter + " cm");
        System.out.println("Area      : " + area + " square centimeter");
        System.out.println("----------------------------------------------------------------------");


    }
}
