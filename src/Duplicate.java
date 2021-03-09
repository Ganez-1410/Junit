import java.util.HashSet;
public class Duplicate {
public HashSet<Integer> dup(int[] arr) {
	HashSet<Integer> a=new HashSet<Integer>();
	for(int i:arr)
	a.add(i);
	System.out.println(a);
	return a;
}
}