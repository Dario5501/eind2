import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wat wilt u doen?");
        System.out.println();
        System.out.println("1.locatie toevoegen");
        System.out.println("2 checken locaties");
        System.out.println("3 lijst met locaties tonen");
        System.out.println();
        System.out.println("maak een keuze");

        int keuze = scanner.nextInt();
        scanner.nextLine();

        System.out.println("wie bent u?");
        String bron = scanner.nextLine();
        System.out.println("voer admin/ medewerker wachtwoord in");
        String wachtwoord = scanner.nextLine();

        Optie optie;

        if (bron.equals("admin")) {
            optie = new Admin();
            optie.showOpties(bron, wachtwoord, keuze);
        } else if (bron.equals("medewerker")) {
            optie = new Medewerker();
            optie.showOpties(bron, wachtwoord, keuze);
        } else {
            System.out.println("u heeft geen toegang");
        }
    }

}

