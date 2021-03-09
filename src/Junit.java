import static org.junit.Assert.*;
import java.util.HashSet;
import org.junit.Test;
public class Junit {
	@Test
	public void test() {
		Duplicate c=new Duplicate();
		int arr[]= {1,2,2,3,4};
		HashSet<Integer> a=c.dup(arr);
		
		System.out.println(a);
	}

}
