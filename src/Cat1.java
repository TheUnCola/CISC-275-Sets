import java.util.HashSet;

public class Cat1 {
	String name;
	
	public Cat1(String n) {
		this.name = n;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public HashSet<Cat1> union(HashSet<Cat1> c1, HashSet<Cat1> c2) {
		HashSet<Cat1> c3 = new HashSet<Cat1>();
		c3.addAll(c1);c3.addAll(c2);
		return c3;
	}
	
	public HashSet<Cat1> intersection(HashSet<Cat1> c1, HashSet<Cat1> c2) {
		c1.retainAll(c2);
		return c1;
	}
}
