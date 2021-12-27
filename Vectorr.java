import java.util.*;

public class Vectorr
{
	Vector<String> v;
	int size;
	
	Vectorr()
	{
		v = null;
		size = 0;
	}
	Vectorr(int size)
	{
		this.size = size;
		v = new Vector<String>(size);
	}
	void add(String word)
	{
		v.add(word);
	}
	void printVector()
	{
		for(int i = 0; i < size; i++)
        {
        	System.out.print(v.get(i) + " ");
        }
        
        System.out.print("\n");
	}
	Vector<String> getVector()
	{
		return v;
	}
	int getSize()
	{
		return size;
	}
	Boolean FindinVector(String WORD)
	{
		for(int i = 0; i < size; i++)
		{
			if(v.get(i).equals(WORD) == true)
			{
				return true;
			}
		}
		
		return false;
	}
	int FindFrequencyinVector(String word)
	{
		int freq = 0;
		
		for(int i = 0; i < size; i++)
		{
			if(v.get(i).equals(word) == true)
			{
				freq++;
			}
		}
		
		return freq;
	}
}
