public class Node
{
    String key;
    Node left, right;
 
    Node(String item)
    {
        key = item;
        left = right = null;
    }
    String returnKey()
    {
    	return key;
    }
    Node getLeft()
    {
    	return left;
    }
    Node getRight()
    {
    	return right;
    }
    String getKey()
    {
    	return key;
    }
    void setRight(Node right)
    {
    	this.right = right;
    }
    void setLeft(Node left)
    {
    	this.left = left;
    }
}
