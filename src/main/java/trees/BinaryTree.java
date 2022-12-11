package trees;

import java.util.NoSuchElementException;


public class BinaryTree<T> implements BinaryTreeInterface<T>
{
   private BinaryNode<T> root;

   public BinaryTree()
   {
      root = null;
   } // end default constructor

   public BinaryTree(T rootData)
   {
      root = new BinaryNode<>(rootData);
   } // end constructor

   public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      initializeTree(rootData, leftTree, rightTree);
   } // end constructor

   public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
                                   BinaryTreeInterface<T> rightTree)
   {
      initializeTree(rootData, (BinaryTree<T>)leftTree,
                               (BinaryTree<T>)rightTree);
   } // end setTree

   public void setRootData(T rootData)
   {
      root.setData(rootData);
   } // end setRootData
   
   public T getRootData()
   {
      if (isEmpty())
         throw new EmptyTreeException();
      else
         return root.getData();
   } // end getRootData
   
   public boolean isEmpty()
   {
      return root == null;
   } // end isEmpty
   
   public void clear()
   {
      root = null;
   } // end clear
   
   public int getHeight()
   {
      int height = 0;
      if (root != null)
         height = root.getHeight();
      return height;
   } // end getHeight
   
   public int getNumberOfNodes()
   {
      int numberOfNodes = 0;
      if (root != null)
         numberOfNodes = root.getNumberOfNodes();
      return numberOfNodes;
   } // end getNumberOfNodes
   
   protected void setRootNode(BinaryNode<T> rootNode)
   {
      root = rootNode;
   } // end setRootNode
   
   protected BinaryNode<T> getRootNode()
   {
      return root;
   } // end getRootNode
   
   private void initializeTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree)
   {
      root = new BinaryNode<>(rootData);
      
      if ((leftTree != null) && !leftTree.isEmpty())
         root.setLeftChild(leftTree.root);
      
      if ((rightTree != null) && !rightTree.isEmpty())
      {
         if (rightTree != leftTree)
            root.setRightChild(rightTree.root);
         else
            root.setRightChild(rightTree.root.copy());
      } // end if
      
      if ((leftTree != null) && (leftTree != this))
         leftTree.clear();
      
      if ((rightTree != null) && (rightTree != this))
         rightTree.clear();
   } // end initializeTree


   
   
   
} // end BinaryTree
