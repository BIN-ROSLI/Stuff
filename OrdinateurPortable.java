public class OrdinateurPortable extends OrdinateurFixe {

    private int batterie;

    public int getBatterie() {
        return batterie;
    }

    public void setBatterie(int batterie) {
        this.batterie = batterie;
    }

    public OrdinateurPortable(String numeroSerie, String marque, int ram, String processeur, int batterie) {
        super(numeroSerie, marque, ram, processeur);
        this.batterie = batterie;
    }

    @Override
    public String toString() {
        return "OrdinateurPortable [" +
                "Numéro serie = " + getNumeroSerie() +
                ", Marque = " + getMarque() +
                ", Ram = " + getRam() +
                ", Processeur = " + getProcesseur() + 
                ", Batterie = " + batterie +
                ']';
    }
}
