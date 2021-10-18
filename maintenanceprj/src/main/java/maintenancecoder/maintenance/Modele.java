package maintenancecoder.maintenance;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Modele {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String libelle;
    private String marque;
    private String couleur;
    private String puissance;
    private String moteur;
    private String constructeur;
    private String capacite;
    private int nbreplace ;
    private Date duree_vie;

    public Modele() {
    }

    public Modele(long id, String libelle, String marque, String couleur, String puissance, String moteur, String constructeur, String capacite, int nbreplace, Date duree_vie) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.couleur = couleur;
        this.puissance = puissance;
        this.moteur = moteur;
        this.constructeur = constructeur;
        this.capacite = capacite;
        this.nbreplace = nbreplace;
        this.duree_vie = duree_vie;
    }
    @OneToOne
    private Guide guide;
    @OneToOne
    private RetourExperience retourExperience;
    @OneToOne
    private Vehicule vehicule;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPuissance() {
        return puissance;
    }

    public void setPuissance(String puissance) {
        this.puissance = puissance;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public String getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(String constructeur) {
        this.constructeur = constructeur;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public int getNbreplace() {
        return nbreplace;
    }

    public void setNbreplace(int nbreplace) {
        this.nbreplace = nbreplace;
    }

    public Date getDuree_vie() {
        return duree_vie;
    }

    public void setDuree_vie(Date duree_vie) {
        this.duree_vie = duree_vie;
    }

    public Guide getGuide() {
        return guide;
    }

    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    public RetourExperience getRetourExperience() {
        return retourExperience;
    }

    public void setRetourExperience(RetourExperience retourExperience) {
        this.retourExperience = retourExperience;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
