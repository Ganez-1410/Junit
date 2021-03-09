
public class SquareDifference {
   public int getSquareDiff(int input)
    {
	   int sum=0,sum1=0;
	  for(int i=1;i<=input;i++)
	  {
		  sum+=i;
		  sum1+=(Math.pow(i, 2));
	  }
	  return (int) (Math.pow(sum, 2)-sum1);
    }
}
