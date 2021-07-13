import Brackets.BracketChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsTest {
    BracketChecker bracket = new BracketChecker();


    @Test
    void ExpectTrue(){
        assertTrue(bracket.validateBrackets("()[[Extra Characters]]"));
    }
    @Test
    void ExpectFale(){
        assertFalse(bracket.validateBrackets("[({}]"));
    }

}
