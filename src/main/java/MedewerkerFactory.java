public class MedewerkerFactory implements MedewerkerMainFactory {

    @Override
    public Locatieformulier toonFormulier() {
         return new MedewerkerFormulierType();
    }

}
