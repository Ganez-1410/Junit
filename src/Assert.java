import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Assert {
	private int in[];
	private int exp[];
public Assert(int[] i,int[] ex) {
	this.in=i;
	this.exp=ex;
}
@Parameters
public static Collection check()
{
	Object[][] ob=new Object[][][]{{{1,1,1,4,4,4,4},{1,4}},{{11,22,22,33,44,44,44,55},{11,22,33,44,55}}};
  return Arrays.asList(ob);
}
@Test
	public void test() {
		Duplicate d=new Duplicate();
		int k=0;
		HashSet<Integer> set=d.dup(in);
		System.out.println(set);
//		int end[]=new int[set.size()];
//		for(int a:set)
//			end[k++]=a;
//		System.out.println(set);
//		assertArrayEquals(exp,end);
		
	}

}
