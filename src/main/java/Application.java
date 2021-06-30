import java.util.ArrayList;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Locatieformulier locatieformulier;
    private LocatieDetails locatieDetails;
    private ArrayList<Locatie> locaties = new ArrayList<>();

    public Application() {

    }

    public Application(AdminMainFactory factory) {
        locatieformulier = factory.toonFormulier();
        locatieDetails = factory.locatieDetails();
    }

    public Application(MedewerkerMainFactory factory) {
        locatieformulier = factory.toonFormulier();
    }

    public void result(String bron) {
        if (bron.equals("admin")) {
            locatieformulier.formuliertype();
            locatieDetails.toevoegenLocatieDetails();
        }
        if (bron.equals("medewerker")) {
            locatieformulier.formuliertype();
        }
        if(!bron.equals("admin") && !bron.equals("medewerker")){
            System.out.println("Geen bron gevonden of onjuiste bron");
            System.exit(0);
        }
    }

    public void configureApplication(String source) {
        String noAccessAllowed = "Je moet een admin of medewerker zijn om een locatie toe tevoegen";
        String bron = null;
        Application app = null;
        MedewerkerMainFactory factory;
        AdminMainFactory adminFactory;

        if (source.equals("admin")) {
            adminFactory = new AdminFactory();
            app = new Application(adminFactory);
            bron = "admin";
        }
        if (source.equals("medewerker")) {
            factory = new MedewerkerFactory();
            app = new Application(factory);
            bron = "medewerker";
        }
        if (app == null) {
            System.out.println(Berichten.getCancelOperationMessage(noAccessAllowed));
            System.exit(0);
        } else {
            app.result(bron);
        }
    }

}