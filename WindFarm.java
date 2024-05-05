
/**
 * Stores the data and information of a wind farm.
 *
 * @author (Seifeldin Abdelwahab)
 */
public class WindFarm implements IWindFarm
{
    // instance variables - replace the example below with your own
    private String farmName;
    private String farmCountry;
    private Double farmCapacity;
    private int turbines;
    private int dateYear;

    /**
     * Constructor for objects of class WindFarm
     */
    public WindFarm(String name, String country, double capacity, int numberTurbines, int year)
    {
        farmName = name;
        farmCountry = country;
        farmCapacity = capacity;
        turbines = numberTurbines;
        dateYear = year;
        
    
    }
    
    public Double getCapacity()
    {
        return farmCapacity;
    }


    public String printFormat()
    {
        String s = String.format("%16s%16.3f%20s%10d%16d\n", farmName, farmCapacity, farmCountry,turbines, dateYear);
        return s; 
    }

    public void print()
    {

                System.out.format("%16s%16.3f%20s%10d%16d\n", farmName, farmCapacity, farmCountry,turbines, dateYear);

        //System.out.println(farmName + ", Capcity(MW): " + farmCapacity + ", Country: " + 
        //farmCountry + ", Number of turbines: " + turbines + ", Year:" +dateYear);
    }
}
