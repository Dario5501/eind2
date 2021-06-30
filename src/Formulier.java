import java.util.Scanner;

public class Formulier {

    public void formuliertype(String bron) {
        Admin admin = new Admin();
        Medewerker medewerker = new Medewerker();
        Locatie locatieObject = new Locatie();
        String antwoord = "nee";
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("= VUL JE NIEUWE LOCATIEGEGEVENS IN =");
        System.out.println("====================================");

        System.out.println("Voeg nieuwe locatie naam");
        String location = scanner.nextLine();
        System.out.println("Voeg postcode");
        int postcode = scanner.nextInt();

        Locatie locatie = new Locatie(location, postcode, bron, "Nee");

        if (bron.equals("admin")) {
            admin.checkMogelijkheid();
            System.out.println("is de locatie gecheckt? ja / nee");
            scanner.nextLine();
            antwoord = scanner.nextLine();

            if (antwoord.equals("ja") || antwoord.equals("Ja")) {
                System.out.println("Bedankt! location gecheckt");
            }
        } else {
            medewerker.checkMogelijkheid();
        }

        locatieObject.addlocatie(locatie, bron, antwoord);
    }
}
