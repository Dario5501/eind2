public class Medewerker extends Optie {

    public Medewerker() {
    }

    @Override
    public void checkMogelijkheid() {
        System.out.println( "u mag GEEN locatie check doen");
    }
}
