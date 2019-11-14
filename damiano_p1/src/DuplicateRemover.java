import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class DuplicateRemover {
    private Set<String> uniqueWords;

    public void remove(String dataFile) throws FileNotFoundException
    {
        String words;
        uniqueWords = new HashSet<String>();//adds only one of the items to array rather than multiple
        //hashset doesnt add duplicates
        Scanner scnr= new Scanner(new File(dataFile));

        while(scnr.hasNext()) //hasNext allows loop to go until returns null
        {
            words = scnr.next();
            uniqueWords.add(words);//
        }



    }// end remove method


    public void Write(String outputFile) throws IOException
    {
        FileWriter filewrite ;
        File file;
        String string ="";
        file = new File(outputFile);
        Iterator iterate;

        if(file.exists()) {
            filewrite = new FileWriter(file,false); // false writes over a file
            iterate = uniqueWords.iterator();

            while(iterate.hasNext())
            {
                string=(String)iterate.next();
                filewrite.write(string+"\n");
            }// end while

            filewrite.close();
            System.out.println("Success");

        }//end if
        else
        {

            file.createNewFile();
            filewrite = new FileWriter(file);
            iterate =uniqueWords.iterator();

            while(iterate.hasNext())
            {
                string=(String)iterate.next();

                filewrite.write(string+"\n");

            }//end while

            filewrite.close();
            System.out.println("Success");
        }//end else

    }// end write method

}
