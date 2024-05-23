import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BranchCompleteTest {

    // Branch Complete Test
    @Test
    public void testAllPositive() {
        PostiveCheck checker = new PostiveCheck(1, 2, 3);
        String expected = "a is positive\nb is positive\nc is positive\n";
        assertEquals(expected, checker.checkPositives());
    }

    @Test
    public void testAandCPositive() {
        PostiveCheck checker = new PostiveCheck(1, -1, 3);
        String expected = "a is positive\nc is positive\n";
        assertEquals(expected, checker.checkPositives());
    }

    @Test
    public void testAllNegative() {
        PostiveCheck checker = new PostiveCheck(-1, -1, -3);
        String expected = "";
        assertEquals(expected, checker.checkPositives());
    }


}