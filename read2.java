import java.io.*;
import java.lang.String;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Read2 {



    public static  void main(String[] args) throws FileNotFoundException {


        File file = new File("poezja.txt");


        String absoluteFile = file.getAbsolutePath();



        Scanner fileScanner = new Scanner(file);
        String text = " ";
        while(fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String actualValue = text.concat(" ") + line.concat(" ") + System.lineSeparator();
            text = actualValue;
        }


        int howLong = 0;
        String finalDocument = text;

        finalDocument = finalDocument.replaceAll(" ", "\n");
        finalDocument = finalDocument.replaceAll("\\n[\\n+ \\t]*\\n", "\n");

        Scanner docScanner = new Scanner(finalDocument);
        while(docScanner.hasNext()){
            String line = docScanner.nextLine();
            howLong++;
        }


        String[] poetryTab = new String[howLong];
        Scanner docScanner2 = new Scanner(finalDocument);
        for(int i = 1; i < howLong ; i++){
            String line = docScanner2.nextLine();
            poetryTab[i] = line;
        }


        PrintWriter write = new PrintWriter("poezja3.txt");
        write.println(finalDocument);
        write.close();
        System.out.print("\nPlik " + file.getName() + " zawiera " + howLong + " linijek\n\n");

        for(int i = 0; i < howLong ; i++ ){
            for(int j = 0; j< howLong; j++){
                if(i != j) {
                    if(poetryTab[i] == poetryTab[j]){

                        Word Poetry = new Word(poetryTab[i],2);
//                    }else(poetryTab[i] != poetryTab[j]){
//                            Word poetryTab[i] = new Word(poetryTab[i], 1);
                    }

                }
            }
        }







    }
}
