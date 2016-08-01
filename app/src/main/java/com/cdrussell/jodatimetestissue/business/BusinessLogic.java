package com.cdrussell.jodatimetestissue.business;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Uses JodaTime but does not use Android
 * <p>
 * Want to be able to write pure JUnit tests against this, without needing Android/Robolectric
 */
public class BusinessLogic {

    private DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy MM dd, HH:mm:ss");

    public String formatDate(DateTime dateTime) {
        return formatter.print(dateTime);
    }
}
