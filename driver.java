package homework4;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class driver {
	public static void main(String[] args) {
		String s = "<font face=��Arial Serif�� size=��10px�� color=��red�� />"
				+ "<html><head><title>��ӭ�����人��֯��ѧ��ҳ</title></head></html>\r\n"
				+ "<body><img src=��1.jpg��/>\r\n"
				+ "<a href=��1.htm��>��ҳ</a>\r\n"
				+ "<a href=��2.htm��>����</a>\r\n"
				+ "<a href=��3.htm��>����ѧԺ</a>\r\n"
				+ "<img src=��2.jpg��/>\r\n"
				+ "<img src=��3.jpg��/>\r\n"
				+ "</body></html>"
				+ "<font face=��zhongwen�� size=��20px�� color=��blue�� />";
		String regx ="(<font.*?>)";
		ArrayList<font> fontList = new ArrayList<font>();
		Pattern p = Pattern.compile(regx);
		Matcher m = p.matcher(s);
		while(m.find())
		{
			String[] f = m.group().split("��");
			font fo = new font(f[1],f[3],f[5]);
			fontList.add(fo);
		}
		for (font font : fontList) {
			System.out.println(font.toString());
		}
	}
}
