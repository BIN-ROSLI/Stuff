public class App {

    public App () {
        Parc p1;
        Parc p2;
        Materiel m;
        OrdinateurPortable op;
        OrdinateurFixe of;
        Switch sw;
        BorneWifi bw;

        p1 = new Parc("QLIO");
        p2 = new Parc("RT");
        op = new OrdinateurPortable("DeX", "Samsung", 8, "Snapdragon", 5000);
        of = new OrdinateurFixe("iMac", "Apple", 16, "M1");
        sw = new Switch("XS708T", "Netgear", 8);
        bw = new BorneWifi("Nighthawk", "Netgear", "WiFi 6", 30);
        p1.ajouter(of);
        p2.ajouter(op);
        p2.ajouter(sw);
        p2.ajouter(bw);
        p1.afficher();
        p2.afficher();

        System.out.println("");
        p1.rechercher("iMac");
        p2.rechercherType(sw);

        
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        new App();
    }
}
