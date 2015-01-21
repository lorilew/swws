import static org.junit.Assert.*;

import org.junit.Test;


public class Worksheet1Test {

	/*
	 * Testing isSearchTree(Tree t) - empty tree
	 */
	@Test
	public void ex1test1() {
		Tree t = new Tree();
		boolean expected = true;
		boolean result = Worksheet2.isHeightBalanced(t);
		assertEquals(expected, result);
	}
	/*
	 * Testing isSearchTree(Tree t) - difference of 0
	 */
	@Test
	public void ex1test2() {
		Tree t = new Tree(3);
		boolean expected = true;
		boolean result = Worksheet2.isHeightBalanced(t);
		assertEquals(expected, result);
	}
	/*
	 * Testing isSearchTree(Tree t) - difference of 1
	 */
	@Test
	public void ex1test3() {
		Tree t = new Tree(3, new Tree(2), new Tree());
		boolean expected = true;
		boolean result = Worksheet2.isHeightBalanced(t);
		assertEquals(expected, result);
	}
	/*
	 * Testing isSearchTree(Tree t) - difference of 2
	 */
	@Test
	public void ex1test4() {
		Tree t = new Tree(3, new Tree(2, new Tree(1), new Tree()), new Tree());
		boolean expected = false;
		boolean result = Worksheet2.isHeightBalanced(t);
		assertEquals(expected, result);
	}
	/*
	 * Testing isSearchTree(Tree t) - difference of 2 
	 */
	@Test
	public void ex1test5() {
		Tree t = new Tree(11, new Tree(7, new Tree(), new Tree(
				8, new Tree(), new Tree(9 , new Tree(), new Tree(10)))), 
				new Tree(15));
		boolean expected = false;
		boolean result = Worksheet2.isHeightBalanced(t);
		assertEquals(expected, result);
	}
	/////////////////////////////////////////////////////////////
	/*
	 * Testing isSearchTree(Tree t) - empty tree
	 */
	@Test
	public void ex2test1(){
		Tree t = new Tree();
		boolean expected = true;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - single node
	 */
	@Test
	public void ex2test2(){
		Tree t = new Tree(2);
		boolean expected = true;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - true only left subtree
	 */
	@Test
	public void ex2test3(){
		Tree t = new Tree(10, new Tree(3), new Tree());
		boolean expected = true;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - true only right subtree
	 */
	@Test
	public void ex2test4(){
		Tree t = new Tree(10, new Tree(), new Tree(20));
		boolean expected = true;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - true symmetric
	 */
	@Test
	public void ex2test5(){
		Tree t = new Tree(10, new Tree(3), new Tree(20));
		boolean expected = true;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - not BST - false
	 */
	@Test
	public void ex2test6(){
		Tree t = new Tree(10, new Tree(50), new Tree(20));
		boolean expected = false;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - not BST - false
	 */
	@Test
	public void ex2test7(){
		Tree t = new Tree(10, new Tree(5), new Tree(2));
		boolean expected = false;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	/*
	 * Testing isSearchTree(Tree t) - not BST - false
	 */
	@Test
	public void ex2test8(){
		Tree t = new Tree(10, new Tree(50), new Tree(2));
		boolean expected = false;
		assertEquals(expected, Worksheet2.isSearchTree(t));
	}
	////////////////////////////////////////////////////////
	/*
	 * Testing leftLeftRotation method.
	 */
	@Test
	public void LLRtest1(){
		Tree t = new Tree(6, new Tree(3, new Tree(1, new Tree(0), new Tree(2)), new Tree(4)), new Tree(10));
		Tree expected = new Tree(3, new Tree(1, new Tree(0), new Tree(2)), new Tree(6, new Tree(4), new Tree(10)));
		assertEquals(expected, Worksheet2.leftLeftRotation(t));
	}
	/*
	* Testing leftLeftRotation method.
	*/
	@Test
	public void LLRtest2(){
	Tree t = new Tree(6, new Tree(2, new Tree(1), new Tree()), new Tree());
	Tree expected = new Tree(2, new Tree(1), new Tree(6));
	assertEquals(expected, Worksheet2.leftLeftRotation(t));
	}
	/*
	 * Testing leftLeftRotation method.
	 */
	@Test
	public void RRRtest1(){
		Tree t = new Tree(6, new Tree(2), new Tree(10, new Tree(7), new Tree(15, new Tree(13), new Tree(20))));
		Tree expected = new Tree(10, new Tree(6, new Tree(2), new Tree(7)), new Tree(15, new Tree(13), new Tree(20)));
		assertEquals(expected, Worksheet2.rightRightRotation(t));
	}
	/*
	 * Testing leftLeftRotation method.
	 */
	@Test
	public void RRRtest2(){
		Tree t = new Tree(5, new Tree(), new Tree(10, new Tree(), new Tree(20)));
		Tree expected = new Tree(10, new Tree(5), new Tree(20));
		assertEquals(expected, Worksheet2.rightRightRotation(t));
	}
	/*
	 * Testing leftRightRotation()
	 */
	@Test
	public void LRRtest1(){
		Tree t = new Tree(6, new Tree(2, new Tree(1), new Tree(4, new Tree(3), new Tree(5))),new Tree(10));
		Tree expected = new Tree(4, new Tree(2, new Tree(1), new Tree(3)), new Tree(6, new Tree(5), new Tree(10)));
		//System.out.println(expected);
		assertEquals(expected, Worksheet2.leftRightRotation(t));
	}
	/*
	 * Testing leftRightRotation()
	 */
	@Test
	public void LRRtest2(){
		Tree t = new Tree(7, new Tree(4, new Tree(), new Tree(5)), new Tree());
		Tree expected = new Tree(5, new Tree(4), new Tree(7));
		
		assertEquals(expected, Worksheet2.leftRightRotation(t));
	}
	/*
	 * Testing RightLeftRotation()
	 */
	@Test
	public void RLRtest1(){
		Tree t = new Tree(6, new Tree(2), new Tree(10, new Tree(8, new Tree(7), new Tree(9)), new Tree(20)));
		Tree expected = new Tree(8, new Tree(6, new Tree(2), new Tree(7)), new Tree(10, new Tree(9), new Tree(20)));
		
		assertEquals(expected, Worksheet2.rightLeftRotation(t));
	}
	/*
	 * Testing RightLeftRotation()
	 */
	@Test
	public void RLRtest2(){
		Tree t = new Tree(10, new Tree(), new Tree(50, new Tree(30), new Tree()));
		Tree expected = new Tree(30, new Tree(10), new Tree(50));
		
		assertEquals(expected, Worksheet2.rightLeftRotation(t));
	}
	///////////////////////////////////////////////////////////////////
	/*
	 * Testing insert(Tree t, int x) - no re-balance
	 */
	@Test
	public void ex3test1(){
		Tree t = new Tree(5, new Tree(1), new Tree(10));
		System.out.println(Worksheet2.insertHB(2, t));
		Tree expected = new Tree(5, new Tree(1, new Tree(), new Tree(2)), new Tree(10));
		assertEquals(expected, Worksheet2.insertHB(2, t));
	}
	/*
	 * Testing insert(Tree t, int x) - LLR re-balance
	 */
	@Test
	public void ex3test2(){
		Tree t = new Tree(5, new Tree(3), new Tree());
		
		Tree expected = new Tree(3, new Tree(2), new Tree(5));
		assertEquals(expected, Worksheet2.insertHB(2, t));
	}
	/*
	 * Testing insert(Tree t, int x) - RRR re-balance
	 */
	@Test
	public void ex3test3(){
		Tree t = new Tree(5, new Tree(), new Tree(9));
		
		Tree expected = new Tree(9, new Tree(5), new Tree(10));
		assertEquals(expected, Worksheet2.insertHB(10, t));
	}
	/*
	 * Testing insert(Tree t, int x) - RLR re-balance
	 */
	@Test
	public void ex3test4(){
		Tree t = new Tree(5, new Tree(), new Tree(9));
		
		Tree expected = new Tree(8, new Tree(5), new Tree(9));
		assertEquals(expected, Worksheet2.insertHB(8, t));
	}
	/*
	 * Testing insert(Tree t, int x) - LRR re-balance
	 */
	@Test
	public void ex3test5(){
		Tree t = new Tree(5, new Tree(3), new Tree());
		
		Tree expected = new Tree(4, new Tree(3), new Tree(5));
		assertEquals(expected, Worksheet2.insertHB(4, t));
	}
}

