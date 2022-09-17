import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class TestRomeCalculator {

    @Test
    public void test1() throws Exception{
        assertEquals("III", new RomeCalculator("I","II","+").calculate());
    }

    @Test
    public void test2_1() throws Exception {
        assertEquals("V", new RomeCalculator("VIII","III","-").calculate());
    }

    @Test
    public void test2_2()throws Exception {
        assertThrows(Exception.class, ()-> {new RomeCalculator("III","VIII","-").calculate();});
    }

    @Test
    public void test3() throws Exception {
        assertEquals("VI", new RomeCalculator("III","II","*").calculate());
    }

    @Test
    public void test4() throws Exception {
        assertEquals("II", new RomeCalculator("VII","III","/").calculate());
    }
}
