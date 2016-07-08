package module1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EfficiencyCollections {

    public static void main(String[] args) throws IOException {
EfficiencyCollections efficiencyCollections = new EfficiencyCollections();
        int[] elements = {1000, 10000, 100000};

        for (int i = 0; i < elements.length; i++) {
            efficiencyCollections.writeToFile(elements[i]);
        }

    }
    public void writeToFile(int elements) throws IOException {

        final File result = new File("src\\module1\\result.txt");

    ListOperations listOperations = new ListOperations(elements);
    SetOperations setOperations = new SetOperations(elements);

        FileWriter fileWriter = new FileWriter(result,true);
        String title = (elements+" elements\t\t|\t\tAdd"+"\t\t\t|\tGet"+"\t\t\t\t|\t\tRemove\t\t|\tContains\t\t\t|\tPopulate\t\t\t|\tLiterAd\t\t\t|\tLiterRemove");
        String arrayListResult = listOperations.executeArray();
        String linkedListResult = listOperations.executeLinked();
        String hashSet = setOperations.executeHash();
        String treeSet = setOperations.executeTree();
        String linear = "____________________________________________________________________________________________________________________________________________________________________";

        System.out.println(linear);
        System.out.println(title);
        System.out.println(arrayListResult);
        System.out.println(linkedListResult);
        System.out.println(hashSet);
        System.out.println(treeSet);
        System.out.println(linear);

    fileWriter.write(linear + "\n");
    fileWriter.write(title + "\n");
    fileWriter.write(arrayListResult + "\n");
    fileWriter.write(linkedListResult + "\n");
    fileWriter.write(hashSet + "\n");
    fileWriter.write(treeSet + "\n");
    fileWriter.write(linear + "\n");
    fileWriter.flush();


    }


    }


