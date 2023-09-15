import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordTurnTest {

    WordTurn wordTurn;

    @BeforeEach
    public void setUp() {
        wordTurn = new WordTurn();
    }

    @Test
    public void reverseWordTestWithandra() {
        String word = wordTurn.reverseWord("andra");
        Assertions.assertEquals("ardna", word);
    }
}
