package hashTable.Intersection;

import hashTable.BinaryTree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeInsertion<T> {
    public List<T> treeInsertion(BinaryTree first , BinaryTree second){
        List<T> list1 = first.preOrder(first.getRoot());
        List<T> list2 = second.preOrder(second.getRoot());
        int min;
        if (list1.size() < list2.size()){
            min = list1.size();
        }
        else{
            min = list2.size();
        }
        List<T> newEmptyList = new ArrayList<>();
        for (int i = 0 ; i < min ; i++){
            if (list1.get(i).equals(list2.get(i))){
                newEmptyList.add(list1.get(i));
            }
        }
        return newEmptyList;
    }
}
