package practice;
import java.io.*;
public class HouGlassPrcatice {

	public static void main(String args[]) throws NumberFormatException, IOException
	{
		int[][] arr = new int[6][6];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter array elements");
	    for(int i=0;i<6;i++)
	    {
	    	for(int j=0;j<6;j++)
	    	{
	    		arr[i][j]=Integer.parseInt(br.readLine());
	    	}
	    }
	    System.out.println("Array is as follows :");
	    for(int i=0;i<6;i++)
	    {
	    	for(int j=0;j<6;j++)
	    	{
	    		System.out.println(arr[i][j]);
	    	}
	    }
	    
	    int sum=0;
    	int maxsum=0;
    	for(int i=0;i<4;i++)
    	{
    		for(int j=0;j<4;j++)
    		{
    			sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    		}
    		if(maxsum<sum)
    		{
    			maxsum=sum;
    		}
    	}
      System.out.println(maxsum);
    }

	    
}

