package zadanie1;

public abstract class VacuumCleaner  implements Comparable<VacuumCleaner>{
    private String name;

    public VacuumCleaner(String name) { this.name = name; }
    public final String getName() { return name; }

    public abstract int getId();

    @Override
    public int compareTo(VacuumCleaner o) {
        return this.getName().compareTo(o.getName());

    }
}

