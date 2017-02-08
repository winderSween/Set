/**
 * 
 * @author huangshengwei
 *
 * @param <E>
 */
public interface SetInterface<E>  {
	/**
	 * takes an element of type E 
	 * and insert it into the Set
	 * @param i
	 */
	public void insert(E i);
	/**
	 * take an array of element with type E
	 * and insert it into the set
	 * @param m
	 */
	public void arrayInsert(E[] m);
	/**
	 * print out the comments of the set
	 */
	public void print() ;
	/**
	 * union the setA and setB
	 * @param b
	 * @return union
	 */
	public Set<E> union(SetInterface<E> b);
	/**
	 * intersect the setA and setB
	 * @param b
	 * @return interList
	 */
	public Set<E> intersection(Set<E> b) ;
	/**
	 * the diferences of setA and setB
	 * @param b
	 * @return difference
	 */
	public Set<E> difference(SetInterface<E> b);
	/**
	 * check whether the given E is contained in the set
	 * @param i
	 * if the element of the list > -1
	 * @return true otherwise
	 */
	public boolean in(E i);
	/**
	 * @return the numbers of the element in the set 
	 * as an int value
	 */
	public int setSize();

		
}
