package maintenancecoder.maintenance;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class RetourExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nomRetour;
    private String typeRetour;

    public RetourExperience() {
    }

    public RetourExperience(String nomRetour, String typeRetour) {
        this.nomRetour = nomRetour;
        this.typeRetour = typeRetour;
    }

    @OneToOne
    private Modele modele;

    @OneToMany
    private Collection<Critere> criteres;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomRetour() {
        return nomRetour;
    }

    public void setNomRetour(String nomRetour) {
        this.nomRetour = nomRetour;
    }

    public String getTypeRetour() {
        return typeRetour;
    }

    public void setTypeRetour(String typeRetour) {
        this.typeRetour = typeRetour;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public Collection<Critere> getCriteres() {
        return criteres;
    }

    public void setCriteres(Collection<Critere> criteres) {
        this.criteres = criteres;
    }
}
