package MockExam_1.Question_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoStringTest {

    @Test
    public void testIsEmptyWithEmptyList() {
        ILoString emptyList = new LoString();
        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testIsEmptyWithNonEmptyList() {
        ILoString nonEmptyList = new LoString("A", new LoString("B", new LoString()));
        assertFalse(nonEmptyList.isEmpty());
    }

    @Test
    public void testGetFirst() {
        ILoString list = new LoString("A", new LoString("B", new LoString()));
        assertEquals("A", list.getFirst());
    }

    @Test
    public void testGetRest() {
        ILoString list = new LoString("A", new LoString("B", new LoString()));
        ILoString rest = list.getRest();
        assertEquals("B", rest.getFirst());
    }

    @Test
    public void testInterleave() {
        ILoString list1 = new LoString("A", new LoString("C", new LoString("E", new LoString())));
        ILoString list2 = new LoString("B", new LoString("D", new LoString("F", new LoString())));
        ILoString interleaved = list1.interleave(list2);
        ILoString expected = new LoString("A", new LoString("B", new LoString("C", new LoString("D", new LoString("E", new LoString("F", new LoString()))))));
        while(interleaved.getRest() != null) {
            assertEquals(expected.getFirst(), interleaved.getFirst());
            expected = expected.getRest();
            interleaved = interleaved.getRest();
        }
    }

    @Test
    public void testUnzip() {
        ILoString input = new LoString("A", new LoString("B", new LoString("C", new LoString("D", new LoString()))));
        PairOfLists result = input.unzip();
        ILoString expectedFirst = new LoString("A", new LoString("C", new LoString()));
        ILoString expectedSecond = new LoString("B", new LoString("D", new LoString()));
        PairOfLists expected = new PairOfLists(expectedFirst, expectedSecond);
        ILoString resultFirst = result.first;
        ILoString resultSecond = result.second;
        while (expectedFirst.getRest() != null) {
            assertEquals(expectedFirst.getFirst(), resultFirst.getFirst());
            assertEquals(expectedSecond.getFirst(), resultSecond.getFirst());
            expectedFirst = expectedFirst.getRest();
            expectedSecond = expectedSecond.getRest();
            resultFirst = resultFirst.getRest();
            resultSecond =resultSecond.getRest();
        }
    }
}