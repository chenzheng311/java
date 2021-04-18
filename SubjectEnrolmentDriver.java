package week7work;

import java.util.Scanner;

public class SubjectEnrolmentDriver {
	public static SubjectEnrolment sub=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		choice=menu();
		while(choice>0)
		{
			switch(choice)
			{
			case 1:creatSubject();break;
			case 2:creatStudent();break;
			case 3:withdraw();break;
			case 4:print();break;
			case 5:exit();break;
			default:System.out.println("输入有误，请重新选择！");
			}
			
			choice=menu();
		}
		
}
	public static int menu(){
		int choice;
		System.out.println("=======WTU选课系统=======");
		System.out.println("1.创建新课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印名单");
		System.out.println("5.退出");
		System.out.println("请选择(1~5):");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	public static void creatSubject(){
		String id,name;
		int a;
		Scanner scan1=new Scanner(System.in); 
		System.out.println("请输入您想创建的课程id：");
		id=scan1.next();
		System.out.println("请输入课程名称：");
		name=scan1.next();
		System.out.println("请输入最大人数：");
		a=scan1.nextInt();
		 sub=new SubjectEnrolment(id,name,a,a);
		System.out.println("课程创建成功，信息如下：\n");
		System.out.println(sub.toString());
		
	}
	public static void creatStudent(){
		if(sub==null) {
			System.out.println("请先选课！");
			return ;
		}
		if(sub.getindex()+1>sub.getNum()) {
			System.out.println("选课人数已满！");
			return;
		}
		String id,name;
		Scanner scan2=new Scanner(System.in);
		System.out.println("请输入选课学生的id:");
		id=scan2.next();
		System.out.println("请输入选课学生的姓名：");
		name=scan2.next();
		
		Student a=new Student(id,name);
		
		System.out.println(sub.count);
		System.out.println(sub.getindex());
		
		sub.add(a);
		System.out.println("恭喜你，选课成功！");
		System.out.println("目前选课情况如下：");
		System.out.println(sub.toString());
		System.out.println("选课人数："+sub.getindex());
		System.out.println("\t学号"+"\t姓名");
		sub.bianli();	
	}
	public static void withdraw() {
		if(sub==null) {
			System.out.println("请先选课！");
			return ;
		}
		Scanner scan4=new Scanner(System.in);
		String id;
		System.out.println(sub.count);
		System.out.println("请输入退选学生的id:");
		id=scan4.next();
		System.out.println(sub.search(id));
		sub.remove(sub.search(id));
		
		System.out.println("退选成功！新的选课信息如下:");
		System.out.println(sub.toString());
		System.out.println("选课人数:"+sub.getindex());
		System.out.println("\t学号"+"\t姓名");
		sub.bianli();
	}
	public static void print() {
		if(sub==null) {
			System.out.println("请先选课！");
			return ;
		}
		System.out.println("选课信息如下:");
		System.out.println(sub.toString());
		System.out.println("选课人数:"+sub.getindex());
		System.out.println("\t学号"+"\t姓名");
		sub.bianli();
	}
	public static void exit() {
		return;
	}
	

}
