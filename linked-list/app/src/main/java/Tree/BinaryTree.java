package Tree;

public class BinaryTree<T> {
    private Node<T> root;
    private String preOrderTree="";
    private String inOrderTree="";
    private String PostOrderTree="";


    public BinaryTree(T value) {
        Node<T> root= new Node<T>(value);
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public String preOrder(Node node){

        if (node !=null){
            System.out.println(node.getValue());
            preOrderTree +="<<"+node.getValue();
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        return preOrderTree;
    }
    public String inOrder(Node node){
        if (node !=null){
            inOrder(node.getLeft());
            inOrderTree +="<<"+node.getValue();
            System.out.println(node.getValue());
            inOrder(node.getRight());

        }
        return inOrderTree;
    }
    public String PostOrder(Node node){
        if (node !=null){
            PostOrder(node.getLeft());
            PostOrder(node.getRight());
            PostOrderTree +="<<"+node.getValue();
            System.out.println(node.getValue());
        }
        return PostOrderTree;

    }

    public int max(){
        int maxValue= (Integer) root.getValue();

        return findMax(root,maxValue);
    }

    private int findMax(Node node, int maxValue){
        if (node !=null){
            if ( maxValue < (Integer) node.getValue()){
                maxValue= (Integer) node.getValue();
            }
            findMax(node.getLeft(),maxValue);
            findMax(node.getRight(),maxValue);
        }
        return maxValue;

    }



}
