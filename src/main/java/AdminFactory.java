/**
 * Dit is de admin-variant voor het formulier
 */
public class AdminFactory implements AdminMainFactory {

    @Override
    public Locatieformulier toonFormulier() {
        return new AdminFormulierType();
    }

    @Override
    public LocatieDetails locatieDetails() {
        return new AdminLocatieDetails();
    }

}
