package maintenancecoder.maintenance;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Critere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int valeurMin;
    private int valeurMax;
    private int valeurSeuil;
    private String description;

    public Critere() {
    }

    public Critere(int valeurMin, int valeurMax, int valeurSeuil, String description) {
        this.valeurMin = valeurMin;
        this.valeurMax = valeurMax;
        this.valeurSeuil = valeurSeuil;
        this.description = description;
    }

    @ManyToOne
    private Guide guide;
    @ManyToOne
    private RetourExperience retourExperience;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValeurMin() {
        return valeurMin;
    }

    public void setValeurMin(int valeurMin) {
        this.valeurMin = valeurMin;
    }

    public int getValeurMax() {
        return valeurMax;
    }

    public void setValeurMax(int valeurMax) {
        this.valeurMax = valeurMax;
    }

    public int getValeurSeuil() {
        return valeurSeuil;
    }

    public void setValeurSeuil(int valeurSeuil) {
        this.valeurSeuil = valeurSeuil;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
}
