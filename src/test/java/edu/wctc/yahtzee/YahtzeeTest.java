package edu.wctc.yahtzee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YahtzeeTest {
    @Test
    void rollPairTest()
    {
        int hand[] = {1, 1, 2, 3, 4};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("One pair", result);
    }
    @Test
    void rollOneTest()
    {
        int hand[] = {1, 5, 2, 3, 4};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("One of a kind", result);
    }
    @Test
    void rollThreeTest()
    {
        int hand[] = {1, 1, 1, 3, 4};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("Three of a kind", result);
    }
    @Test
    void rollFourTest()
    {
        int hand[] = {1, 1, 1, 1, 4};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("Four of a kind", result);
    }
    @Test
    void rollTwoPairTest()
    {
        int hand[] = {1, 1, 2, 2, 4};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("Two pair", result);
    }
    @Test
    void rollFullHouseTest()
    {
        int hand[] = {1, 1, 1, 3, 3};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("Full house", result);
    }
    @Test
    void rollYahtzeeTest()
    {
        int hand[] = {1, 1, 1, 1, 1};
        String result;
        result = Yahtzee.yahtzee(hand);
        assertEquals("Yahtzee", result);
    }
}
