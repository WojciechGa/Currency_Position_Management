package com.wojciech;

import java.util.Calendar;

import static java.util.Calendar.YEAR;

/**
 * used to show simple date form calendar
 */
public interface ShowDate {

    static String showDate(Calendar cal){
        return String.format("%1$tF %<tT", cal);
    }
}
