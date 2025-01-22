import org.example.Main;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MainTest {
 Main main = new Main();


    @Test
    public void testSum(){
        assertEquals(14,main.sum(14,0));
    }
}
