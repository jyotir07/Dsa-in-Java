import java.util.HashMap;
import java.util.Map;

public class dictonary {
    public static void main(String[] args) {

        // Engligh to Spanish dictonary
        Map<String,String> engToSpan = new HashMap<String,String>();
        // Putting things in the dictonary
        engToSpan.put("Monday", "Lunes");
        engToSpan.put("Tuesday", "Martes");
        engToSpan.put("Wednesday", "Miércoles");
        engToSpan.put("Thursday", "Jueves");
        engToSpan.put("Friday", "Viernes");
        engToSpan.put("Saturday", "Sábado");
        engToSpan.put("Sunday", "Domingo");
        // Printing things from the dictonary
        System.out.println(engToSpan.get("Monday"));
        System.out.println(engToSpan.get("Tuesday"));
        System.out.println(engToSpan.get("Wednesday"));
        System.out.println(engToSpan.get("Thursday"));
        System.out.println(engToSpan.get("Friday"));
        System.out.println(engToSpan.get("Saturday"));
        System.out.println(engToSpan.get("Sunday"));
        // Printing all the keys
        System.out.println(engToSpan.keySet()); 
        // Printing all the values
        System.out.println(engToSpan.values());
        /*
        NOTE:
        The values and keys are not stored in any specific order, but stored in an order wrt each other
        */
        System.out.println("The size of the dictonary: " + engToSpan.size());
        System.out.println();
        System.out.println();
        Map<String, Boolean> shoppingList = new HashMap<String, Boolean>();
        // Adding elememts to the shopping list
        shoppingList.put("Nutella", true);
        shoppingList.put("Jam", false);
        shoppingList.put("Bread", true);
        shoppingList.put("Milk", true);
        shoppingList.put("Curd", false);
        shoppingList.put("Rice", true);
        shoppingList.put("Coke", true);

        System.out.println(shoppingList.get("Nutella"));
        System.out.println(shoppingList.get("Bread"));
        System.out.println(shoppingList.get("Jam"));
        System.out.println(shoppingList.get("Rice"));
        System.out.println(shoppingList.get("Curd"));
    }
}