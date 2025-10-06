package collection_framework.Comparator;

import java.util.Comparator;

public class SeverityComparator implements Comparator<Patient> {

    @Override
    public int compare(Patient p1, Patient p2) {

        return p1.getSeverity() - p2.getSeverity();

        // if (p1.getSeverity() == p2.getSeverity()) {
        // return 0;
        // } else if (p1.getSeverity() > p2.getSeverity()) {
        // return -1;
        // } else {
        // return 1;
        // }

    }

}
