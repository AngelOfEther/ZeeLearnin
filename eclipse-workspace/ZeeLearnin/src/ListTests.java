
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator; 

public class ListTests {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nameList = new ArrayList<>();
		nameList.add("Devin");
		nameList.add("Logan");
		nameList.add("Mitch");
		nameList.add("David");
		
		//for(String n : nameList) {
			//System.out.println(n);
		//}
		
		for(int i = 0; i < nameList.size();i++) {
			System.out.println("Names in forward order: " + nameList.get(i));
		}
		
		for(int i = nameList.size() - 1 ; i >= 0; i-- ) {
			System.out.println("Names in reverse order: " + nameList.get(i));
		}
		
		Iterator<String> nameListIterator = nameList.iterator();
		
		while(nameListIterator.hasNext()) {
			String c = nameListIterator.next();
			System.out.println("Iterator through list: "+c);
		}
		
		ListIterator<String> li = nameList.listIterator();
		
		while(li.hasNext()) {
			
			String d = li.next();
			System.out.println("ListIterator through list forward: "+d);
		}
		
		
		while(li.hasPrevious()) {
			String e = li.previous();
			System.out.println("ListIterator through list reverse: "+e);
			
		}
		
	}

}
