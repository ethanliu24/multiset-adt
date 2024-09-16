import java.lang.reflect.Array;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    private int root;
    private Tree[] subtrees;
    public Tree(int root, Tree[] subtrees) {
        this.root = root;
        if (subtrees == null){
            this._subtrees = new Tree[0];
        }
        else{
            this._subtrees = subtrees;
        }
    }
}
