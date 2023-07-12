public class HotelFactory {
    private static HotelFactory instance;

    private HotelFactory() {
        // Private constructor to prevent instantiation
    }

    public static HotelFactory getInstance() {
        if (instance == null) {
            instance = new HotelFactory();
        }
        return instance;
    }

    public Hotel createHotel(String name, String location, int totalRooms, double pricePerNight) {
        return new Hotel(name, location, totalRooms, pricePerNight);
    }
}
