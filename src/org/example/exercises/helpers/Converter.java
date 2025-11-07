package org.example.exercises.helpers;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    public static String toCurrency(int amount) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(indonesia);

        return rupiahFormat.format(amount);
    }
}
