public class Main {
    public static void main(String[] args) {
        Location location = new Location();
        System.out.println("Coordinates: " + location.getPosX() + ", " + location.getPosY());
        location.setPosX(60);
        location.setPosY(120);
        System.out.println("New Coordinates: " + location.getPosX() + ", " + location.getPosY());
    }
}