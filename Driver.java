package week5;

import java.util.Scanner;

public class Driver {

	static ClassList list;

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 3) {
			switch (choose) {
			case 1:
				creatList();
				break;
			case 2:
				printList();
				break;

			default:
				System.out.println("error!");
			}
			choose=menu();
		}
	}

	public static int menu() {
		int choose = 0;
		System.out.println("1.Create Attendance List");
		System.out.println("2.Print Attendance List");
		Scanner scan1 = new Scanner(System.in);
		choose = scan1.nextInt();
		System.out.println("Your choose:" + choose);

		return choose;

	}

	public static void creatList() {

		Scanner scan = new Scanner(System.in);
		int year1 = scan.nextInt();
        System.out.println("������ѧ�꣺"+year1);
		int semester1 = scan.nextInt();
		System.out.println("������ѧ�ڣ�1��2����" + semester1);
		int id1 = scan.nextInt();
		System.out.println("������γ̴��룺" + id1);
		String name1 = scan.next();
		System.out.println("������γ����ƣ�" + name1);
		int ID1 = scan.nextInt();
		System.out.println("������ѧ��1ѧ�ţ�" + ID1);
		String Name1 = scan.next();
		System.out.println("������ѧ��1������" + Name1);
		int ID2 = scan.nextInt();
		System.out.println("������ѧ��2ѧ�ţ�" + ID2);
		String Name2 = scan.next();
		System.out.println("������ѧ��2������" + Name2);
		student s1 = new student(Name1, ID1);
		student s2 = new student(Name2, ID2);
		subject s3 = new subject(id1, name1);
		list = new ClassList(year1, semester1, s3, s1, s2);

	}

	public static void printList() {
		if (list == null) {
			System.out.println("����ִ�е�һ��!");
			return;
		}
		System.out.println(list.toString());
	}

}
