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
			default:System.out.println("��������������ѡ��");
			}
			
			choice=menu();
		}
		
}
	public static int menu(){
		int choice;
		System.out.println("=======WTUѡ��ϵͳ=======");
		System.out.println("1.�����¿γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ����");
		System.out.println("5.�˳�");
		System.out.println("��ѡ��(1~5):");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	public static void creatSubject(){
		String id,name;
		int a;
		Scanner scan1=new Scanner(System.in); 
		System.out.println("���������봴���Ŀγ�id��");
		id=scan1.next();
		System.out.println("������γ����ƣ�");
		name=scan1.next();
		System.out.println("���������������");
		a=scan1.nextInt();
		 sub=new SubjectEnrolment(id,name,a,a);
		System.out.println("�γ̴����ɹ�����Ϣ���£�\n");
		System.out.println(sub.toString());
		
	}
	public static void creatStudent(){
		if(sub==null) {
			System.out.println("����ѡ�Σ�");
			return ;
		}
		if(sub.getindex()+1>sub.getNum()) {
			System.out.println("ѡ������������");
			return;
		}
		String id,name;
		Scanner scan2=new Scanner(System.in);
		System.out.println("������ѡ��ѧ����id:");
		id=scan2.next();
		System.out.println("������ѡ��ѧ����������");
		name=scan2.next();
		
		Student a=new Student(id,name);
		
		System.out.println(sub.count);
		System.out.println(sub.getindex());
		
		sub.add(a);
		System.out.println("��ϲ�㣬ѡ�γɹ���");
		System.out.println("Ŀǰѡ��������£�");
		System.out.println(sub.toString());
		System.out.println("ѡ��������"+sub.getindex());
		System.out.println("\tѧ��"+"\t����");
		sub.bianli();	
	}
	public static void withdraw() {
		if(sub==null) {
			System.out.println("����ѡ�Σ�");
			return ;
		}
		Scanner scan4=new Scanner(System.in);
		String id;
		System.out.println(sub.count);
		System.out.println("��������ѡѧ����id:");
		id=scan4.next();
		System.out.println(sub.search(id));
		sub.remove(sub.search(id));
		
		System.out.println("��ѡ�ɹ����µ�ѡ����Ϣ����:");
		System.out.println(sub.toString());
		System.out.println("ѡ������:"+sub.getindex());
		System.out.println("\tѧ��"+"\t����");
		sub.bianli();
	}
	public static void print() {
		if(sub==null) {
			System.out.println("����ѡ�Σ�");
			return ;
		}
		System.out.println("ѡ����Ϣ����:");
		System.out.println(sub.toString());
		System.out.println("ѡ������:"+sub.getindex());
		System.out.println("\tѧ��"+"\t����");
		sub.bianli();
	}
	public static void exit() {
		return;
	}
	

}
