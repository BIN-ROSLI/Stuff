public abstract class Materiel {

    private String numeroSerie;
    private String marque;

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Materiel () {
        numeroSerie = "Inconnu";
        marque = "Inconnu";
    }

    public Materiel(String numeroSerie, String marque) {
        this.numeroSerie = numeroSerie;
        this.marque = marque;
    }

    @Override
    public String toString() {
        return "Materiel [Numéro serie : " + numeroSerie + ", Marque :" + marque + "]";
    }

}
