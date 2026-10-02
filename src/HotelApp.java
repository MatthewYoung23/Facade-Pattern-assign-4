public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.checkIn("ABC-123", 2);
        frontDesk.checkOut("ABC-123", 305, 1);
    }
}