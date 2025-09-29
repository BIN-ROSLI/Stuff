import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class App {

    private Connection connexion;

    public Connection getConnexion () {
        return connexion;
    }

        public void insertIntoDb (String nom) {
        String sql;

        sql= "insert into Parc (nomParc)Values (?);";
        try (
        PreparedStatement pstmt = connexion.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

        public void insertIntoDb2 (int idParc, String type, int numeroSerie, String marque) {
        String sql;

        sql= "insert into Materiel (id_Parc,numSerie,marque,type) Values (?,?,?,?);";
        try (
        PreparedStatement pstmt = connexion.prepareStatement(sql)) {
            pstmt.setInt(1, idParc);
            pstmt.setInt(2, numeroSerie);
            pstmt.setString(3, marque);
            pstmt.setString(4, type);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public int getIdParc(String nomParc) {
    String sql = "SELECT idParc FROM Parc WHERE nomParc = ?";
    int idParc = -1; // Default value if not found

    try (PreparedStatement pstmt = connexion.prepareStatement(sql)) {
        pstmt.setString(1, nomParc);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            idParc = rs.getInt("idParc"); // Store foreign key in variable
        }
    } catch (SQLException e) {
        System.out.println("Error retrieving idParc: " + e.getMessage());
    }

    return idParc;
}


    public App () {
        try {
            // L'url d'accès
            String url = "jdbc:sqlite:./parc.db";
            // Créer une bd ou l'ouvrir si existante
            connexion = DriverManager.getConnection(url);
            System.out.println("Connexion à SQLite établie.");    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

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
        App p;
        p = new App();
        p.insertIntoDb("Salle 202");
        int idParc = p.getIdParc("Salle 202");
        p.insertIntoDb2(idParc, "Ordinateur Fixe", 42068, "Samsung");

    }
}
