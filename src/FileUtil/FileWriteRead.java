package FileUtil;

import java.io.*;


public class FileWriteRead {
   public static void writeFile(String fileName, String message) {
       try {
            FileWriter fileWriter = new FileWriter("textFile",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(message);
            bufferedWriter.close();
   }catch (Exception e){
       e.printStackTrace();}
   }
   public static void readFile(String fileName) {
       try {
           FileReader fileReader = new FileReader("textFile");
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           System.out.println(bufferedReader.readLine());

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
