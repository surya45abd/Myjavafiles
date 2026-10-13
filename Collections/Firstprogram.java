
import java.util.ArrayList;
import java.util.Collection;

public class Firstprogram{
		public static void main(String[] args) {
			Collection<String> fruits = new ArrayList<>();
			fruits.add("apple");
			fruits.add("grapes");
			fruits.add("mango");
			System.out.println(fruits);
			Collection<String> veg = new ArrayList<>();
			veg.add("lady finger");
			System.out.println(veg);
			Collection<String> every = new ArrayList<>();
			every.addAll(fruits);
			every.addAll(veg);
			System.out.println(every);
		}
}
