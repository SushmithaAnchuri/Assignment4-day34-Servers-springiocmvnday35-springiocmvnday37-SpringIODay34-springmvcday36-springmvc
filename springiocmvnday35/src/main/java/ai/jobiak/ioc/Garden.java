package ai.jobiak.ioc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import javax.print.DocFlavor.STRING;

public class Garden {
ArrayList<String>fruits; //dependencies
ArrayList<String>flowers; 
HashSet<String>trees;
HashMap<String,String>cityFruits;

@Override
public String toString() {
	return "Garden [fruits=" + fruits + ", flowers=" + flowers + ", trees=" + trees + ", cityFruits=" + cityFruits
			+ "]";
}
public Garden(ArrayList<String> flowers) {
	this.flowers = flowers;
}
	public Garden() 
	{
		
	}


public void setTrees(HashSet<String> trees) {
	this.trees = trees;
}
public HashSet<String> getTrees() {
	return trees;
}

public void setCityFruits(HashMap<String,String>cityFruits) 
{
	this.cityFruits = cityFruits;
}
public HashMap<String, String> getCityFruit() {
	return this.cityFruits;
}

	public void setFruits(ArrayList<String> fruits) 
	{
System.out.println("set called");
		this.fruits = fruits;
	}
}