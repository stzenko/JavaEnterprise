package module1;

import java.util.*;

/**
 * Created by Zenovii on 07.07.2016.
 */
public class SetOperations {

    public int elements;

    public SetOperations(int elements) {

        this.elements = elements;
    }

    public String executeHash() {
        Set hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("");
        String append = sb.append(outputHash(hashSet)).toString();
        // System.out.println(append);
        return append;
    }
    public String executeTree(){
        StringBuilder sb = new StringBuilder("");
        Set treeSet = new TreeSet();
        String append = sb.append(outputTree(treeSet)).toString();
        // System.out.println(append);
        return append;
    }

    public String outputHash(Set hashSet){
        long hashAdd = hashAdd(hashSet);
        long hashRemove = hashRemove(hashSet);
        long hashContains = hashContains(hashSet);
        long hashPopulate = hashPopulate(hashSet);
String result = (hashSet.getClass().getSimpleName()+"\t\t\t\t|\t"+hashAdd+"\t\t\t|\t"+"     "+"\t\t\t|\t"+hashRemove+"\t\t\t|\t"+hashContains+"\t\t\t|\t"+hashPopulate);
        return result;
    }

    public String outputTree(Set treeSet){
        long treeAdd = treeAdd(treeSet);
        long treeRemove = treeRemove(treeSet);
        long treeContains = treeContains(treeSet);
        long treePopulate =treePopulate(treeSet);
        String result = (treeSet.getClass().getSimpleName()+"\t\t\t\t|\t"+treeAdd+"\t\t\t|\t"+"     "+"\t\t\t|\t"+treeRemove+"\t\t\t|\t"+treeContains+"\t\t\t|\t"+treePopulate);
        return result;
    }

        public long hashAdd(Set hashSet) {
    Random random = new Random();
    int arrayRandom = random.nextInt(elements);
    long start = System.nanoTime();
            for(int i=0; i<elements;i++){
                hashSet.add(arrayRandom);
            }

    long result = System.nanoTime() - start;
    return result;
}

    public long treeAdd(Set treeSet) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();
        for(int i=0; i<elements;i++) {
            treeSet.add(arrayRandom);
        }
        long result = System.nanoTime() - start;
        return result;
    }


    public long hashRemove(Set hashSet) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();
        for(int i=0; i<elements;i++){
            hashSet.remove(arrayRandom);
        }

        long result = System.nanoTime() - start;
        return result;
    }

    public long treeRemove(Set treeSet) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();
        for(int i=0; i<elements;i++) {
            treeSet.remove(arrayRandom);
        }
        long result = System.nanoTime() - start;
        return result;
    }

    public long hashContains(Set hashSet) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();
        for(int i=0; i<elements;i++){
            hashSet.contains(arrayRandom);
        }

        long result = System.nanoTime() - start;
        return result;
    }

    public long treeContains(Set treeSet) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();
        for(int i=0; i<elements;i++) {
            treeSet.contains(arrayRandom);
        }
        long result = System.nanoTime() - start;
        return result;
    }

    public long hashPopulate(Set hashSet) {

        long start = System.nanoTime();
        for(int i=0; i<elements;i++){
            hashSet.contains(i);
        }

        long result = System.nanoTime() - start;
        return result;
    }

    public long treePopulate(Set treeSet) {

        long start = System.nanoTime();
        for(int i=0; i<elements;i++) {
            treeSet.contains(i);
        }
        long result = System.nanoTime() - start;
        return result;
    }



}
