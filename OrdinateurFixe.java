public class OrdinateurFixe extends Materiel {

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

    public OrdinateurFixe(String numeroSerie, String marque, int ram, String processeur, int batterie) {
        super(numeroSerie, marque);
        this.ram = ram;
        this.processeur = processeur;
    }

    @Override
    public String toString() {
        return "OrdinateurFixe [" +
                "Numéro serie = " + getNumeroSerie() +
                ", Marque = " + getMarque() +
                ", Ram = " + ram +
                ", Processeur = " + processeur +
                ']';
    }
}
