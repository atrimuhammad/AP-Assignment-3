import java.io.*;
import java.util.*;

class MyProgram extends Thread
{
	String filename;
	int choice;
	BST bstree;
	Vectorr v;
	
	MyProgram(String fname, int choice, int numoffiles)
	{
		this.filename = fname;
		this.choice = choice;
		bstree = new BST();
		v = new Vectorr();
	}
	
	@Override
	public void run()
	{
	    try
	    {
			switch(choice)
			{
				// Display BST build from Vocabulary File
				case 1:
					if(Thread.currentThread().getName().equals("vocabulary") == true)
					{
			            File myObj1 = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\" + filename);
			            
			            Scanner myReader1 = new Scanner(myObj1);
			            
			            while (myReader1.hasNextLine())
			            {
			            	String data = myReader1.nextLine();
			            	
			            	data = data.toLowerCase();
			          
			            	if(bstree.getRootNode() == null)
			            	{
			            		bstree = new BST(new Node(data));
			            	}
			            	else
			            	{
			            		Node root1 = bstree.getRootNode();
			            		
			            		while(root1 != null)
			            		{
			            			String value = root1.returnKey();
			            			
			            			int k = -1;
			            			
			            			if(value.length() > data.length())
			            			{
			            				k = data.length();
			            			}
			            			else
			            			{
			            				k = value.length();
			            			}
			            			
			            			Boolean flag = false; //Right
			            			
			            			for(int j = 0; j < k; j++)
			            			{	
			            				if((int)data.charAt(j) > (int)value.charAt(j))
			            				{
			            					flag = true;
			            					break;
			            				}
			            				else if((int)data.charAt(j) < (int)value.charAt(j))
			            				{
			            					flag = false;
			            					break;
			            				}
			            			}
			            			
			            			if(flag == true)
			            			{
			                			if(root1.right != null)
			                			{
			                				root1 = root1.right;
			                			}
			                			else if(root1.right == null)
			                			{
			                				root1.right = new Node(data);
			                				
			                				break;
			                			}
			            			}
			            			else if(flag == false)
			            			{	
			            				if(root1.left != null)
			            				{
			            					root1 = root1.left;
			            				}
			            				else if(root1.left == null)
			            				{
			            					root1.left = new Node(data);
			            					
			            					break;
			            				}
			            			}
			            		}
			            	}
			            }
			            
			            myReader1.close();
			            
			            System.out.print("\n\n----Printing BST in POST ORDER----\n\n");
			            
			            bstree.printPostorder(bstree.getRootNode());
					}
				break;
				
				// Display Vectors build from Input files
				case 2:
					if(Thread.currentThread().getName().equals("vocabulary") == false)
					{
			            File myObj = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\" + filename);
			            
			            Scanner myReader = new Scanner(myObj);
			            
			            int totalwords = 0;
			            
			            while (myReader.hasNextLine())
			            {
			            	String data = myReader.nextLine();
			            	
			            	String[] arr = data.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			            	totalwords += arr.length;
			            }
			            
			            myReader.close();
			            
			            v = new Vectorr(totalwords);
			            
			            myReader = new Scanner(myObj);
			            
			            while (myReader.hasNextLine())
			            {
			            	String data = myReader.nextLine();
			            	
			            	String[] arr = data.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			            	for(String ss : arr)
			            	{
			            	    v.add(ss);
			            	}
			            }
			            
			            Boolean flag = false;
			            
			            if(flag == false)
			            {
			            	v.printVector();
			            	flag = true;
			            }
			            
			            System.out.print("\n.....................\n\n");
					}
				break;
				
				// Viewing Match words and its frequency
				case 3:
					if(Thread.currentThread().getName().equals("vocabulary") == true)
					{
			            File myObj1 = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\" + filename);
			            
			            Scanner myReader1 = new Scanner(myObj1);
			            
			            while (myReader1.hasNextLine())
			            {
			            	String data = myReader1.nextLine();
			            	
			            	data = data.toLowerCase();
			          
			            	if(bstree.getRootNode() == null)
			            	{
			            		bstree = new BST(new Node(data));
			            	}
			            	else
			            	{
			            		Node root1 = bstree.getRootNode();
			            		
			            		while(root1 != null)
			            		{
			            			String value = root1.returnKey();
			            			
			            			int k = -1;
			            			
			            			if(value.length() > data.length())
			            			{
			            				k = data.length();
			            			}
			            			else
			            			{
			            				k = value.length();
			            			}
			            			
			            			Boolean flag = false; //Right
			            			
			            			for(int j = 0; j < k; j++)
			            			{	
			            				if((int)data.charAt(j) > (int)value.charAt(j))
			            				{
			            					flag = true;
			            					break;
			            				}
			            				else if((int)data.charAt(j) < (int)value.charAt(j))
			            				{
			            					flag = false;
			            					break;
			            				}
			            			}
			            			
			            			if(flag == true)
			            			{
			                			if(root1.right != null)
			                			{
			                				root1 = root1.right;
			                			}
			                			else if(root1.right == null)
			                			{
			                				root1.right = new Node(data);
			                				
			                				break;
			                			}
			            			}
			            			else if(flag == false)
			            			{	
			            				if(root1.left != null)
			            				{
			            					root1 = root1.left;
			            				}
			            				else if(root1.left == null)
			            				{
			            					root1.left = new Node(data);
			            					
			            					break;
			            				}
			            			}
			            		}
			            	}
			            }
			            
			            myReader1.close();
					}

					if(Thread.currentThread().getName().equals("vocabulary") == false)
					{
			            File myObj = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\" + filename);
			            
			            Scanner myReader = new Scanner(myObj);
			            
			            int totalwords = 0;
			            
			            while (myReader.hasNextLine())
			            {
			            	String data = myReader.nextLine();
			            	
			            	String[] arr = data.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			            	totalwords += arr.length;
			            }
			            
			            myReader.close();
			            
			            v = new Vectorr(totalwords);
			            
			            myReader = new Scanner(myObj);
			            
			            while (myReader.hasNextLine())
			            {
			            	String data = myReader.nextLine();
			            	
			            	String[] arr = data.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			            	for(String ss : arr)
			            	{
			            	    v.add(ss);
			            	}
			            }
					}
				break;
				
				// Searching a query -> It should display all the files query found in.
				case 4:
					if(Thread.currentThread().getName().equals("vocabulary") == true)
					{
			            File myObj1 = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\" + filename);
			            
			            Scanner myReader1 = new Scanner(myObj1);
			            
			            while (myReader1.hasNextLine())
			            {
			            	String data = myReader1.nextLine();
			            	
			            	data = data.toLowerCase();
			          
			            	if(bstree.getRootNode() == null)
			            	{
			            		bstree = new BST(new Node(data));
			            	}
			            	else
			            	{
			            		Node root1 = bstree.getRootNode();
			            		
			            		while(root1 != null)
			            		{
			            			String value = root1.returnKey();
			            			
			            			int k = -1;
			            			
			            			if(value.length() > data.length())
			            			{
			            				k = data.length();
			            			}
			            			else
			            			{
			            				k = value.length();
			            			}
			            			
			            			Boolean flag = false; //Right
			            			
			            			for(int j = 0; j < k; j++)
			            			{	
			            				if((int)data.charAt(j) > (int)value.charAt(j))
			            				{
			            					flag = true;
			            					break;
			            				}
			            				else if((int)data.charAt(j) < (int)value.charAt(j))
			            				{
			            					flag = false;
			            					break;
			            				}
			            			}
			            			
			            			if(flag == true)
			            			{
			                			if(root1.right != null)
			                			{
			                				root1 = root1.right;
			                			}
			                			else if(root1.right == null)
			                			{
			                				root1.right = new Node(data);
			                				
			                				break;
			                			}
			            			}
			            			else if(flag == false)
			            			{	
			            				if(root1.left != null)
			            				{
			            					root1 = root1.left;
			            				}
			            				else if(root1.left == null)
			            				{
			            					root1.left = new Node(data);
			            					
			            					break;
			            				}
			            			}
			            		}
			            	}
			            }
			            
			            myReader1.close();
					}

					if(Thread.currentThread().getName().equals("vocabulary") == false)
					{
			            File myObj = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\" + filename);
			            
			            Scanner myReader = new Scanner(myObj);
			            
			            int totalwords = 0;
			            
			            while (myReader.hasNextLine())
			            {
			            	String data = myReader.nextLine();
			            	
			            	String[] arr = data.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			            	totalwords += arr.length;
			            }
			            
			            myReader.close();
			            
			            v = new Vectorr(totalwords);
			            
			            myReader = new Scanner(myObj);
			            
			            while (myReader.hasNextLine())
			            {
			            	String data = myReader.nextLine();
			            	
			            	String[] arr = data.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			            	for(String ss : arr)
			            	{
			            	    v.add(ss);
			            	}
			            }
					}
				break;
				
				// Exiting Threads
				case 5:
					Thread.currentThread().interrupt();
					System.out.print("\nTerminating Thread " + Thread.currentThread().getName());
				
				break;
			}
	    }
	    catch(FileNotFoundException e)
	    {
	    	System.out.println(e);
	    }
	}
	public static void main(String[] args)
	{
		/* Printing Number of Files and File Names */
		
		System.out.print("Number of Files: " + args.length);
		
		System.out.print("\n\n----File Names----\n");
		
		for(String arg: args)
		{
			System.out.print(arg + "\n");
		}
		
		/* Printing Menu and getting user choice*/
		
		Scanner sc = new Scanner(System.in);
		
    	int menu_choice;
    	
        System.out.print("\n1. Display BST build from Vocabulary File");
        System.out.print("\n2. Display Vectors build from Input files");
        System.out.print("\n3. Viewing Match words and its frequency");
        System.out.print("\n4. Searching a query -> It should display all the files query found in.");
        System.out.print("\n5. Enter 5 for Exiting");
        
		System.out.print("\n\nEnter your choice: ");
		menu_choice = sc.nextInt();
		sc.nextLine();
		
		/* Creating thread for each file and setting name of each thread as filename */
		
		MyProgram t[] = new MyProgram[args.length];
		
		int i = 0;
		
		for(String arg : args)
		{
			t[i] = new MyProgram(arg, menu_choice, args.length);
			
			t[i].setName(arg.split("[.]", 2)[0]);
			
			i++;
		}
		
		// For choice # 3 and 4. Threads will create BST and Vectors in parallel and here we will get BST and Vectors
		BST binarysearchtree = null;
		Vectorr vec[] = new Vectorr[args.length - 1];
		
		/* Running threads in parallel */
		
		int k = 0;
		
		for(int j = 0; j < args.length; j++)
		{
			// Starting each thread
			t[j].start();
		}
		
		/* Getting BST and Vectors in Main Thread */
		
		for(int j = 0; j < args.length; j++)
		{
			if(menu_choice == 3 || menu_choice == 4)
			{
				// Sleeping main thread. So, other threads be able to form BST and Vectors from files.
				
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
				
				if(t[j].getName().equals("vocabulary") == true)
				{
					binarysearchtree = t[j].bstree;
				}
				if(t[j].getName().equals("vocabulary") == false)
				{
					vec[k] = t[j].v;
					k++;
				}
			}
		}
		
		// Task 4
		
		if(menu_choice == 4)
		{
			// Getting input from user
			
			String query;
			
			System.out.print("\nEnter query: ");
			query = sc.nextLine();
			
			// Removing punctuation marks from query string and converting query string to lower-case letters
			String[] arr = query.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");    

			// Finding total words in query string
			int totalnumofwordsinquery = 0;
			
        	for(String ss1 : arr)
        	{
        		totalnumofwordsinquery++;
        	}
        	
        	/* ---- how many words of query exists in files ----- */
        	
        	int wordsofquery[] = new int[totalnumofwordsinquery];
        	
        	// Initialising each index of array with 0.
        	for(int d = 0; d < totalnumofwordsinquery; d++)
        	{
        		wordsofquery[d] = 0;
        	}
        	
        	/* --- number of matches found in each file --- */
        	
        	int numofmatchesfoundineachfile[] = new int[args.length];
			
        	// Finding query words in Vocabulary file, to get,
        	// HOW MANY WORDS OF QUERY FILE MATCHED IN VOCAULARY FILE
        	// HOW MANY WORDS OF QUERY EXISTS IN FILES
        	
			int f = 0;
			
        	for(String ss : arr)
        	{
        	    Boolean flag = binarysearchtree.FindWordInBST(binarysearchtree.getRootNode(), ss);
        	    
        	    if(flag == true)
        	    {
        	    	if(wordsofquery[f] == 0)
        	    	{
        	    		wordsofquery[f] = 1;
        	    	}
        	    	
        	    	numofmatchesfoundineachfile[0]+=1;
        	    }
        	    
        	    f++;
        	}
        	
        	// Finding query words in files (other than vocab file), to get,
        	// HOW MANY WORDS OF QUERY FILE MATCHED IN VOCAULARY FILE
        	// HOW MANY WORDS OF QUERY EXISTS IN FILES
        	
        	int r = 0;
        	
        	for(String ss : arr)
        	{
        		for(int e = 0; e < args.length - 1; e++)
        		{
        			Boolean flag = vec[e].FindinVector(ss);
        			
        			if(flag == true)
        			{
            	    	if(wordsofquery[r] == 0)
            	    	{
            	    		wordsofquery[r] = 1;
            	    	}
            	    	
        				numofmatchesfoundineachfile[e+1]+=1;
        			}
        		}
        		
        		r++;
        	}
        	
        	/* To get total number of query string words, which exists in files */
        	
        	int wordsofqueryexistsinfiles = 0;
        	
        	for(int y = 0; y < totalnumofwordsinquery; y++)
        	{
        		if(wordsofquery[y] == 1)
        		{
        			wordsofqueryexistsinfiles++;
        		}
        	}
        	
        	System.out.print("\n-------- how many words of query exists in files ------- \n");
        	
        	System.out.print("\nNumber of words of query string, exists in files: " + wordsofqueryexistsinfiles + "\n");
        	
        	System.out.print("\n-------- number of matches found in each file --------- \n");
        	
        	for(int x = 0; x < args.length; x++)
        	{
        		if(x == 0)
        		{
        			System.out.print("\nNumber of matches found in Vocabulary File: " + numofmatchesfoundineachfile[x] + "\n");
        		}
        		else
        		{
        			System.out.print("\nNumber of matches found in File # " + x + "(other than vocabulary file): " + numofmatchesfoundineachfile[x] + "\n");
        		}
        	}
        	
        	System.out.print("\n-------- Proper Match in term of numbers ------------- \n");
        	
        	for(int x = 0; x < args.length; x++)
        	{
        		if(x == 0)
        		{
        			if(numofmatchesfoundineachfile[x] == totalnumofwordsinquery)
        			{
        				System.out.print("\nVocabulary File has proper match\n");
        			}
        			else
        			{
        				System.out.print("\nVocabulary File has not proper match\n");
        			}
        		}
        		else
        		{
        			if(numofmatchesfoundineachfile[x] == totalnumofwordsinquery)
        			{
        				System.out.print("\nFile # " + x + "(other than vocab file) has proper match\n");
        			}
        			else
        			{
        				System.out.print("\nFile # " + x + "(other than vocab file) has not proper match\n");
        			}
        		}
        	}
        	
        	// Finding frequency of each word in query string in each file
        	
        	System.out.print("\n-------- frequency of words in each file ------------- \n");
        	
        	for(String ss : arr)
        	{
        		int freq_vocab = binarysearchtree.FindFrequencyOfWordinBST(binarysearchtree.getRootNode(), ss, 0);
        		
        		System.out.print("\n" + ss + " : " + freq_vocab + "(in Vocab file)");
        		
        		for(int h = 0; h < args.length - 1; h++)
        		{
        			int freq_other_files = vec[h].FindFrequencyinVector(ss);
        			
        			int temp = h+1;
        			
        			System.out.print("\n" + ss + " : " + freq_other_files + "(in File # " + temp + ")");
        		}
        		
        		System.out.print("\n");
        	}
		}
		
		// Matching each word from vector with words in Binary Tree
		
		// Task 4
		
		if(menu_choice == 3)
		{
			int numofwordsinvocabfile = 0;
			
			// Finding number of words in Vocabulary File to make words array of that size
			
			try
			{
				File myObj1_ = new File("C:\\Users\\Muhammad Athar\\Desktop\\eclipse-workspace-nov21-onwards\\A3_Final_\\src\\vocabulary.txt");
		        
		        Scanner myReader2 = new Scanner(myObj1_);
		        
		        while (myReader2.hasNextLine())
		        {
		        	myReader2.nextLine();
		        	
		        	numofwordsinvocabfile++;
		        }
		        
		        myReader2.close();
			}
			catch(IOException e)
			{
		        e.printStackTrace();
		    }

			// Making word class array, to store words and their frequencies
			
			Word words[] = new Word[numofwordsinvocabfile];
			
			for(int x = 0; x < numofwordsinvocabfile; x++)
			{
				words[x] = null;
			}
			
			int wordnumber = 0;
			
			for(int a = 0; a < args.length - 1; a++)
			{
				for(int b = 0; b < vec[a].size; b++)
				{
					Boolean flag = binarysearchtree.FindWordInBST(binarysearchtree.getRootNode(), vec[a].v.get(b));
					
					if(flag == true)
					{
						for(int y = 0; y < numofwordsinvocabfile; y++)
						{
							if(words[y] == null)
							{
								words[y] = new Word(vec[a].v.get(b), 1);
								break;
							}
							else if(words[y] != null)
							{
								if(words[y].getWord().equals(vec[a].v.get(b)) == true)
								{
									words[y].incrementFrequency();
									break;
								}
							}
						}
					}
				}
			}
			
			// Printing words and frequency
			
			int w = 0;
			
			System.out.print("\nWord : Frequency\n\n");
			
			while(words[w] != null || w == numofwordsinvocabfile)
			{
				System.out.print(words[w].getWord() + ": " + words[w].getFrequency() + "\n");
				w++;
			}
		}
	}
}