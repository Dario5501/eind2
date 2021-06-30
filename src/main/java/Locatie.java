import java.util.ArrayList;
import java.util.Scanner;

public class Locatie {
    private String name;
    private int postCode;
    private String source;
    private String check;
    private ArrayList<Locatie> locaties = new ArrayList<>();
    private ArrayList<Locatie> niewLocaties = new ArrayList<>();

    public Locatie() {
        // This can be replace with query to database
        Locatie locatie = new Locatie("fruitstraat", 2323, null, "nee");
        Locatie locatie1 = new Locatie("janstraat", 2432, null, "ja");
        Locatie locatie2 = new Locatie("tonelstraat", 3456, null, "ja");
        locaties.add(locatie);
        locaties.add(locatie1);
        locaties.add(locatie2);
    }

    public Locatie(String name, int postCode, String source, String check) {
        this.name = name;
        this.postCode = postCode;
        this.source = source;
        this.check = check;
    }

    public void addlocatie(Locatie newLocatie, String incomingBron, String incomingAntwoord) {
        boolean sentMessage = false;

        for (Locatie loc : locaties) {
            if (newLocatie.getName().equals(loc.getName()) || newLocatie.getPostCode() == (loc.getPostCode())) {
                System.out.println(Berichten.getCancelOperationMessage("Locatie " + newLocatie.getName() + " bestaat al"));
                System.exit(0);
            } else {
                niewLocaties.add(newLocatie);
                sentMessage = true;
            }
        }

        if (sentMessage) {
            System.out.println(Berichten.getMessage(newLocatie, incomingAntwoord, incomingBron));
        }
    }

    public void printLocaties() {
        String berichtkop;
        berichtkop = "=================" + "\r\n";
        berichtkop += "= ALLE LOCATIES =" + "\r\n";
        berichtkop += "=================";
        System.out.println(berichtkop);

        for (Locatie locatie : locaties) {
            System.out.println("Straat naam:" + locatie.getName() + " " +
                    "postcode:" + locatie.getPostCode());
        }
    }

    public void getLocatiesCheck() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wat wilt u doen?");
        System.out.println();
        System.out.println("1.locatie gecheckted");
        System.out.println("2 checken niet gecheckted");
        System.out.println();
        System.out.println("maak een keuze");

        int keuze = scanner.nextInt();
        scanner.nextLine();

        if (keuze == 1) {
            for (Locatie loc : locaties) {
                if (loc.getCheck().equals("ja")) {
                    System.out.println("Straat naam: " + loc.getName() + " " +
                            "postcode: " + loc.getPostCode() + " " +
                            "gecheckt: " + loc.getCheck());
                }
            }

        } else if (keuze == 2) {
            for (Locatie loc : locaties) {
                if (loc.getCheck().equals("nee")) {
                    System.out.println("Straat naam: " + loc.getName() + " " +
                            "postcode: " + loc.getPostCode() + " " +
                            "gecheckt: " + loc.getCheck());
                }
            }
        }
    }


    public String getName() {
        return name;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getCheck() {
        return check;
    }

}

