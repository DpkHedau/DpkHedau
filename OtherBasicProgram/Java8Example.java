
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Java8Example {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5, 12, 17, 34, 49,49,12, 60, 21, 8, 10,10,10);

		//Given a list of integers, write a Java 8 program using the Stream API to 
		//find the sum of all even numbers greater than 10 and less than 50.
		
		int sumOfInteger = numbers.stream()
				.filter(n->n>10 && n<50 && n%2 == 0)
				.mapToInt(Integer::intValue)
				.sum();
		System.out.println(sumOfInteger);
		
		
		//find the number which is even or odd using stream API.
		
		List<Integer> evenNumber = numbers.stream()
									.filter(n->n%2==0)
									.collect(Collectors.toList());
		System.out.println("evenNumber:::"+evenNumber);
		List<Integer> oddNumber =  numbers.stream()
									.filter(n-> n%2!=0)
									.collect(Collectors.toList());
		
		System.out.println("oddNumber:::"+oddNumber);

		Map<Boolean, List<Integer>> partitions = numbers.stream()
			    .collect(Collectors.partitioningBy(x -> x % 2 == 0));
		
			List<Integer> evens = partitions.get(true);
			List<Integer> odds = partitions.get(false);		
			
			
	/************************************************************/
			
		//Find all the Even Number from 1 to 200 using stream API
			
			
		/*
		 * IntStream.range(1, 200) .filter(n-> n%2==0) .forEach(System.out::println);
		 */
		List<Integer> OneTo200EvenNumber = IntStream.range(1,200)
											.filter(n ->n%2 ==0)
											.boxed()
											.collect(Collectors.toList());
		System.out.println(OneTo200EvenNumber);
		

		//Find all the odd Number from 1 to 200 using stream API
		
		
		/*
		 * IntStream.range(1, 200) .filter(n-> n%2!=0) .forEach(System.out::println);
		 */
		List<Integer> OneTo200OddNumber = IntStream.range(1,200)
				.filter(n ->n%2 !=0)
				.boxed()
				.collect(Collectors.toList());
		
		System.out.println(OneTo200OddNumber);

		/************************************************************/

	  //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		
		
		List<Integer> numberStartWithOne = numbers.stream()
											.filter(n -> Integer.toString(n).startsWith("1"))
											.collect(Collectors.toList());
		System.out.println(numberStartWithOne);
		
		//Given a list of integers, find out all the numbers end with 0  using Stream functions?
		
		
		List<Integer> numberEndWithZero = numbers.stream()
											.filter(n -> Integer.toString(n).endsWith("0"))
											.collect(Collectors.toList());
		System.out.println(numberEndWithZero);
		
		//Find All distinct number in the list
		
		List<Integer> distinctNumber =  numbers.stream()
										.distinct()
										.collect(Collectors.toList());
		System.out.println(distinctNumber);

				
		//Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		Integer countTotalNumber = (int) numbers.stream().count();
		System.out.println(countTotalNumber);
		

		//Given a list of integers, find the maximum value element present in it using Stream functions?
		
		Integer maximumNumber = numbers.stream().max(Integer::compare).get();
		System.out.println(maximumNumber);
		
		
		//Given a list of integers, sort all the values present in it using Stream functions?
		
		List<Integer> sortedList = numbers.stream()
										.sorted()
										.collect(Collectors.toList());
		System.out.println(sortedList);
		
		// Given a list of integers, sort all the values present in it in descending order using Stream functions?
		
		List<Integer> sortedDesendingList = numbers.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedDesendingList);

		//Find Duplicate using stream of List of Element
		
		List<Integer> duplicateElementList = numbers.stream()
													.filter(n->Collections.frequency(numbers, n)>1)
													.collect(Collectors.toList());
		System.out.println(duplicateElementList);
		Set<Integer> duplicateElecmentSet = new HashSet<Integer>(duplicateElementList);
		
		System.out.println(duplicateElecmentSet);

		//Java 8 program to perform cube on list elements and filter numbers greater than 50.
		
		 List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		 
		 List<Integer> cubeNumberAndFilter = integerList.stream()
				 								.map(n -> n*n*n)
				 								.filter(n -> n>50)
				 								.collect(Collectors.toList());
		 System.out.println(cubeNumberAndFilter);
		 
		 
		 //convert object into Uppercase in Java 8?
		 List<String> listOfString = Arrays.asList("fox", "apple", "banana", "cherry", "kiwi", "grape", "dog");
		 
		 List<String> upperCaseString = listOfString.stream()
				 									.map(String::toUpperCase)
				 									.collect(Collectors.toList());
		 System.out.println(upperCaseString);
		 
				 								
		//How to count each element/word from the String ArrayList in Java8?
		 
		 Map<String, Long> wordCount = listOfString.stream()
				 									 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		 
		 System.out.println(wordCount);
		 
		 /****************************************************************************************************/
		//How to count each character in String in java8?
		 String inputString = "DDDDDIIIIPPPAAK";
		 
		 Map<Character, Long> charCount = inputString.chars()    // Convert the string to an IntStream
	                .mapToObj(c -> (char) c)                  // Convert each int to a character
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Group by character and count occurrences
		 
		 
		 charCount.forEach((k,v)->System.out.println(k+"---"+v));
		 
		 Map<Object, Long> newCharCount = Arrays.stream(inputString.split(""))
								                 .map(String::toLowerCase)
								                 .collect(Collectors
								                 .groupingBy(str -> str, 
								                   LinkedHashMap::new, Collectors.counting()));
				 							
		 newCharCount.forEach((k,v)->System.out.println(k+"-1-"+v));

				 				

		 Map<String, Integer> mapCountChar =  new HashMap<String, Integer>();
		 String[] StringArray = inputString.split("");
	     for(String s:StringArray) {
	    	 Integer count = 0;
			try {
				count = countChar(StringArray,s);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	 mapCountChar.put(s,count);
	    	
	     }
	     
	     mapCountChar.forEach((k,v)->System.out.println("New Char Count:::::::::::::::"+k+"---"+v));
	     
	     
		 /****************************************************************************************************/

	     
	     //find the Maximum element in an array
	     
	     //int maxElementFromArray = Arrays.stream(numbers).max().getAsInt();
	     Integer maxElementFromArray = numbers.stream().max(Integer::compare).get();
	     
	     /*******************************************************************************************************/
	     
	     //numbers.stream().forEach(System.out::print);
	     
	     /****************************************************************************************************/
	     // Largest String from ArrayList
	     
		 List<String> fruitNameList = Arrays.asList("fox", "apple", "banana", "cherry", "kiwi", "grape", "dog");
		 Optional<String> largestLengthString = fruitNameList.stream().
				 											 max(Comparator.comparingInt(String::length));
		 largestLengthString.ifPresent(s->System.out.println("The largest String is:: "+s));
		 
		 
		 // Largest String from ArrayList
	     
		 List<String> sortListOfString = fruitNameList.stream()
				 										.sorted()
				 										.collect(Collectors.toList());
		 sortListOfString.forEach(Java8Example::printMessage);

	     

	}
	public static void printMessage(String message) {
		System.out.print("  "+message+",");
	}
	
	
	public static Integer countChar(String[] strArray,String str) {
		int countNew = 0;
		for(String ss:strArray) {
			
			if(ss.equalsIgnoreCase(str))
				countNew++;
			
		}
		
		return countNew;
		
	}

}
