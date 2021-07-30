import Brackets.BracketChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketsTest {
    BracketChecker bracket = new BracketChecker();


    @Test
    void ExpectTrue(){
        assertTrue(bracket.validateBrackets2("()[[Extra Characters]]"));
    }
    @Test
    void ExpectFale(){
        assertFalse(bracket.validateBrackets2("[({}]"));
    }
    @Test
    void ExpectFale2(){
        assertFalse(bracket.validateBrackets2("{[}]"));
    }

}
