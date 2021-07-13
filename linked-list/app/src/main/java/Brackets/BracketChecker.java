package Brackets;

public class BracketChecker {
    private int curly;
    private int parentheses;
    private int square;

    public BracketChecker() {
        curly =0;
        parentheses=0;
        square=0;

    }
    public boolean validateBrackets(String data){
        char [] chars = data.toCharArray();
        for( char ch:chars){
            if (ch == '{'){
                curly +=1;
            }else if(ch == '}'){
                curly -=1;
            }else if(ch == '['){
                square +=1;
            }else if(ch == ']'){
                square -=1;
            }else if(ch == '('){
                parentheses +=1;
            }else if(ch == ')'){
                parentheses -=1;
            }
        }

        return curly == 0 && parentheses == 0 && square == 0;
    }
}
