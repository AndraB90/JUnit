import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CubeTest {

    Cube cube;

    @BeforeEach
    public void setUp() {
        cube = new Cube();
    }

    @Test
    public void makeCubeOfNumberThree() {
        long volume = cube.makeCube(3);
        Assertions.assertEquals(27, volume);
    }
}
