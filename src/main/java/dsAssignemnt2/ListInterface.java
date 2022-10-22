package dsAssignemnt2;

public interface ListInterface<T> {
	
	public abstract void add(T data);

	public abstract void add(int position,T data);
	

	public abstract void remove(int position);
	
	public abstract void clear();
	
	
	public abstract void replace(int position,T data);
	
	public abstract T getEntry(int position);
	
	public abstract Node[] toArray();
	
	public abstract boolean contains(T entry);
	
	public abstract int getLength();
	
	public abstract boolean isEmpty();
	
	
	public abstract void printList();
	

}
