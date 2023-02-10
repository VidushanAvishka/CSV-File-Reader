/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;
import java.io.File;
import java.io.FileReader;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
/**
 *
 * @author SINGER
 */
public class Readfile {
public static String Word;
public static int id=1;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // creating file-------------------------------------
//  String filename="newtext.txt";   
 // File obj1=new File(filename);
 // obj1.createNewFile();
  
      /*  System.out.println("File name :" + obj1.getName());
        System.out.println("File name :" + obj1.getPath());
         System.out.println("File name :" + obj1.getAbsolutePath()); 
        System.out.println("File name :" + obj1.getParent());
         System.out.println("File name :" + obj1.exists());
          System.out.println("File name :" + obj1.canRead());
           System.out.println("File name :" + obj1.canWrite());
           
           */  //read file using scanner class----------------------------
      /*   File obj2=new File("newtext.txt");
         
           Scanner sc = new Scanner(obj2);
           while(sc.hasNext()){
               Word=sc.nextLine();
             String  Word2= Word.replaceAll("1|2|3|4|5|6|7|8|9|0","");
               System.out.println(sc.nextLine());
               
               
           }*/
         //read file using filereader class--------------------------
       FileReader obj3=new FileReader("newtext.txt");
         int i;
         while((i=obj3.read())!=-1)
             System.out.println((char)i);
         
         obj3.close();
         
    }
    
}
