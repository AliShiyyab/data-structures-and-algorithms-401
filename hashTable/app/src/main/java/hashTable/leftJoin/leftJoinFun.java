package hashTable.leftJoin;

import hashTable.HashTable;

import java.util.*;

public class leftJoinFun {
    public List<String> leftJoin(HashMap hashMap1, HashMap hashMap2){
        List<String> list = new ArrayList<>();
        for(Object key: hashMap1.keySet()){
            if(hashMap1.containsKey(key)){
                list.add(key +  ": " + hashMap1.get(key)+ ", " + hashMap2.get(key));
            } else{
                list.add(key + ": " + hashMap1.get(key) + ", " + null);
            }
        }
        return list;
    }

    //RightJoin Stretch Goal
    public List<String> rightJoin(HashMap hashMap1, HashMap hashMap2){
        List<String> list = new ArrayList<>();
        for(Object key: hashMap2.keySet()){
            if(hashMap2.containsKey(key)){
                list.add(key +  ": " + hashMap2.get(key)+ ", " + hashMap1.get(key));
            } else{
                list.add(key + ": " + hashMap2.get(key) + ", " + null);
            }
        }
        return list;
    }
}
