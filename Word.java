public class Word
{
	String word;
	int frequency;
	
	Word()
	{
		word = "";
		frequency = 0;
	}
	Word(String word, int frequency)
	{
		this.word = word;
		this.frequency = frequency;
	}
	void incrementFrequency()
	{
		frequency++;
	}
	String getWord()
	{
		return word;
	}
	int getFrequency()
	{
		return frequency;
	}
}
