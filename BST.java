public class BST
{
	private Node root;
	
	BST()
	{
		root = null;
	}
	BST(Node root)
	{
		this.root = root;
	}
	public Node getRootNode()
	{
		return root;
	}
	public void printPostorder(Node node)
	{
        if (node == null)
            return;
 
        // first recur on left subtree
        printPostorder(node.left);
 
        // then recur on right subtree
        printPostorder(node.right);
 
        // now deal with the node
        System.out.print(node.key + " ");
	}
	public Boolean FindWordInBST(Node node, String WORD)
	{
        if (node == null)
            return false;
 
        // first recur on left subtree
        Boolean flag = FindWordInBST(node.left, WORD);
 
        if(flag == true)
        {
        	return true;
        }
        
        // then recur on right subtree
        Boolean flag1 = FindWordInBST(node.right, WORD);
 
        if(flag1 == true)
        {
        	return true;
        }
        
        if(node.key.equals(WORD) == true)
        {
        	return true;
        }
        
        return false;
	}
	public int FindFrequencyOfWordinBST(Node node, String word, int Frequency)
	{
        if (node == null)
            return Frequency;
 
        if(node.key.equals(word) == true)
        {
        	Frequency++;
        }
        
        // first recur on left subtree
        int freq = FindFrequencyOfWordinBST(node.left, word, Frequency);
 
        //return freq;
        
        // then recur on right subtree
        int freq1 = FindFrequencyOfWordinBST(node.right, word, freq);
        
        return freq1;
	}
}
