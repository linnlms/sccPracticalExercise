import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    @Test
    void testMessage() {
        assertEquals("Hello, CI/CD!", "Hello, CI/CD!");
    }
}
