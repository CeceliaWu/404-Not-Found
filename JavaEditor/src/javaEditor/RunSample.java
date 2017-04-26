package javaEditor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Cecelia
 */
public class RunSample {

     public static String printLines(String name, InputStream ins) throws Exception {
    String line = null;
    String result = null;
   // result = "";
//    result = "\n";
    BufferedReader in = new BufferedReader(
        new InputStreamReader(ins));
    while ((line = in.readLine()) != null) {
        result += name + " " + line + "\n";
    }
    if(result != null)
         result = result.substring(4);
    return result;
  }

  public static String runProcess(String command) throws Exception {
      String r1 = null;
      String r2 = null;
      
    Process pro = Runtime.getRuntime().exec(command);
    r1 = printLines(" ", pro.getInputStream());
    r2 = printLines(command + " stderr:", pro.getErrorStream());
    pro.waitFor();
    
   if(r2 ==null)
   {
         return r1;
   }
      
   else 
       return r2;
  }
    
}

