/**
 * 
 * @author huangshengwei
 *
 * @param <E>
 */
public class   Set<E> implements SetInterface<E>{
	/** reference a current list*/
	private ListReferenceBased<E> list;
	
	/**
	 * default constructor
	 */
	public Set(){
		list =new ListReferenceBased<E>();
		
	}
	/**
	 * a constructor that takes a single argument of type E 
	 * and initializing the set to contain that object
	 * @param a
	 */
	public Set(E a){
		list= new ListReferenceBased<E>();
		this.insert(a);
	}
	/**
	 * copy constructor
	 * @param lst
	 */
	public Set(Set<E> lst)
	{
		list= new ListReferenceBased<E>(lst.list);
	}
	/**
	 * takes an element of type E 
	 * and insert it into the Set
	 * @param i
	 */
	@Override
	
	public void insert(E i) {
		if(!this.in(i))
		list.append(i);
	}
	/**
	 * take an array of element with type E
	 * and insert it into the set
	 * @param m
	 */
	@Override
	public void arrayInsert(E[] m) {
		for(int i=0;i<m.length;i++)
		{
			
			this.insert(m[i]);
		}
		
	}
	/**
	 * print out the coments of the set
	 */
	@Override
	public void print() {
		list.display();
	}
	/**
	 * union the setA and setB
	 * @param b
	 * @return union
	 */
	@Override

	
	public Set<E> union(SetInterface<E> b) {
		
		Set<E> union=new Set<E>(this);
		Set<E> extra=new Set<E>(b.difference(this));
		for(int i=1;i<=extra.setSize();i++)
		{
			union.insert(extra.list.get(i));
		}	
		return union;
	}
	/**
	 * intersect the setA and setB
	 * @param b
	 * @return interList
	 */
	@Override
	public Set<E> intersection(Set<E> b) {
		Set<E> interList = new Set<E>();
		for(int i=1;i<=list.size();i++)
		{
			if(b.in(list.get(i)))
			{
				interList.insert(list.get(i));
			}
		}
		
		return interList;
		
	}
	/**
	 * the diferences of setA and setB
	 * @param b
	 * @return difference
	 */
	@Override

	public Set<E> difference(SetInterface<E> b) {
		Set<E> difference=new Set<E>(this);
		for(int i=1;i<=this.setSize();i++)
		{
			if(b.in(this.list.get(i)))
			{
				difference.list.delete(this.list.get(i));
			}
		}

		return difference;
	}
	/**
	 * check whether the given E is contained in the set
	 * @param i
	 * if the element of the list > -1
	 * @return true otherwise
	 */
	@Override
	public boolean in(E i) {
		if(list.contains(i)>-1)
			return true;
		
		else
			return false;
			
	}
	/**
	 * @return the numbers of the element in the set 
	 * as an int value
	 */
	@Override
	public int setSize(){
		return list.size();
	}
}
