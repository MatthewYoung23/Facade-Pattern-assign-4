public class Valet implements HotelService {
    @Override
    public String getServiceName() {
        return "Valet";
    }

    public void parkVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle " + plateNumber + " parked.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle " + plateNumber + " picked up.");
    }
}