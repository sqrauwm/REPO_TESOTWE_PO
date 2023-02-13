package zadanie1;

import java.util.Comparator;

public class NamesComparator implements Comparator<CordlessVacuumCleaner> {
    @Override
    public int compare(CordlessVacuumCleaner o1, CordlessVacuumCleaner o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
