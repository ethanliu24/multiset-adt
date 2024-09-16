import java.lang.reflect.Array;

public class Tree {
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    private int root;
    private int[] _subtrees;
    public Tree(int root, int[] subtrees) {
        this.root = root;
        if (subtrees == null){
            this._subtrees = new int[0];
        }
        else{
            this._subtrees = subtrees;
        }

    }

}
