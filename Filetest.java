package week11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Filetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String filename="C:\\Users\\cz\\Desktop\\eclipse\\test.txt";
		//1.修水箱
		File aFile = new File(filename);
		//2.装水管
		FileReader fr = new FileReader(aFile);
		//3.装水龙头
		BufferedReader bf = new BufferedReader(fr);
		//4.打开水龙头
		String aLine=bf.readLine();
		
		File answer  = new File("C:/Users/cz/Desktop/eclipse/answer.txt");
		
		while(aLine!=null && !aLine.equals("")){
			System.out.println(aLine);
			String s=cal(aLine);
			System.out.println(s);
			FileWriter fw = new FileWriter(answer,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(aLine+"="+s);
			
			fw.close();
			pw.close();
			aLine=bf.readLine();
		}
		
		//5.关闭
		bf.close();
		fr.close();
		/*
		
		*/
		}catch(Exception e) {   //异常处理
			e.printStackTrace();
		}

	}
	public static String cal(String express) {
		String result="";
		int a=express.indexOf("(");
		int c=express.indexOf(")");	
	    String code=express.substring(0,a);
	  
	    System.out.println(code);
	    if(code.equals("doubleMe")) {
	    	
	         float m=Float.parseFloat(express.substring(a+1,c));
	         System.out.println(a+c);
	         result+=m*2;
	    }
	    else {
	    	int b=express.indexOf(",");
	    	float p = Float.parseFloat(express.substring(a+1,b));
	  	    float q = Float.parseFloat(express.substring(b+1,c));
	    	switch(code) {
	    		case "add":result+=p+q;break;
	    		case "sub":result+=p-q;break;
	    		case "muti":result+=p*q;break;
	    		case "div":result+=p/q;break;
	    }
	    	}
		return result;
	}

}
