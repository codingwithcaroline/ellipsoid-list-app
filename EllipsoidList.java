import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*This class stores the name.
*of the list and an ArrayList of
*Ellipsoid objects.
*@author Caroline Kirkconnell
*@version 2/14/2020
*/
public class EllipsoidList {

   private String ellipsoidName;
   private ArrayList<Ellipsoid> eList;
   
   /** 
    *Following the constructor is a list. 
    *of methods that return the name of the
    *list, number of Ellipsoid objects in the
    *EllipsoidList, total volume, total surface
    *area, average volume, and average surface
    *area for all the Ellipsoid objects in the
    *EllipsoidList. The toString method returns
    *a String containing the name of the list, 
    *followed by each Ellipsoid in the ArrayList
    *and a summaryInfo method returns summary
    *information about the list.
    *@param ellipsoidNameIn for listName
    *@param eListIn for eList
    */
   public EllipsoidList(String ellipsoidNameIn, ArrayList<Ellipsoid> eListIn) {
      ellipsoidName = ellipsoidNameIn;
      eList = eListIn;
   }
    
    /** 
    *@return the Ellipsoid name
    */
   public String getName() {
      return ellipsoidName;
   }
   
    /** 
    *@return the number of Ellipsoids
    */
   public int numberOfEllipsoids() {
      return  eList.size();
   }
   
    /** 
    *@return the total volume for all Ellipsoid objects.
    */
   public double totalVolume() {
      double totalVolume = 0;
      int index = 0;
      while (index < eList.size()) {
         totalVolume += eList.get(index).volume();
         index++;
      }
      
      return totalVolume;
   }
   
    /** 
    *@return the total surface area for all Ellipsoid objects.
    */
   public double totalSurfaceArea() {
      double totalSArea = 0;
      int index = 0;
      while (index < eList.size()) {
         totalSArea += eList.get(index).surfaceArea();
         index++;
      }
      
      return totalSArea;
   }
   
   /**
   *@return the average volume for all Ellipsoid objects.
   */
   public double averageVolume() {
      double averageVol = 0;
      if (eList.size() > 0)
      {
         averageVol = totalVolume() / eList.size();
         return averageVol;
      }
      return averageVol;
   }
   /**
   *@return the average surface area for all Ellipsoid objects.
   */
   public double averageSurfaceArea() {
      double avgSArea = 0;
      if (eList.size() > 0)
      {
         avgSArea = totalSurfaceArea() / eList.size();
         return avgSArea;
      }
      return avgSArea;
   }

   /** 
   *@return String containing the name of
   *the list followed by each Ellipsoid in 
   *the ArrayList. 
   *(includes name of Ellipsoid and the ellipsoid objects)
   */
   public String toString() {
      String result = ellipsoidName + "\n";
      int index = 0;
      while (index < eList.size()) {
         result += "\n" + eList.get(index) + "\n"; 
         index++;  
      }   
      return result;
   }
   
    /** 
    *@return String containing the name of
    *the list followed by various summary items:
    *number of Ellipsoid objects, total volume,
    *total surface area, average volume, and average
    *surface area. 
    *(includes name of ellipsoids and results for various method calls)
    */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Ellipsoid Objects: " + numberOfEllipsoids();
      result += "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"; 
      result += "\nTotal Surface Area: "  
         + df.format(totalSurfaceArea()) + " square units";
      result += "\nAverage Volume: "  
         + df.format(averageVolume()) + " cubic units";
      result += "\nAverage Surface Area: " 
         + df.format(averageSurfaceArea()) + " square units";
    
      return result;
   }
}




