import org.junit.Test;

import static org.junit.Assert.*;

public class PathCompleteTest {

    @Test
    public void testAllPositives() {
        PostiveCheck pc = new PostiveCheck(1, 1, 1);
        String result = pc.checkPositives();
        assertTrue(result.contains("a is positive"));
        assertTrue(result.contains("b is positive"));
        assertTrue(result.contains("c is positive"));
    }

    @Test
    public void testAandBPositivesCNegative() {
        PostiveCheck pc = new PostiveCheck(1, 1, -1);
        String result = pc.checkPositives();
        assertTrue(result.contains("a is positive"));
        assertTrue(result.contains("b is positive"));
        assertFalse(result.contains("c is positive"));
    }

    @Test
    public void testAandCPositivesBNegative() {
        PostiveCheck pc = new PostiveCheck(1, -1, 1);
        String result = pc.checkPositives();
        assertTrue(result.contains("a is positive"));
        assertFalse(result.contains("b is positive"));
        assertTrue(result.contains("c is positive"));
    }

    @Test
    public void testAOnlyPositive() {
        PostiveCheck pc = new PostiveCheck(1, -1, -1);
        String result = pc.checkPositives();
        assertTrue(result.contains("a is positive"));
        assertFalse(result.contains("b is positive"));
        assertFalse(result.contains("c is positive"));
    }

    @Test
    public void testCOnlyPositive() {
        PostiveCheck pc = new PostiveCheck(-1, -1, 1);
        String result = pc.checkPositives();
        assertFalse(result.contains("a is positive"));
        assertFalse(result.contains("b is positive"));
        assertTrue(result.contains("c is positive"));
    }

    @Test
    public void testNonePositive() {
        PostiveCheck pc = new PostiveCheck(-1, -1, -1);
        String result = pc.checkPositives();
        assertFalse(result.contains("a is positive"));
        assertFalse(result.contains("b is positive"));
        assertFalse(result.contains("c is positive"));
    }
}
