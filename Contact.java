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
        
    }
}