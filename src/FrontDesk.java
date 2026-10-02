public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void checkIn(String plateNumber, int numberOfCarts) {
        System.out.println("--- Check-in ---");
        cart.requestCart(numberOfCarts);
        valet.parkVehicle(plateNumber);
    }

    public void checkOut(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("--- Check-out ---");
        cart.requestCart(numberOfCarts);
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
    }
}