package dsAssignment1;

public interface ListInterface<T> {
	
	
	public abstract void add(T data);//done

	public abstract void add(int position,T data);//done
	

	public abstract void remove(int position);//done
	
	public abstract void clear();//done
	
	
	public abstract void replace(int position,T data);//done
	
	public abstract T getEntry(int position);//done
	
	public abstract Node[] toArray();
	
	public abstract boolean contains(T entry);//done
	
	public abstract int getLength();
	
	public abstract boolean isEmpty();
	
	
	public abstract void printList();
	

}
