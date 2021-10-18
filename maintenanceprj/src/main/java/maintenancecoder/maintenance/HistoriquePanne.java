package maintenancecoder.maintenance;

import javax.persistence.*;

@Entity
public class HistoriquePanne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int nombrepannes;
    private String [] pannes;
    private int nombreinterventions;

    public HistoriquePanne() {
    }

    public HistoriquePanne(int nombrepannes, String[] pannes, int nombreinterventions) {
        this.nombrepannes = nombrepannes;
        this.pannes = pannes;
        this.nombreinterventions = nombreinterventions;
    }

    @OneToOne
    private Vehicule vehicule;

    public long getId() {
        return id;
    }

    public int getNombrepannes() {
        return nombrepannes;
    }

    public void setNombrepannes(int nombrepannes) {
        this.nombrepannes = nombrepannes;
    }

    public String[] getPannes() {
        return pannes;
    }

    public void setPannes(String[] pannes) {
        this.pannes = pannes;
    }

    public int getNombreinterventions() {
        return nombreinterventions;
    }

    public void setNombreinterventions(int nombreinterventions) {
        this.nombreinterventions = nombreinterventions;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
