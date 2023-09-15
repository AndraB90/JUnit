import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CreditTest {

    Credit credit;

    @BeforeEach
    public void setUp() {
        credit = new Credit();
    }

    @Test
    public void approveCreditIfScoreIs500(){
        String response = credit.approveCredit(500);
        Assertions.assertEquals("Declined", response);
    }

    @Test
    public void approveCreditIfScoreIs600(){
        String response = credit.approveCredit(600);
        Assertions.assertEquals("Maybe", response);
    }

    @Test
    public void approveCreditIfScoreIs700(){
        String response = credit.approveCredit(700);
        Assertions.assertEquals("We look forward to doing business with you!", response);
    }
}
