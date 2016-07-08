package module1;


import java.util.*;

public class ListOperations {

    public int elements;

    public ListOperations(int elements) {

        this.elements = elements;
    }

    public String executeArray() {
        StringBuilder sb = new StringBuilder("");
        List arrayList = new ArrayList();
        String append = sb.append(outputArray(arrayList)).toString();
       // System.out.println(append);
        return append;
    }
    public String executeLinked(){
        StringBuilder sb = new StringBuilder("");
        List linkedList = new LinkedList();
        String append = sb.append(outputLinked(linkedList)).toString();
       // System.out.println(append);
        return append;
    }

    public String outputArray(List arrayList) {

        long timeAddArray = addArrayList(arrayList);
        long timePopulateArray = populateArrayList(arrayList);
        long timeGetArray = getArrayList(arrayList);
        long timeRemoveArray = removeArrayList(arrayList);
        long timeContainsArray = containsArrayList(arrayList);
        long timeLiterAddArray = listIteratorArrayList(arrayList);
        long timeLiterRemoveArray = listIteratorRemoveArrayList(arrayList);

        String arrayListTable =  arrayList.getClass().getSimpleName()+"\t\t\t|\t"+timeAddArray+"\t\t\t|\t"+timeGetArray+"\t\t\t|\t"+timeRemoveArray+"\t\t\t|\t"+timeContainsArray+"\t\t\t|\t"+timePopulateArray+"\t\t\t|\t"+timeLiterAddArray+"\t\t\t|\t"+timeLiterRemoveArray;

        return arrayListTable;
    }

    public String outputLinked(List linkedList) {
        long timeAddLinked = addLinkedList(linkedList);
        long timePopulateLinked = populateLinkedList(linkedList);
        long timeGetLinked = getLinkedList(linkedList);
        long timeRemoveLinked = removeLinkedList(linkedList);
        long timeContainsLinked = containsLinkedList(linkedList);
        long timeLiterAddLinked = listIteratorLinkedList(linkedList);
        long timeLiterRemoveLinked = listIteratorRemoveLinkedList(linkedList);

        String linkedListTable =  linkedList.getClass().getSimpleName()+"\t\t\t|\t"+timeAddLinked+"\t\t\t|\t"+timeGetLinked+"\t\t\t|\t"+timeRemoveLinked+"\t\t\t|\t"+timeContainsLinked+"\t\t\t|\t"+timePopulateLinked+"\t\t\t|\t"+timeLiterAddLinked+"\t\t\t|\t"+timeLiterRemoveLinked;

        return linkedListTable;
    }


    private long addArrayList(List arrayList) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);

        long start = System.nanoTime();

        for (int i = 0; i <= elements; i++) {
            arrayList.add(i,arrayRandom);
        }
        long result = System.nanoTime() - start;

        return result;

    }

    private long addLinkedList(List linkedList) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();
        for (int i = 0; i <= elements; i++) {
            linkedList.add(i,arrayRandom);
        }
        long result = System.nanoTime() - start;

        return result;

    }

    private long getArrayList(List arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i <= elements; i++) {
            arrayList.get(i);
        }
        long result = System.nanoTime() - start;

        return result;

    }

    private long getLinkedList(List linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i <= elements; i++) {
            linkedList.get(i);
        }
        long result = System.nanoTime() - start;
        return result;
    }

    private long removeArrayList(List arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i <= elements; i++) {
            arrayList.remove(i);
        }
        long result = System.nanoTime() - start;
        return result;
    }

    private long removeLinkedList(List linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i <= elements; i++) {
            linkedList.remove(i);
        }
        long result = System.nanoTime() - start;
        return result;

    }

    private long containsArrayList(List arrayList) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();

            arrayList.contains(arrayRandom);

        long result = System.nanoTime() - start;
        return result;
    }
    private long containsLinkedList(List linkedList) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        long start = System.nanoTime();

            linkedList.contains(arrayRandom);

        long result = System.nanoTime() - start;
        return result;

    }

    public long populateArrayList(List arrayList) {
        long start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            arrayList.add(i);
        }
        long result = System.nanoTime() - start;

        return result;
    }


    public long populateLinkedList(List linkedList) {
        long start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            linkedList.add(i);
        }
        long result = System.nanoTime() - start;

        return result;

    }
    public long listIteratorArrayList(List arrayList) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        ListIterator listIterator = arrayList.listIterator();
        long start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            listIterator.add(arrayRandom);
        }
        long result = System.nanoTime() - start;

        return result;
    }


    public long listIteratorLinkedList(List linkedList) {
        Random random = new Random();
        int arrayRandom = random.nextInt(elements);
        ListIterator listIterator = linkedList.listIterator();

        long start = System.nanoTime();
        for (int i = 0; i < elements; i++) {
            listIterator.add(arrayRandom);
        }
        long result = System.nanoTime() - start;

        return result;
    }

    public long listIteratorRemoveArrayList(List arrayList) {

        ListIterator listIterator = arrayList.listIterator();
        long start = System.nanoTime();
        for (int i = 0; i < elements; i++)
            if (listIterator.hasNext()) {
                listIterator.next();
                listIterator.remove();
        }
        long result = System.nanoTime() - start;
        return result;
    }


    public long listIteratorRemoveLinkedList(List linkedList) {
        ListIterator listIterator = linkedList.listIterator();

        long start = System.nanoTime();
        for (int i = 0; i < elements; i++)
            if (listIterator.hasNext()) {
                listIterator.next();
                listIterator.remove();
        }
        long result = System.nanoTime() - start;
        return result;
    }

}