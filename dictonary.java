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
    }
}