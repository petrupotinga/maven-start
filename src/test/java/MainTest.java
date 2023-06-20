import org.junit.*;
import static org.junit.Assert.*;


public class MainTest {
    @Test
    public void testSum(){
        int sum = new Main().sum(3, 5);
        assertEquals(8, sum);
    }
}
