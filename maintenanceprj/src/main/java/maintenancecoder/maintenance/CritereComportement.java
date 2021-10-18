package maintenancecoder.maintenance;

import javax.persistence.*;

@Entity
public class CritereComportement {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String nomcom;
    private String description;
    private String unite;
    private double valeur;
    private double valeur_par_defaut;

    public CritereComportement() {
    }

    public CritereComportement(String nomcom, String description, String unite, double valeur, double valeur_par_defaut) {
        this.nomcom = nomcom;
        this.description = description;
        this.unite = unite;
        this.valeur = valeur;
        this.valeur_par_defaut = valeur_par_defaut;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomcom() {
        return nomcom;
    }

    public void setNomcom(String nomcom) {
        this.nomcom = nomcom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public double getValeur_par_defaut() {
        return valeur_par_defaut;
    }

    public void setValeur_par_defaut(double valeur_par_defaut) {
        this.valeur_par_defaut = valeur_par_defaut;
    }

    @ManyToOne
    private Vehicule vehicule;

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
