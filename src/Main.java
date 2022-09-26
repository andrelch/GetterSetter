import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //original coordinates
        Location location = new Location();
        //print original coordinates
        System.out.println("Coordinates: " + location.getPosX() + ", " + location.getPosY());

        //sets new coordinates already predefined
        location.setPosX(60);
        location.setPosY(120);
        //prints new coordinates
        System.out.println("New Coordinates: " + location.getPosX() + ", " + location.getPosY());

        //sets newer coordinates through user input
        //import scanner class to read user input
        Scanner input = new Scanner(System.in);
        int inputPosX;
        int inputPosY;

        //setting posX
        System.out.println("Enter newer x-coordinate:");
        //parses input and turns string into integer
        inputPosX = Integer.parseInt(input.nextLine());
        location.setPosX(inputPosX);

        //setting posY
        System.out.println("Enter newer y-coordinate:");
        //parses input and turns string into integer
        inputPosY = Integer.parseInt(input.nextLine());
        location.setPosY(inputPosY);

        //prints newer coordinates
        System.out.println("Newer Coordinates: " + location.getPosX() + ", " + location.getPosY());
    }
}