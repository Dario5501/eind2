public class Berichten {
    public static String bericht;

    public static String getMessage(Locatie locatie, String antwoord, String bron) {
        bericht = "\r\n===============================================\r\n";
        bericht += "Locatie is toegevoegd" + "\r\n";
        bericht += "Locatie naam: " + locatie.getName() + "\r\n";
        bericht += "Locatie postCode: " + locatie.getPostCode() + "\r\n";
        bericht += "Locatie gecheckt: " + antwoord + "\r\n";
        bericht += "Locatie is toegevoegd door: " + bron;
        bericht += "\r\n===============================================\r\n";
        return bericht;
    }

    public static String getCancelOperationMessage(String cancellingReason) {
        bericht = "\r\n===============================================\r\n";
        bericht += "CANCELLING OPERATION" + "\r\n";
        bericht += "Reason: " + cancellingReason;
        bericht += "\r\n===============================================\r\n";
        return bericht;
    }

}

