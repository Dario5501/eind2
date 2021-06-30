import java.util.Scanner;

public class AdminLocatieDetails implements LocatieDetails{

    @Override
    public void toevoegenLocatieDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Locatie details: ");
        String locatieDetails = scanner.nextLine();
    }
}
