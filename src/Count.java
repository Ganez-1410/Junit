
public class Count {
 public int Upper(String s)
 {
	 char c[]=s.toCharArray();
	 int count=0;
	 for(int i=0;i<c.length;i++)
	 {
		 if(Character.isUpperCase(c[i]))
			 count++;
	 }
	 return count;
 }
}
