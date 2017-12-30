package test.java;

import org.junit.Assert;
import org.junit.Test;
import main.com.project.controller.WordLength;

public class WordLengthTest{

	WordLength WLTest = new WordLength();
	
	@Test	
	public void test_SetWord(){
		//input data
		WLTest.setWord("TestGetWord!");
		
		//Verify input
		Assert.assertEquals(WLTest.word.equals("TestGetWord!"), true);
		System.out.println(WLTest.word);
	}
	
	@Test
	public void test_getWord(){
		WLTest.setWord("TestGetWord!");
		String word = WLTest.getWord();
		Assert.assertEquals(word.equals("TestGetWord!"), true);
		System.out.println(word);
	}
	
	@Test
	public void test_getLength(){
		WLTest.setWord("TestGetWord!");
		int Expectedlength = 12;
		int ActualLength = WLTest.getLength();
		Assert.assertEquals(Expectedlength, ActualLength);
		System.out.println(ActualLength);
	}
}
