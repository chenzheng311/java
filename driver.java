package homework3;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class driver {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("<html><head><title>��ӭ�����人��֯��ѧ��ҳ</title></head></html>\n");
		sb.append("<body><img src=��1.jpg��/>\n");
		sb.append("<a href=��1.htm��>��ҳ</a>\n");
		sb.append("<a href=��2.htm��>����</a>\n");
		sb.append("<a href=��3.htm��>����ѧԺ</a>\n");
		sb.append("<img src=��2.jpg��/>\n");
		sb.append("<img src=��3.jpg��/>\n");
		sb.append("</body></html>\n");
		String s = sb.toString();
		String headregex ="(<.*?><.*?><.*?>(.*(<.*?><.*?><.*?>\\n))).";
		Pattern r = Pattern.compile(headregex);
		Matcher m = r.matcher(s);
		ArrayList<String> srcL=new ArrayList<String>();
		String regex = "<.*?><.*?><.*?>";
		if(m.find(0))
		{
		String a =m.group(2).replaceAll(regex, " ");
		System.out.print("��ҳ����Ϊ��");
		System.out.println(a);
		}
		String SrcRegex="(<a.*?>(.*))";
		r = Pattern.compile(SrcRegex);
		m = r.matcher(s);
		int i = 0;
		while(m.find())
		{
			String sc = m.group();
			String[] sna = sc.split("<|>");
//			System.out.println(sna[2]);
			String[] sr = sc.split("��");
			srcL.add(sna[2]+"\t"+sr[1]);
			i++;
		}
		System.out.println("��ҳ�й���"+i+"�����ӣ������ӵ�ַ���������£�");
		System.out.println("��ַ\t����");
		for (String string : srcL) {
			System.out.println(string);
		}
		
		ArrayList<String> imgL=new ArrayList<String>();
		String imgRegex="(<img.*?>)";
		r = Pattern.compile(imgRegex);
		m = r.matcher(s);
		i =0;
		while(m.find()) {
			String ic = m.group();
			String[] ir = ic.split("��");
			imgL.add(ir[1]);
			i++;
		}
		System.out.println();
		System.out.print("��ҳ�й���"+i+"��ͼƬ��ͼƬ����Ϊ��");
		for (String string : imgL) {
			System.out.print(string+"\t");
		}
	}
}
