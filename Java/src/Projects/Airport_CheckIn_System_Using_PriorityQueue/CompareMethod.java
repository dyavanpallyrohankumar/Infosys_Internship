package Projects.Airport_CheckIn_System_Using_PriorityQueue;

import java.util.Comparator;

public class CompareMethod implements Comparator<Passenger> {

    @Override
    public int compare(Passenger p1, Passenger p2) {
        // Higher priorityLevel means higher priority (3 > 2 > 1)
        return Integer.compare(p2.getPriorityLevel(), p1.getPriorityLevel());
    }

}
