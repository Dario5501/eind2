public abstract class Optie {

    public abstract void checkMogelijkheid();

    public void showOpties(String bron, String watchwordAdmin, int keuze) {

        if (watchwordAdmin.equals("hallo admin") && bron.equals("admin")
                || watchwordAdmin.equals("hallo medewerker")
                && bron.equals("medewerker")) {
            if (keuze > 3)
                System.out.println("geen optie beschrikbaar");

            Application sendApplication = new Application();
            Locatie sentToLocatie = new Locatie();

            switch (keuze) {
                case 1 -> sendApplication.configureApplication(bron);
                case 2 -> sentToLocatie.getLocatiesCheck();
                case 3 -> sentToLocatie.printLocaties();
            }
        } else {
            System.out.println("combinatie bron/ wachtwoord klopt niet");
        }
    }

}
