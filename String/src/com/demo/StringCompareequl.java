package com.demo;

public class StringCompareequl{
	   public static void main(String []args){
	      String s1 = "tutorialspoint";
	      String s2 = "tutorialspoint";
	      String s3 = new String ("Tutorials Point");
	      String s4 = new String ("Tutorials point");
	      System.out.println(s1.equals(s2));
	      System.out.println(s2.equals(s3));
	      System.out.println(s3.equals(s4));
	   }
	}