package zadanie1;

import java.util.Date;

public class CordlessVacuumCleaner extends VacuumCleaner implements Named, Cloneable {
    private final int id;
    private Date dateOfProd = null;

    public CordlessVacuumCleaner(String name, int id) {
        super(name);
        this.id = id;
        this.dateOfProd = new Date();
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID = " + id
                + ", dateOfProd = " + dateOfProd
                + "]";
    }

    @Override
    public CordlessVacuumCleaner clone() throws CloneNotSupportedException {
        return (CordlessVacuumCleaner) super.clone();
    }
}
