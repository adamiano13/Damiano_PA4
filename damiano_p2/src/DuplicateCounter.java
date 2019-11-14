import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class DuplicateCounter {
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>(); // stores words and number of times counted

    public void count (String dataFile) throws IOException {
        BufferedReader bufferRead = new BufferedReader(new FileReader(dataFile));
        String line = bufferRead.readLine(); // sets line to first string
        String[] temp =new String [1];
        temp[0] = line;
        int count2=0;
        //loop reads and temp saves words
        while(line != null){
            for (String s : temp) {
                if (wordCounter.containsKey(s)) {
                    int count = wordCounter.get(s);
                    wordCounter.put(s, count + 1);
                } else {
                    wordCounter.put(s, 1);
                }
            }
            count2++;
            temp = new String[count2];
            line = bufferRead.readLine();
        }// end while loop


    }// end count method

    public void write(String outputFile) throws IOException {
/*        FileWriter filewrite ;
        File file;

        //file = new File(outputFile);
  */      PrintWriter printwrite = new PrintWriter(outputFile);

        //    if(file.exists()) {
        //      filewrite = new FileWriter(file,false); // false writes over a file
        for(Map.Entry<String, Integer> entry : wordCounter.entrySet()){
            printwrite.println(entry.getKey()+" "+entry.getValue());

        }

        //    filewrite.close();
        printwrite.close();
        System.out.println("Success");
/*
        }//end if
        else
        {

            file.createNewFile();
            filewrite = new FileWriter(file);
            for(Map.Entry<String, Integer> entry : wordCounter.entrySet()){
                printwrite.println(entry.getKey()+" "+entry.getValue());

            }

            filewrite.close();
            System.out.println("Success");
       }//end else
 */
    }// end write method

}
