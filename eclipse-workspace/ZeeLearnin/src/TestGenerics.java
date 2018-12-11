
public class TestGenerics {
	
	public <E> void printArray(E[] list){
		for(int i = 0; i < list.length;i++) {
			System.out.println(list[i]+", ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arrInteger = {1, 3, 5, 7, 9};
		Character[] arrChar = {'A','E','I','O','U'};
		Double[] arrDouble = {1.1, 2.2, 3.4,4.7,5.6};
		TestGenerics tg = new TestGenerics();
		tg.printArray(arrInteger);
		tg.printArray(arrChar);
		tg.printArray(arrDouble);
	}

}
