import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructorTest {

    Constructor constructor = new Constructor("Anne", "White");

    @Test
    void returnsFirstName() {
        assertEquals("Anne", constructor.getFirstName());
    }

    @Test
    void returnsLastName() {
        assertEquals("White", constructor.getLastName());
    }

    @Test
    void returnsFullName() {
        assertEquals("Anne White", constructor.getFullName());
    }

}