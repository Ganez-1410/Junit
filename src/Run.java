import java.util.HashSet;
public class Run {
	public void test() {
		Duplicate c=new Duplicate();
		int arr[]= {1,2,2,3,4};
		HashSet<Integer> a=c.dup(arr);
		System.out.println(a);
	}

}
