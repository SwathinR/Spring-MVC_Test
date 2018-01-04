package main.java.com.project.controller;


public class WordLength {


	public  String word="";
	public  int length=0;

	public WordLength(){}

	public  void setWord(String w){
		word = w;
		length = word.length();
		//length = 2;
	}

	public  String getWord(){
		return word ;
	}

	public  int getLength(){
		return length;
	}
}
