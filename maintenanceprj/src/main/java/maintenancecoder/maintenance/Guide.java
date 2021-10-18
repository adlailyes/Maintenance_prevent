package maintenancecoder.maintenance;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private String typeGuide;
    private String nomGuide;

    public Guide() {
    }

    public Guide(String typeGuide, String nomGuide) {
        this.typeGuide = typeGuide;
        this.nomGuide = nomGuide;
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

    public String getTypeGuide() {
        return typeGuide;
    }

    public void setTypeGuide(String typeGuide) {
        this.typeGuide = typeGuide;
    }

    public String getNomGuide() {
        return nomGuide;
    }

    public void setNomGuide(String nomGuide) {
        this.nomGuide = nomGuide;
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
