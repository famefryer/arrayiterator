package ku.util;
import java.util.Iterator;
public class test {
	public static void main(String[] args){
		String[] s = {"Dos","Monkey",null,null,"Jack"};
		ArrayIterator<String> test = new ArrayIterator<String>(s);
		
//		System.out.println(test.hasNext());
//		
//		System.out.println(test.next());
//		test.remove();
		System.out.println(test.next());
		test.remove();
		System.out.println(test.next());
		System.out.println(s[0]);
		
	
		
		
		
	
		
	
	}

}
