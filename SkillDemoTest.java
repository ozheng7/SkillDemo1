import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test
    public void togetherTest() {
        assertEquals("hi person", SkillDemo.together("hi", " person")); // test that fails because the arguments have a space while the expected is spaceless
        // nwo the test works because the space was added
    }
}
