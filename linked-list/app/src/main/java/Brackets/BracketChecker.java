package Brackets;

import Queue.QueueLinkedLIst;
import Stack.StackLinkedList;

public class BracketChecker {
    private int curly;
    private int parentheses;
    private int square;

    public BracketChecker() {
        curly =0;
        parentheses=0;
        square=0;

    }
    //this is the old solution where it failed in checking this case "{[}]"
//    public boolean validateBrackets(String data){
//        char [] chars = data.toCharArray();
//        for( char ch:chars){
//            if (ch == '{'){
//                curly +=1;
//            }else if(ch == '}'){
//                curly -=1;
//            }else if(ch == '['){
//                square +=1;
//            }else if(ch == ']'){
//                square -=1;
//            }else if(ch == '('){
//                parentheses +=1;
//            }else if(ch == ')'){
//                parentheses -=1;
//            }
//        }
//
//
//        return curly == 0 && parentheses == 0 && square == 0;
//    }

    public boolean validateBrackets2(String data){
        QueueLinkedLIst queue= new QueueLinkedLIst<Character>();
        StackLinkedList stack = new StackLinkedList<Character>();
        char previousChar='a';
        char [] chars = data.toCharArray();
        for( char ch:chars){
            if(ch == previousChar){
                queue.dequeue();
            }else{
                if (ch == '{' || ch == '[' ||ch == '(') {
                    queue.enqueue(ch);
                }else{
                    stack.push(ch);
                }
            }
            previousChar=ch;
        }

        while( queue.isEmpty() == false){
            if (queue.dequeue() != stack.pop()){
                return false;
            }

        }

        return true;
    }
}
