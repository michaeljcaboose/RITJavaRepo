package Week_Five;
/**
* Purpose:     This subclass will communicate with the superclass Vehicle. 
*              It will take a Model, Color and Cost from user. It will show 
*              a menu option for Scooter Type and Engine Size of Scooter.
*              It will return to Order class to display the information 
*              about the Scooter       
*                                                     
* Date:        9/24/2016
* @author      Hardik Tanna
*/

public class Scooter extends Vehicle{

   final String [] SCOOTTYPE={"Gasoline", "Electric"};        //Array of Types of Scooter
   final String [] ENGINESIZE={"50cc", "150cc", "250cc"};      //Array of Engine Sizees of Scotter
   private final double[] MILEAGE = {5.6,6.3,7.1};
   //declaring private variables 
   private int scootType;
   private int engineSize;
   
   //constructor
   public Scooter() 
   {
      super();
      placeScootOrder();
   } 
       
   /**
   *Calling set methods.
   */
   public void placeScootOrder()
   {
      setScootType(showMenu("What type of scooter is this?", SCOOTTYPE));
      setEngineSize(showMenu("What is the size of the engine?", ENGINESIZE));
   }
   
   
    /**
   * return the gas mileage for every car type
   * @ return GASOLINE the constant GASOLINE defined in Vinfo
   * @ return ELECTRIC the constant ELECTRIC defined in Vinfo
   */
   public double gasMileage(){
	      double mileage = 0.0;
	      return mileage;}

   /**
   * Changes the Scooter Type
   * @param inSt The scooter type.
   */
   public void setScootType( int inSt )
   {
      scootType = inSt;
   }
   
   /**
   * Changes the engine size
   * @param inEz The engine size of scooter.
   */
   public void setEngineSize( int inEz )
   {
      engineSize = inEz;
   }

   /**
   * Gets the scooter type.
   * @return  the scooter type.
   */
   public String getScootType( )
   {
      return SCOOTTYPE[scootType];
   }
   
    /**
   * Gets the engine size.
   * @return  the engine size of scooter.
   */
   public String getEngineSize( )
   {
      return ENGINESIZE[engineSize];
   }
        
  /**
   * Returns the formated string of the Scooter
   * @return this formated string.
   */ 
   public String toString()
   { 
      return getClass() + "\n"+
              super.toString() +
             "\n\tType:\t"+ getScootType()+
             "\n\tTowing:\t"+ getEngineSize()+
             "\n\tMileage:\t"+ gasMileage();
   }//end of toString
   

}//end of class Scooter
