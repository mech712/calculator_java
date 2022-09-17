import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestBasicEvaluator {
    @Test
    public void testAdding(){
        var a = new BasicEvaluator(1,2,"+");
        assertEquals(3, a.eval());
    }

    @Test
    public void testSubtraction(){
        var a = new BasicEvaluator(3,2,"-");
        assertEquals(1, a.eval());
    }

    @Test
    public void testSubtractionNegative(){
        var a = new BasicEvaluator(5,10,"-");
        assertEquals(-5, a.eval());
    }

    @Test
    public void testMultiply(){
        var a = new BasicEvaluator(5,3,"*");
        assertEquals(15, a.eval());
    }

    @Test
    public void testDivision(){
        var a = new BasicEvaluator(6,3,"/");
        assertEquals(2, a.eval());
    }

    @Test
    public void testDivisionFloat(){
        var a = new BasicEvaluator(10,3,"/");
        assertEquals(3, a.eval());
    }
}
