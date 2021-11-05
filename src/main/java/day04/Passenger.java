package day04;

public class Passenger {
    private String name;
    private String passengerId;
    private int packet;

    public Passenger(String name, String passengerId, int packet) {
        this.name = name;
        this.passengerId = passengerId;
        this.packet = packet;
    }

    public int getPacket() {
        return packet;
    }
}
