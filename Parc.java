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

    public void afficher() { // afficher le contenu du parc
        System.out.println(nom);
        for (Materiel m: monParc) {
            System.out.println(m);
        }
    }

    public void supprimer(Materiel m) {
        monParc.remove(m);
    }

    public void supprimer(String numeroSerie) { // supprimer le matériel avec le numéro de série donné
        for (Materiel m: monParc) {
            if (m.getNumeroSerie().equals(numeroSerie)) {
                monParc.remove(m);
                break;
            }
        }
    }

    public String rechercher(String numeroSerie) { // rechercher le matériel avec le numéro de série donné
        for (Materiel m: monParc) {
            if (m.getNumeroSerie().equals(numeroSerie)) {
                System.out.println("Le materiel qui a " + numeroSerie + " est : " + m);
            }
        }
        return null;
    }

    public ArrayList<Materiel> rechercherType(Materiel m) { // rechercher le matériel du même type que m
        ArrayList<Materiel> result = new ArrayList<>();
        for (Materiel x: monParc) {
            if (x.getClass().equals(m.getClass())) {
                result.add(x); 
                System.out.println("Found: " + x + " of " + m);
            }
        }
        if (result.isEmpty()) {
            System.out.println("No materiel found of " + m);
        }   
        return result;
    }

    @Override
    public String toString() {
        return "Parc{" +
               "nom='" + nom + '\'' +
               ", monParc=" + monParc +
               '}';
    }

}
