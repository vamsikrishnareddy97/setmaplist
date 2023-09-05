package gcp;
import java.util.*;
public class CollectionExample {

	public static void main(String[] args) {
		
		        // Set example (HashSet)
		        Set<String> stringSet = new HashSet<>();
		        stringSet.add("Apple");
		        stringSet.add("Banana");
		        stringSet.add("Cherry");
		        stringSet.add("Banana"); // Duplicate, will be ignored

		        System.out.println("Set Example:");
		        for (String fruit : stringSet) {
		            System.out.println(fruit);
		        }

		        // List example (ArrayList)
		        List<Integer> integerList = new ArrayList<>();
		        integerList.add(10);
		        integerList.add(20);
		        integerList.add(30);
		        integerList.add(20); // Duplicate, will be kept

		        System.out.println("\nList Example:");
		        for (int num : integerList) {
		            System.out.println(num);
		        }

		        // Map example (HashMap)
		        Map<String, Integer> stringToIntegerMap = new HashMap<>();
		        stringToIntegerMap.put("One", 1);
		        stringToIntegerMap.put("Two", 2);
		        stringToIntegerMap.put("Three", 3);
		        stringToIntegerMap.put("Two", 22); // Update value for key "Two"

		        System.out.println("\nMap Example:");
		        for (Map.Entry<String, Integer> entry : stringToIntegerMap.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		}

	


