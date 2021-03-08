/**
 * 
 * 
 * 
 * 
 */

import java.util.*;
import java.io.*;

public class FileCounting{

    // public static void main(String[] args){
        // C:\Users\user\Downloads\RMC Docs\CSCI213-01 Software Development\Labs\Lab3
        

        // Scanner scan = new Scanner(file);
        // while ( scan.hasNext() ) {
        //     names.add( scan.nextLine() );
        //     }
        //     scan.close();
    // }

    public static int numLines(String str) throw IOException {
        String fileLocation = "C:\\Users\\user\\Downloads\\RMC Docs\\CSCI213-01 Software Development\\Labs\\Lab3\\";
        String aFile = fileLocation.append(str);
        File file = new File(aFile);
        LineNumberReader reader = null;

        // String variable = "";
        // int count = 0;
        try{
        // code to try
        // and any dependent code
        reader = new FileReader(file));
        // Scanner scan = new Scanner(file);
        while ((reader.readLine())!=null)
        System.out.println("Count of lines - " + reader.getLineNumber());
        // return reader.getLineNumber();
        //    System.out.println();
        } catch (IOException e){
            // do something
            return -1;
            e.printStackTrace();
        } finally{
        if(reader= null)
            // reader.close();
            try {
                reader.close();
              } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
              }
        }
    return count;
    // System.out.printf("%s has %d lines.", str, count);
    }
    public static int wordCount(String str){
        // int count = 0;

        // File file = new File(str);
        // Scanner scan = new Scanner(file);
        // while ( scan.hasNext() ) {
        //     count = scan.nextInt();
        //     }
        //     scan.close();
        // return count;
        int count =0;
        System.out.println("Hello");
        return count;
    }

    public static ArrayList<String> uniqueWords(String str){
        // int count = 0;

        // File file = new File(str);
        // Scanner scan = new Scanner(file);
        // while ( scan.hasNext() ) {
        //     count = scan.nextInt();
        //     }
        //     scan.close();
        // return count;
        ArrayList<String> array = new ArrayList<>();
        System.out.println("Hello");
        return array;
    }


}