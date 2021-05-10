package homework2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class driver {
	public static void main(String[] args) {
		System.out.println("Please input:");
		String expression;
		Scanner scan=new Scanner(System.in);
		expression = scan.nextLine();
		String regex = "[a-z]*\\(\\d+[,|£¬]\\d+\\)";
		String pattern = "([a-z]*\\(\\d+,([a-z]*\\(\\d+,([a-z]*\\(\\d+,\\d+(\\)\\)\\)))))";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(expression);
		double result = 0;
		if(m.find()) {
//			System.out.println(m.groupCount());
//			System.out.println(m.group(1));
//			System.out.println(m.group(2));
//			System.out.println(m.group(3));
//			System.out.println(m.group(4));
			for(int i = m.groupCount()-1;i>0;i--) {
				String ex = m.group(i);
				int x = m.group(i).indexOf(',');
				String tem = m.group(i).substring(0,x);
				if(i != m.groupCount()-1)
					ex = tem+","+result;
//				System.out.println(ex);
				result = Caculate(ex);
				
				
			}
			System.out.println(result);
		}else if(expression.matches(regex)) {
			result = Caculate(expression);
			System.out.println(result);
		}else {
			System.out.println("Input Error");
		}
		
		
	}
	public static double Caculate(String expression){
		String[] s = expression.split("\\(|\\)");
//		System.out.println("Normal");
		String[] m = s[1].split(",|£¬");
//		System.out.println("Normal");
		double a = Double.parseDouble(m[0]);
		double b = Double.parseDouble(m[1]);
		double result=0;
//		System.out.println("Normal");
		switch(s[0])
		{
		case "add":result=a+b;break;
		case "sub":result=a-b;break;
		case "max":result = a>b?a:b;break;
		case "min":result = a<b?a:b;break;
		default:break;
		}
//		System.out.println(result);
		return result;
		
		
	}
}
