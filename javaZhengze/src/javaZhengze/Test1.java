package javaZhengze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
	public static void main(String[] args) {
		p("a".matches("[abc]"));
		p("a".matches("[^abc]"));
		p("A".matches("[a-zA-Z]"));
		p("A".matches("[a-z][A-Z]"));
		p("A".matches("[a-z[A-Z]]"));
		p("T".matches("[A-Z&&[TFG]]"));
		
	}
	
	public static void p(Object o){
		
		System.out.println(o);
	}
	void b(){
		//简单认识正则表达式的概念
		//System.out.println("ABC".matches("..."));
//		p("abc".matches("..."));
//		p("a82422a".replaceAll("\\d", "-"));
//		Pattern p = Pattern.compile("[a-z](3)");
//		Matcher m = p.matcher("fgh");
//		p(m.matches());
//		p("fgh".matches("[a-z](3)"));
	}
	void tt(){
		p("a".matches("."));
		p("aa".matches("aa"));
		p("aaa".matches("a*"));
		p("aaaa".matches("a+"));
		p("".matches("a*"));
		p("aaaa".matches("a?"));
		p("a".matches("a?"));
		p("2144654612316546".matches("\\d{3,100}"));
		p("192".matches("[2-3][0-9][0-2]"));
	}

}
