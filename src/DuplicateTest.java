import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class DuplicateTest {
private List<Integer> input;
private List<Integer> exp;
public DuplicateTest(List<Integer> input,List<Integer> exp) {
this.input = input;
this.exp = exp;
}
@Parameterized.Parameters
public static Collection primeNumbers() {
	return Arrays.asList(new Object[][] { { new
ArrayList<Integer>(Arrays.asList(1, 1, 1, 4, 4, 4, 4)), new
ArrayList<Integer>(Arrays.asList(1,4)) },
{ new
ArrayList<Integer>(Arrays.asList(11, 22, 22, 33, 33, 33, 44, 44, 55, 66)), new
ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55, 66)) },
{ new
ArrayList<Integer>(Arrays.asList(123, 32, 45)), new
ArrayList<Integer>(Arrays.asList(123, 32, 45)) }
});
}
@Test
public void testPrimeNumberChecker() {
	RemoveDuplicate r=new RemoveDuplicate();
System.out.println("Input is : " +input);
List<Integer> l=r.removeDuplicates(input);
System.out.println(l);
assertEquals(this.exp,l);
}
}