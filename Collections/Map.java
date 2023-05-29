import java.util.Map;
import java.util.HashMap;

//hashtable is synchronizedd works with 
// import java.util.Hashtable;


//Map enables to store data in key/value pair format instead of using indexes
//The keys are simply sets(ARE UNIQUE) but we can have similar vales (LIST)
//so we can say that Map is SET AND LIST combined

class MapDemo
{
    public static void main(String a[])
    {
        Map<String,Integer> students = new HashMap<>();

        // Instead of using add() like with set and list we use put() with map
        // basicaaly put will chck if data inserted has existing key if it does
        // the prev data will be replaced with the new data
        students.put("John", 98);
        students.put("Jane", 78);
        students.put("Doe", 68);
        students.put("Juma", 98);

        for(String key : students.keySet())
        {
            System.out.println(key + ":" + students.get(key));
        }
    }
}