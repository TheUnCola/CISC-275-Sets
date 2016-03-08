import java.util.Collection;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Collection<Cat1> cats1 = new HashSet<Cat1>();
		cats1.add(new Cat1("Fido"));
		cats1.add(new Cat1("Phideaux"));
		cats1.add(new Cat1("Fido"));
		System.out.print(cats1);
		
		Collection<Cat2> cats2 = new HashSet<Cat2>();
		cats2.add(new Cat2("Fido"));cats2.add(new Cat2("Fido"));
		System.out.print(cats2);
	}

}
