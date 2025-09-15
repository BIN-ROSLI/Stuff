public class BorneWifi extends Materiel {
    private String norme;

    public String getNorme() {
        return norme;
    }

    public void setNorme(String norme) {
        this.norme = norme;
    }

    private int connexionsMax;

    public int getConnexionsMax() {
        return connexionsMax;
    }

    public void setConnexionsMax(int connexionsMax) {
        this.connexionsMax = connexionsMax;
    }

    public BorneWifi(String numeroSerie, String marque, String norme, int connexionsMax) {
        super(numeroSerie, marque);
        this.norme = norme;
        this.connexionsMax = connexionsMax;
    }

    @Override
    public String toString() {
        return "BorneWifi [" +
                "Numéro serie = " + getNumeroSerie() +
                ", Marque = " + getMarque() +
                ", Norme = " + norme +
                ", Connexions max = " + connexionsMax +
                ']';
    }
}
