package tutorials;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testAddition() {
        assertEquals(12, Calc.add(2,10));
    }

    @Test
    void testSubtract() {
        assertEquals(2, Calc.subtract(4,2));
    }

}

