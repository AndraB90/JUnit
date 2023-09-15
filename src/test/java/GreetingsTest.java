import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingsTest {

    Greetings greetings;

    @BeforeEach
    public void setUp(){
        greetings=new Greetings();
    }

    @Test
    public void sayHelloTest(){
        String word=greetings.sayHello();
        Assertions.assertEquals("Hello, World!", word);
    }
}
