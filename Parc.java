import java.util.ArrayList;

public class Parc {
    
    private ArrayList<Materiel> monParc;
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Materiel> getMonParc() {
        return monParc;
    }

    public void setMonParc(ArrayList<Materiel> monParc) {
        this.monParc = monParc;
    }

    public Parc() {
        monParc = new ArrayList<>();
        nom = "Parc inconnu";
    }

    public Parc(String nom) {
        this.monParc = new ArrayList<>();
        this.nom = nom;
    }

    public void ajouter(Materiel m) {
        monParc.add(m);
    }

    public void afficher() {
        System.out.println(nom);
        for (Materiel m: monParc) {
            System.out.println(m);
        }
    }

    public void supprimer(Materiel m) {
        monParc.remove(m);
    }

    public void supprimer(String numeroSerie) {
        for (Materiel m: monParc) {
            if (m.getNumeroSerie().equals(numeroSerie)) {
                monParc.remove(m);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Parc{" +
               "nom='" + nom + '\'' +
               ", monParc=" + monParc +
               '}';
    }

}
