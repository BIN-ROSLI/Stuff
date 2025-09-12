public class App {

    public App () {
        Parc p1;
        Parc p2;
        Materiel m, m2;
        OrdinateurPortable op;
        OrdinateurFixe of;
        Switch sw;

        p1 = new Parc();
        p2 = new Parc("RT");
        m = new Materiel("S23 Ultra", "Samsung");
        m2 = new Materiel("Iphone 11", "Apple");
        op = new OrdinateurPortable("DeX", "Samsung", 8, "Snapdragon", 5000);
        of = new OrdinateurFixe("iMac", "Apple", 16, "M1", 0);
        sw = new Switch("XS708T", "Netgear", 8);
        p1.ajouter(m);
        p1.ajouter(m2);
        p1.ajouter(of);
        p2.ajouter(m2);
        p2.ajouter(op);
        p2.ajouter(sw);
        p1.afficher();
        p2.afficher();

        
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        new App();
    }
}
