public class Hotel {
    private String name;
    private String location;
    private int totalRooms;
    private int availableRooms;
    private double pricePerNight;

    public Hotel(String name, String location, int totalRooms, double pricePerNight) {
        this.name = name;
        this.location = location;
        this.totalRooms = totalRooms;
        this.availableRooms = totalRooms;
        this.pricePerNight = pricePerNight;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public int getAvailableRooms() {
        return availableRooms;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void bookRoom(int numRooms) {
        if (numRooms <= availableRooms) {
            availableRooms -= numRooms;
            System.out.println("Room(s) booked at " + name + ", " + location);
            System.out.println("Number of room(s): " + numRooms);
            System.out.println("Total Price: $" + (numRooms * pricePerNight));
        } else {
            System.out.println("Not enough available rooms at " + name + ", " + location);
        }
    }
}
