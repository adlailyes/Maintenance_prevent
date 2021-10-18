package maintenancecoder.maintenance;

import javax.persistence.*;

@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomeqip;
    private String typeeqip;
    private int codeeqip;
    private String modele;
    private String reference;
    private int serieeqip;
    private double puissance;
    private double prixachat;

    public Equipement() {
    }

    public Equipement(String nomeqip, String typeeqip, int codeeqip, String modele, String reference, int serieeqip, double puissance, double prixachat) {
        this.nomeqip = nomeqip;
        this.typeeqip = typeeqip;
        this.codeeqip = codeeqip;
        this.modele = modele;
        this.reference = reference;
        this.serieeqip = serieeqip;
        this.puissance = puissance;
        this.prixachat = prixachat;
    }

    public Equipement(String nomeqip, String typeeqip, int codeeqip, String modele, int serieeqip, double prixachat) {
        this.nomeqip = nomeqip;
        this.typeeqip = typeeqip;
        this.codeeqip = codeeqip;
        this.modele = modele;
        this.serieeqip = serieeqip;
        this.prixachat = prixachat;
    }

    @ManyToOne
    private Vehicule vehicule;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeqip() {
        return nomeqip;
    }

    public void setNomeqip(String nomeqip) {
        this.nomeqip = nomeqip;
    }

    public String getTypeeqip() {
        return typeeqip;
    }

    public void setTypeeqip(String typeeqip) {
        this.typeeqip = typeeqip;
    }

    public int getCodeeqip() {
        return codeeqip;
    }

    public void setCodeeqip(int codeeqip) {
        this.codeeqip = codeeqip;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getSerieeqip() {
        return serieeqip;
    }

    public void setSerieeqip(int serieeqip) {
        this.serieeqip = serieeqip;
    }

    public double getPuissance() {
        return puissance;
    }

    public void setPuissance(double puissance) {
        this.puissance = puissance;
    }

    public double getPrixachat() {
        return prixachat;
    }

    public void setPrixachat(double prixachat) {
        this.prixachat = prixachat;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
