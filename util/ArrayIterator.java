package ku.util;
import java.util.Iterator;
import java.util.NoSuchElementException;
/**
 * The class that iterate element into an array.
 * @author Triwith Mutitakul 
 *
 * @param <T> type of the array.
 */
public class ArrayIterator<T> implements Iterator<T> {
	private T[ ] array;
	private int cursor = 0;
	private boolean removed = false;
	/**
	* Initialize a new array iterator with the array to process.
	* @param array is the array to iterate over
	*/
	public ArrayIterator(T[] array){
		this.array = array;
		
	}
	/**
	 * return true if this array has another element.
	 */
	@Override
	public boolean hasNext(){
		for(;cursor<array.length&&array[cursor]==null;cursor++){}
		if(cursor<array.length&&array[cursor]!=null){
			this.removed=true;
			return true;
		}
		else return false;
	}
	/**
	* Return the next non-null element from array, if any.
	* @return the next non-null element in the array.
	* @throws NoSuchElementException if there are no more elements
	* to return.
	*/
	@Override
	public T next(){
		if(hasNext()){
			cursor++;
			return array[cursor-1];
		}
		else throw new NoSuchElementException();
	}
	/**
	 * Remove recent element returned by next() from the array by setting it to null.
	 * @throws IllegalStateException If this method is called without calling next(). or called more than once after calling next(),
	 */
	public void remove(){
		if(removed){
			this.array[cursor-1]=null;
			this.removed=false;
		}
		else throw new IllegalStateException();
	}
}
