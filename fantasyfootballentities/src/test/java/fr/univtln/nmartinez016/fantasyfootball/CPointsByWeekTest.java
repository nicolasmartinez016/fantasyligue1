package fr.univtln.nmartinez016.fantasyfootball;

import fr.univtln.nmartinez016.fantasyfootball.entities.CPointsByWeek;
import junit.framework.TestCase;

/**
 * Created by marti on 03/11/2016.
 */
public class CPointsByWeekTest extends TestCase {

    public final String ERROR_IN_ADD_POSITIVE_POINTS_BY_WEEK = "error in add positive points by week";
    public final String ERROR_IN_ADD_NEGATIVE_POINTS_BY_WEEK = "error in add negative points by week";

    public void testAddPositivePointsByWeek() throws Exception {
        CPointsByWeek lPointsByWeek = new CPointsByWeek();
        int lInitialPoints = lPointsByWeek.getPoints();
        int lPointsToAdd = 5;
        lPointsByWeek.addPoints(lPointsToAdd);
        assertEquals(ERROR_IN_ADD_POSITIVE_POINTS_BY_WEEK, lInitialPoints + lPointsToAdd, lPointsByWeek.getPoints());
    }

    public void testAddNegativePointsByWeek() throws Exception {
        CPointsByWeek lPointsByWeek = new CPointsByWeek();
        int lInitialPoints = lPointsByWeek.getPoints();
        int lPointsToAdd = -5;
        lPointsByWeek.addPoints(lPointsToAdd);
        assertEquals(ERROR_IN_ADD_NEGATIVE_POINTS_BY_WEEK, lInitialPoints + lPointsToAdd, lPointsByWeek.getPoints());
    }
}
