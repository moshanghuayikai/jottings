import java.net.*;
import java.io.*;

public class Main{
	public  static class MyURLClassLoader  extends  URLClassLoader { 
	   public  MyURLClassLoader() { 
	      super (getMyURLs()); 
	   } 

	   private   static  URL[] getMyURLs() { 
	    try  { 
	       return   new  URL[]{ new  File ("d:/").toURL()}; 
	    }  catch  (Exception e) { 
	       e.printStackTrace(); 
	       return   null ; 
	    } 
	  } 
	} 

	public static void main(String[] args) throws IOException{
	 try  { 
            MyURLClassLoader classLoader =  new  MyURLClassLoader(); 
            Class classLoaded = classLoader.loadClass("RMDIR"); 
            System.out.println(classLoaded.getName()); 
   
            classLoaded =  null ; 
            classLoader =  null ; 
  
           System.out.println(" ��ʼGC"); 
           System.gc(); 
           System.out.println("GC ���"); 
	   System.in.read();
         }  catch  (Exception e) { 
             e.printStackTrace(); 
         } 
	}
}
