package Projects.Tirupati_Darshan_Booking_System;

public class Booking {
    // o Fields:
    // Devotee devotee, type(String:VIP/Standard)
    // o Methods:constructor,

    // toString()
    private Devotee devotee;
    private Type type;

    public Devotee getDevotee() {
        return devotee;
    }

    public Type getType() {
        return type;
    }

    public Booking(Devotee devotee, Type type) {
        this.devotee = devotee;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Booking [devotee=" + devotee + ", type=" + type + "]";
    }

}
