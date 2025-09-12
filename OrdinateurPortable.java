public class OrdinateurPortable extends Materiel {

    private int ram;
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    private String processeur;
    public String getProcesseur() {
        return processeur;
    }

    public void setProcesseur(String processeur) {
        this.processeur = processeur;
    }

    private int batterie;

    public int getBatterie() {
        return batterie;
    }

    public void setBatterie(int batterie) {
        this.batterie = batterie;
    }

    public OrdinateurPortable(String numeroSerie, String marque, int ram, String processeur, int batterie) {
        super(numeroSerie, marque);
        this.ram = ram;
        this.processeur = processeur;
        this.batterie = batterie;
    }

    @Override
    public String toString() {
        return "OrdinateurPortable [" +
                "Numéro serie = " + getNumeroSerie() +
                ", Marque = " + getMarque() +
                ", Ram = " + ram +
                ", Processeur = " + processeur + 
                ", Batterie = " + batterie +
                ']';
    }
}
