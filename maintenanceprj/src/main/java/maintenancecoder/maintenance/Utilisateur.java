package maintenancecoder.maintenance;

import javax.persistence.*;

@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int matricule;
    private String nom;
    private String prenom;
    private String niveau;
    private String region;
    private String nomUser;
    private String password;

    public Utilisateur() {
    }

    public Utilisateur(int matricule, String nom, String prenom, String niveau, String region, String nomUser, String password) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.niveau = niveau;
        this.region = region;
        this.nomUser = nomUser;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNiveau() {
        return niveau;
    }

    public String getRegion() {
        return region;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getPassword() {
        return password;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToOne
    private TypeCompte typeCompte;

    public TypeCompte getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(TypeCompte typeCompte) {
        this.typeCompte = typeCompte;
    }
}
