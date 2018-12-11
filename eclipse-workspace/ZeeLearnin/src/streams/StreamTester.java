package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streams.Employee.Gender;

public class StreamTester {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List
			// Ordered
			// Duplicates
		
		// Set
			// Unordered
			// Distinct
		
		// HashSet
			// Ordered
			// Distinct
		
		
		//Create list
		List<Employee> empList = Employee.createEmpList();
		
		//Get the names in uppercase of all the employee's who've worked for more than 2 years
		
			// Old Method
		List<String> names = new ArrayList<>();
		for(Employee emp : empList) {
			if(emp.getYearsInOrg() > 2) {
				names.add(emp.getName().toUpperCase());
			}
		}
		System.out.println(names);
		
		
		
			// Using Streams, abstraction from old concrete method.
		List<String> names2 = 
				empList.stream()
					.filter(Employee -> Employee.getYearsInOrg() > 2)
					.map(Employee::getName) 						// (Employee -> Employee.getname())
					.map(String::toUpperCase)						// (name -> name.toUpperCase())
					.collect(Collectors.toList());
				System.out.println(names2);

		// Get all the males
		empList.stream()
			.filter(Employee -> Employee.getGender() == Gender.MALE)
			.forEach(System.out::println); 
		
			/*
			 * The purpose of this style of programming,
			 * using lambdas, is to avoid MUTATION (methods that change, setters).
			 * 
			 * Avoid using .forEach to .add 
			 * 
			 * The goal is to EXTRACT the data as is, 
			 * do the TRANSFORMATIONS on the data to get
			 * what information we seek, then LOAD the information.
			 * 
			 * 
			 */
			 
		
		// Highest Salary
		
			// Total Salary
				System.out.println("One way of getting total Salary: "+
				empList.stream()
					.map(Employee::getSal)
					.reduce(0, (carry, sal) -> carry + sal)); 
				
			// Total Salary, another way
				System.out.println("Another way of getting total Salary: "+
						empList.stream()
							.map(Employee::getSal)
							.reduce(0, Integer::sum));
			
			// Total Salary, yet another way
				System.out.println("A third way of getting total Salary: "+
						empList.stream()
							.mapToInt(Employee::getSal)
							.sum()); 
				
			System.out.println("Employee record with most salary, Notice the Optional class ->"+
					empList.stream()
						.max((employee1, employee2) -> 	// Using Comparator as the local variable inside max() method
								employee1.getSal() > employee2.getSal() ? 1 : -1));	// Ternary operation 
			
		// Lowest Salary
			System.out.println("Employee record with least salary: "+
					empList.stream()
						.min((employee1, employee2) ->
								employee1.getSal() > employee2.getSal() ? 1 : -1));
			
		// Count the company seniors
		// within company for more than 3 years
			
			System.out.println("Amount of people who've been in the company for more than 3 years: "+
					empList.stream()
						.filter(employee -> employee.getYearsInOrg() > 3)
						.count());
			
			// Get the names of company seniors in uppercase
				
				List<String> names3 =
						empList.stream()
							.filter(employee -> employee.getYearsInOrg() > 3)
							.map(employee -> employee.getName().toUpperCase())
							.collect(	// Collect Messes with Concurrency for thread safety // Gives back a Supplier inside collect() method
									() -> new ArrayList<>(),			// Lines 118-120 is the same thing as toList()
									(list, name) -> list.add(name),		// 80% of time use toList(), for special cases 
									(list1, list2) -> list1.addAll(list2)// to do special things use this way
							);
				
				
				Map<String, Employee> map =
						empList.stream()
							.collect(Collectors.toMap(
						/* Key	*/	emp -> emp.getName() + ":" + emp.getYearsInOrg(), 
						/* Value */	e -> e)); // Replaced "employee" with "e" just to show the power of lambas. 
				
				System.out.println("Record of senior people in company: "+ map);
			
			//	
			
				Map<String, List<Employee>> map2 =
						empList.stream()
							.collect(Collectors.groupingBy(Employee::getName));
				
				map.forEach((k, v) ->
					System.out.println("Key - "+ k + " -- " +"Value - " + v)
					);
				
			//find first employee whose name is five letters but been in company for more than 3 years
				
				System.out.println(
				empList.stream()
					.filter(emp -> emp.getName().length() == 5)
					.filter(emp -> emp.getYearsInOrg() > 3)
					.findFirst());
				
			//Infinite Streams
				Stream.iterate(1, el -> el + 1)
					.filter(el -> el % 2 == 0)
					.limit(10)
					.forEach(System.out::println);
	}

}
