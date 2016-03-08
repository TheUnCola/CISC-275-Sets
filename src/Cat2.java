
public class Cat2 extends Cat1 {
	
	public Cat2(String n) {
		super(n);
	}
	
	@Override
	public boolean equals(Object c2) {
		return this.toString().equals(c2.toString());
	}
	
	
}
