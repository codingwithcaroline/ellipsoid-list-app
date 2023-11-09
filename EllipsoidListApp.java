/**
*This program defines.
*Ellipsoid objects.
*@author Caroline Kirkconnell
*@version 2/14/2020
*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*This program defines.
*Ellipsoid objects.
*@author Caroline Kirkconnell
*@version 2/14/2020
*/
/** 
 * EllipsoidListApp - uses TriangleList and Triangle classes.
 */
public class EllipsoidListApp {

/**
 * Reads file with triangle data, creates TriangleList, prints TriangleList,
 * prints summary of TriangleList.
 *
 * @param args - is not used.
 * @throws FileNotFoundException required by Scanner for File
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
   
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName));
   
      String ellipsoidListName = scanFile.nextLine();
      
      while (scanFile.hasNext()) {
      
         String label = scanFile.nextLine();
         double a = Double.parseDouble(scanFile.nextLine());
         double b = Double.parseDouble(scanFile.nextLine());
         double c = Double.parseDouble(scanFile.nextLine());
         
         Ellipsoid e = new Ellipsoid(label, a, b, c);
         myList.add(e);           
      }
      scanFile.close();
      
      EllipsoidList myEllipsoidList 
         = new EllipsoidList(ellipsoidListName, myList);
   
      System.out.println("\n" + myEllipsoidList);
      
      System.out.println("\n" 
         + myEllipsoidList.summaryInfo());                          
   }

}