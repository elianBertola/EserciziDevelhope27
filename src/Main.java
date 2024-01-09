import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        //creazione data
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");

        //formattazione data
        String dateShort = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        String dateMedium = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateFull = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

        //stampa date formattate
        System.out.println("Short: " + dateShort + "\nMedium: " + dateMedium + "\nFull: " + dateFull);
    }
}