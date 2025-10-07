package Projects.Airport_CheckIn_System_Using_PriorityQueue;

public class Passenger {
    // priorityLevel→int(3=VIP,2=Business,1=Economy)

    private String name;
    private int priorityLevel;

    public Passenger(String name, int priorityLevel) {
        this.name = name;
        this.priorityLevel = priorityLevel;
    }

    public String getName() {
        return name;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public String toString() {
        return "Passenger [name=" + name + ", priorityLevel=" + priorityLevel + "]";
    }

}
