public class Switch extends Materiel {
    private int ports;

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public Switch(String numeroSerie, String marque,int ports) {
        super(numeroSerie, marque);
        this.ports = ports;
    }

    @Override
    public String toString() {
        return "Switch [" +
                "Numéro serie = " + getNumeroSerie() +
                ", Marque = " + getMarque() +
                ", Nombre de ports = " + ports +
                ']';
    }

}
