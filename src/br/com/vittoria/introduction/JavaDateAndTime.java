package br.com.vittoria.introduction;

import java.time.LocalDate;

/**
 * @author Vittoria Borotto
 *
 */
public class JavaDateAndTime {

    //NOTE: LocalDate is ideal for this situation with method getDayOfWeek()
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }
}
