import java.util.*;
/**
 * Prints a table of multiole wind farms
 *
 * @author (Seifeldin Abdelwahab)

 */
public class WindFarmTable
{
    // instance variables - replace the example below with your own
    private String tableName;
    private ArrayList<IWindFarm> windFarms;
    private int nowindfarms;
    private double totPower;

    /**
     * Constructor for objects of class WindFarmTable
     */
    public WindFarmTable(String name)
    {
        name = tableName;
        windFarms = new ArrayList<IWindFarm>();
    }

    
    public void addPowerStation( IWindFarm powerStation)
    {
        windFarms.add(powerStation);
    }


    public double getTotalPower()
    {
        totPower = 0;
        for(IWindFarm windfarm : windFarms) 
        {
            totPower += windfarm.getCapacity();
        }
        
            return totPower;
    }

        


    void printTable()
    {

        
        System.out.printf("| %-66s | %-43s | %-43s |%n","Common Variables", "Spec. Variable WindFarm", "Spec. Variable PowerPlant"  );
        System.out.printf("| %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s | %-20s |%n","Name", "Country", "Capacity","No. of Turbines","Commisioned Year" ,"Construction start", "Construction Year", "LandSize SolarPark");
        System.out.printf("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------%n");
        

        for(IWindFarm windfarm : windFarms) 
        {
           System.out.println(windfarm.printFormat());
        }
        System.out.println("\n");
        System.out.println("Total power of wind farms: " + getTotalPower());
    }

}


