import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Contact {
    //Scanner to get user input
    static Scanner scanner=new Scanner(System.in);

    //HashMap to store name and number
    static Map<String, Integer> details = new HashMap<String, Integer>();

    //Method that inserts name and number to the details HashMap
    public static void mapDetails (String entry_name,int entry_number){
        details.put(entry_name,entry_number);
    }

    //enter contacts
    public static void contactEntry (int n){
        String name;//name of contact
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
    }

    public static void numberConstraints (int numOfEntries) {
        //make sure number of entries is greater than 1 and less than 100,000
        if(numOfEntries >= 1 && numOfEntries <= 100000){
            //call method to enter contact
            contactEntry(numOfEntries);
        } else {
            //if the number is not within given constraints
            System.out.println("Please Enter A Number Between 1 and 100,000 To Continue");
            int newNumber = scanner.nextInt();
            numberConstraints(newNumber);
        }
        scanner.close();
    }

    public static void main (String[]args){
        //number of contacts to be added
        int number = scanner.nextInt();
        numberConstraints(number);
    }
}