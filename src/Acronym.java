
public class Acronym {
public String abbreviate(String s)
{
	char c[]=s.toCharArray();
	int j=0,k=0;
	for(int i=0;i<s.length();i++)
	{
		if(c[i]==' ')
		{
		   j++;
		}
	}
	char ch[]=new char[j+1];
	ch[k++]=c[0];
	for(int i=0;i<s.length();i++)
	{
		if(c[i]==' ')
		{
			ch[k++]=c[i+1];
		}
	}
	
	String st=new String(ch);
	st=st.toUpperCase();
	return st;
}
}
