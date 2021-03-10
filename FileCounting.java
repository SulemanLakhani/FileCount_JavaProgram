/**FileCounting.java
 * 
 * This Program....Calculates the line count, word count and uniquewords count of a file
 * Date:
 * 
 * class name FileCounting
 */

 import java.util.*;
import java.io.*;

public class FileCounting{
    // FileCounting counting = new FileCounting();

    public static void main(String[] args){
        
        if(args.length==2){
        String code = args[0];
        String file = args[1];

        if(code.equals("-a")){
            numLines(file);
            // System.out.printf("There are %d lines in the file %s", numLines(file), file);
            } else if(code.equals("-b")){
            wordCount(file);
            // System.out.printf("There are %d lines in the file %s", wordCount(file), file);
            } else if(code.equals("-c")){
            uniqueWords(file);
            // System.out.printf("There are %d lines in the file %s", uniqueWords(file).size(), file);
            } else if(code.equals("-d")){
                System.out.println("Code should be -a, -b, or -c.");
            }
        }
        if(args.length<2 || args.length>2){
                System.out.println("Too few arguments.");
                System.out.println("Please rerun with arguments: [code] [file]");
        }
    }


    /**
     * method to read the file and return the count of no. of lines in the file
     * @param str
     * @return count
     * 
     */
    public static int numLines(String str)  {
        int count = 0;
        try {
            File file = new File(str);
            Scanner scan = new Scanner(file);
            while( scan.hasNext() ) {
                scan.nextLine();
                count++;
            }
            scan.close();
          } catch(Exception e) {
            e.printStackTrace();
            return -1;
          }
    System.out.printf("There are %d lines in the file %s", count, str);
    return count;
    }

    /**
     * method to read the file and return the count of words in the file
     * @param str
     * @return count
     */
    public static int wordCount(String str){
        int count=0;

        try {
            File file = new File(str);
            Scanner scan1 = new Scanner(file);
            while( scan1.hasNext() ) {
                scan1.next();
                count++;
            }
            scan1.close();
        } catch(Exception e) {
            e.printStackTrace();
            return -1;
          }
        System.out.printf("There are %d words in the file %s", count, str);
        return count;
    }

    /**
     * method to read the file, also find and return the
     * words in the file as an arraylist without repetition
     * @param str
     * @return list
     */
    public static ArrayList<String> uniqueWords(String str){
        ArrayList<String> list = new ArrayList<String>();
        // int count = 0;
        
        try{
            File file = new File(str);
            Scanner scanner = new Scanner(file);
            while( scanner.hasNext() ){
                String line = scanner.next().replaceAll("\\p{Punct}+","").toLowerCase();
                String wordStrings[] = line.split("\\p{Space}+");
            for(String element: wordStrings){
                    if(!list.contains(element))
                    list.add(element);
                }
            }
            // count = list.size();
        System.out.printf("There are %d unique words in the file %s", list.size(), str);
        scanner.close();
        } catch(Exception e){
            e.printStackTrace();
            return null;
        }
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println("");
        return list;
    }

}