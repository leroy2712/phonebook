import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Contact {
    //Scanner to get user input
    static Scanner scanner=new Scanner(System.in);

    //HashMap to store name and number
    static Map<String,Number>details=new HashMap<String,Integer>();

    //Method that inserts name and number to the details HashMap
    public static void mapDetails (String entry_name,int entry_number){
        details.put(entry_name,entry_number);
    }

    public static void main (String[]args){
        int n = scanner.nextInt();//number of contacts to be added
        Sring name;//name of contact
        int number;//phone number of contact

        //loop to insert n number of contacts into details HashMap
        for (int i = 0; i < n; i++) {
            name = scanner.next();
            number = scanner.nextInt();
            mapDetails(name, number);
        }

        //loop to check if name entered is in the details hashmap
        while (scanner.hasNext()) {
            String search = scanner.next();

            if (details.containsKey(search)) {
                //if name is found
                System.out.println(search + "=" + details.get(search));
            } else {
                //if name isn't found
                System.out.println("Not Found");
            }
        }
        scanner.close();
    }
}