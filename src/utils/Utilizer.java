package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class Utilizer {
    private static Locale locale = new Locale.Builder().setLanguage("nl").setRegion("NL").build();
    private static NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

    /**
     * Biedt de mogelijkheid om op basis van invoer van bedrag en
     * (optioneel) precisie een valuta bedrag in euro's terug te
     * ontvangen, en met precisie het aantal decimalen te bepalen.
     * 
     * Bij het niet invoeren een precisie getal wordt deze standaard
     * teruggegeven met twee decimalen
     * @param bedrag voer een double waarden is
     * @return valuta in euro's
     */
    public static String euroBedrag(double bedrag) {
        return euroBedrag(bedrag, 2);
    }

    /**
     * Biedt de mogelijkheid om op basis van invoer van bedrag en
     * (optioneel) precisie een valuta bedrag in euro's terug te
     * ontvangen, en met precisie het aantal decimalen te bepalen.
     * @param bedrag voer een double waarden is
     * @param precisie voer int waarden om de decimalen te bepalen.
     * @return valuta in euro's
     */
    public static String euroBedrag(double bedrag, int precisie) {
        currencyFormatter.setMaximumFractionDigits(precisie);
        return currencyFormatter.format(bedrag);
    }
}
