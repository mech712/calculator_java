import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestArabicCalculator {

    @Test
    public void test1(){
        assertEquals("11", new ArabicCalculator("1","10","+").calculate());
    }

    @Test
    public void test2_1(){
        assertEquals("5", new ArabicCalculator("8","3","-").calculate());
    }

    @Test
    public void test2_2(){
        assertEquals("-5", new ArabicCalculator("3","8","-").calculate());
    }

    @Test
    public void test3(){
        assertEquals("12", new ArabicCalculator("6","2","*").calculate());
    }

    @Test
    public void test4(){
        assertEquals("2", new ArabicCalculator("5","2","/").calculate());
    }
}
