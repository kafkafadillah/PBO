import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat hotel-hotel
        HotelFactory hotelFactory = HotelFactory.getInstance();

        Hotel hotel1 = hotelFactory.createHotel("Hotel A", "Location A", 10, 100.0);
        Hotel hotel2 = hotelFactory.createHotel("Hotel B", "Location B", 5, 150.0);
        Hotel hotel3 = hotelFactory.createHotel("Hotel C", "Location C", 8, 120.0);

        // Membuat daftar hotel
        List<Hotel> hotels = new ArrayList<>();
        hotels.add(hotel1);
        hotels.add(hotel2);
        hotels.add(hotel3);

        System.out.println("Welcome to Hotel Booking App!");
        System.out.println("Available Hotels:");
        int index = 1;
        for (Hotel hotel : hotels) {
            System.out.println(index + ". " + hotel.getName() + ", " + hotel.getLocation() +
                    " - Price per night: $" + hotel.getPricePerNight());
            index++;
        }

        System.out.print("Enter the hotel number to book: ");
        int hotelNumber = scanner.nextInt();
        scanner.nextLine();

        if (hotelNumber >= 1 && hotelNumber <= hotels.size()) {
            Hotel selectedHotel = hotels.get(hotelNumber - 1);

            System.out.print("Enter the number of rooms to book: ");
            int numRooms = scanner.nextInt();

            selectedHotel.bookRoom(numRooms);
        } else {
            System.out.println("Invalid hotel number.");
        }

        scanner.close();
    }
}
