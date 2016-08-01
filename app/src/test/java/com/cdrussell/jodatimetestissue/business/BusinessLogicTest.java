package com.cdrussell.jodatimetestissue.business;

import org.joda.time.DateTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusinessLogicTest {

    @Test
    public void formatterShouldReturnDateInCorrectFormat() {
        BusinessLogic businessLogic = new BusinessLogic();
        DateTime date = DateTime.parse("2016-01-30T13:40:45");

        String expected = "2016 01 30, 13:40:45";
        String actual = businessLogic.formatDate(date);

        assertEquals(expected, actual);
    }

}