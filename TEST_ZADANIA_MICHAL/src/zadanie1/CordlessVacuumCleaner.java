package zadanie1;

import java.util.ArrayList;
import java.util.Date;

public class CordlessVacuumCleaner extends VacuumCleaner implements Named, Cloneable, Comparable<CordlessVacuumCleaner>{
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
        CordlessVacuumCleaner klonik = (CordlessVacuumCleaner) super.clone();
        klonik.dateOfProd = (Date) dateOfProd.clone();
        return klonik;
    }

    @Override
    public int compareTo(CordlessVacuumCleaner o) {
        int wynik = super.compareTo(o);
        if (wynik!= 0 )
            return wynik;
        return Integer.compare(this.getId(), o.getId());
    }

    public int sumuj(ArrayList<Integer> tab){
        int suma = 0;
        for(Integer ello: tab){
            suma += ello;}
        return suma;
    }
}
