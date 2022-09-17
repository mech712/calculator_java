import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class TestParser {

    @Test
    public void test1(){
        var p = new Parser(" 1+2+3");
        assertThrows(Exception.class, ()-> {p.parse();});
    }

    @Test
    public void test2(){
        var p = new Parser(" 1 +3");
        assertThrows(Exception.class, ()-> {p.parse();});
    }

    @Test
    public void test3(){
        var p = new Parser(" 1+ 3");
        assertThrows(Exception.class, ()-> {p.parse();});
    }

    @Test
    public void test4(){
        var p = new Parser("I +II");
        assertThrows(Exception.class, ()-> {p.parse();});
    }

    @Test
    public void test5(){
        var p = new Parser("I+ II");
        assertThrows(Exception.class, ()-> {p.parse();});
    }

    @Test
    public void test6(){
        var p = new Parser("1 + II");
        assertThrows(Exception.class, ()-> {p.parse();});
    }

    @Test
    public void test7(){
        var p = new Parser("1 df II");
        assertThrows(Exception.class, ()-> {p.parse();});
    }
}
