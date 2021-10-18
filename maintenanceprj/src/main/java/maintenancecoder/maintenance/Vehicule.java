package maintenancecoder.maintenance;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String matricule;
    private String type;
    private String couleur;
    private Date date_dachat;
    //private List <Equipement> equipement;
    public Vehicule(){ }
    public Vehicule(String matricule,String type,String couleur ){

        this.matricule = matricule;
        this.type = type;
        this.couleur = couleur;
    }

    public long getId() {
        return id;
    }
    public String getMatricule() {
        return matricule;
    }
    public String getType() { return type; }
    public String getCouleur() {
        return couleur;
    }
    public Date getDate_dachat() {
        return date_dachat;
    }



    @ManyToOne
    private Action_Maintenance action_maintenances;
    @OneToMany
    private Collection<Equipement> equipements;
    @OneToMany
    private Collection<CritereComportement> criterecomportements;
    @OneToOne
    private HistoriquePanne historiquePanne;
    @OneToOne
    private Modele modele;

    public Collection<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(Collection<Equipement> equipements) {
        this.equipements = equipements;
    }

    public Collection<CritereComportement> getCriterecomportements() {
        return criterecomportements;
    }

    public void setCriterecomportements(Collection<CritereComportement> criterecomportements) {
        this.criterecomportements = criterecomportements;
    }

    public HistoriquePanne getHistoriquePanne() {
        return historiquePanne;
    }

    public void setHistoriquePanne(HistoriquePanne historiquePanne) {
        this.historiquePanne = historiquePanne;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public Action_Maintenance getAction_maintenances() {
        return action_maintenances;
    }

    public void setAction_maintenances(Action_Maintenance action_maintenances) {
        this.action_maintenances = action_maintenances;
    }
}
