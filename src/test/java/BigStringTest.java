import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BigStringTest {

    BigString bigString;

    @BeforeEach
    public void setUp() {
        bigString = new BigString();
    }

    @Test
    public void toUpperCaseWordsLikeMyNameAndra() {
        String big = bigString.toUpperCaseWords("my name andra");
        Assertions.assertEquals("My Name Andra", big);

    }
}
