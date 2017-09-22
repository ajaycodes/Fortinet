package fortinet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SeparateintoK {

	public static boolean separate(List<Integer> list, int k){
		//N is the size of list
		int N=list.size();
		//if k==1 condition is already satisfied
		if(k==1)
			return true;
		//if N<K,it is not possible to divide n numbers into more than n subsets
		if(N<k)
			return false;
		//if sum is not divisible by k it is not possible to find k subsets
		int sum=0;
		for (int i=0;i<N;i++)
		{
			sum+=list.get(i);
		}
		if(sum%k!=0)
			return false;
		//sum of each subset=sum/k
		int sumofsubset=sum/k;
		//array to manage each subset sum
		int[] subsetSum=new int[k];
		//array to check if the number is alreay used
		boolean[] taken=new boolean[N];
		//Initialize sum of each subset to 0		
		for(int i=0;i<k;i++)
			subsetSum[i]=0;
		//Initialize the taken array to false
		for(int i=0;i<N;i++)
			taken[i]=false;
		subsetSum[0]=list.get(list.size()-1);
		taken[N-1]=true;
		return isKPartitionPossibleRec(list, subsetSum, taken,
				sumofsubset, k, N, 0, N - 1);
		
		
	}
	
	private static boolean isKPartitionPossibleRec(List<Integer> list, int[] subsetSum, boolean[] taken,
			int sumofsubset, int k, int n, int current, int limit) {
		if(subsetSum[current]==sumofsubset)
		{
			if(current==k-2)
				return true;
			return isKPartitionPossibleRec(list, subsetSum, taken, sumofsubset, k, n, current+1, limit);
		}
		for(int i=limit;i>=0;i--)
		{
			if(taken[i])
				continue;
			int temp=subsetSum[current]+list.get(i);
			if(temp<=sumofsubset)
			{
				taken[i]=true;
				subsetSum[current]+=list.get(i);
				boolean next= isKPartitionPossibleRec(list, subsetSum, taken, sumofsubset, k, n, current, i-1);
				taken[i] = false;
				subsetSum[current]-=list.get(i);
				if(next)
					return true;
			}
		}
		return false;
	}

	public static void main(String args[]){
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(3);
		list.add(3);
		//System.out.println(list.get(0));
		if(separate(list,3))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		
	}
}
