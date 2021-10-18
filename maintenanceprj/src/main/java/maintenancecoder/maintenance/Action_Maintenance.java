package maintenancecoder.maintenance;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Action_Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @ManyToOne
    private Vehicule vehicule;
    private int niveau;
    private Date date_debut;
    private Date date_fin;
    private int frequence; //par jour

    public Action_Maintenance( ){ }

    public Action_Maintenance(Vehicule vehicule, int niveau, Date date_debut, Date date_fin, int frequence){

        this.vehicule = vehicule;
        this.niveau = niveau;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.frequence = frequence;
    }

    public Action_Maintenance(Vehicule vehicule, int niveau, int frequence){

        this.vehicule = vehicule;
        this.niveau = niveau;
        this.frequence = frequence;
    }

    public Action_Maintenance(int niveau, int frequence){

        this.niveau = niveau;
        this.frequence = frequence;
    }

    public Vehicule getVehicule() { return vehicule; }

    public Date getDate_debut() {
        return date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public int getFrequence() {
        return frequence;
    }

    public int getNiveau() {
        return niveau;
    }

    public long getId() {
        return id;
    }


}
