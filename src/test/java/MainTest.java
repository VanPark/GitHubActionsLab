import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void hypotenuse(){
        Assertions.assertEquals(5, Main.hypotenuse(3,4));
    }
}