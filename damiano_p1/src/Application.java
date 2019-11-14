import java.io.IOException;
public class Application {
    public static void main(String[] args) throws IOException {

        DuplicateRemover removeDuplicate = new DuplicateRemover();
        removeDuplicate.remove("problem1.txt"); //calls remove function
        removeDuplicate.Write("unique_words.txt"); // writes to  a file

    }//end main
}
