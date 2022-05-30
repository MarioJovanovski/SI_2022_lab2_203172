import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static java.util.Arrays.*;
import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void every_statement(){
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(asList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(asList("0", "#", "0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }

    @Test
    void every_branch(){
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(asList()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(asList("0", "#", "0", "#", "0")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        assertEquals(Arrays.asList("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(Arrays.asList("0", "#", "0", "0", "0", "#", "0", "#", "#")));
    }
}
