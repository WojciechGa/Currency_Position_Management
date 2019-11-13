package com.wojciech;

import java.util.Calendar;

import static java.util.Calendar.YEAR;

/**
 * used to show simple date form calendar
 */
public interface ShowDate {

    static String showDate(Calendar cal){
        return String.format("%4d-%02d-%02d %02d:%02d:%02d", cal.get(YEAR),cal.get(Calendar.MONTH),
                cal.get(Calendar.DAY_OF_MONTH),cal.get(Calendar.HOUR),cal.get(Calendar.MINUTE),
                cal.get(Calendar.SECOND) );
    }
}
