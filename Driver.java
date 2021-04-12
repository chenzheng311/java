package week6test;

import java.util.Scanner;

public class Driver {

	public static Customer customer=null;
	public static void main(String[] args) {
		
		int choice=menu();
		while(choice!=8) {
			switch(choice) {
			case 1:creat();break;
			case 2:save(); break;
			case 3:withdraw(); break;
			case 4:consume(); break;
			case 5:repay(); break;
			case 6:settle(); break;
			case 7:balance(); break;
			case 8:exit();break;
			default:  System.out.println("error!");;
			}
			
			choice=menu();
	    }

		
	}
	public static int menu() {
		int choice=0;
		System.out.println("��ӭʹ������ϵͳ\n");
		System.out.println("\t1.���� create\n");
		System.out.println("\t2.��� save\n");
		System.out.println("\t3.ȡ�� withdraw\n");
		System.out.println("\t4.���� consume\n");
		System.out.println("\t5.���� repay\n");
		System.out.println("\t6.���н��� settle\n");
		System.out.println("\t7.��ѯ��� balance\n");
		System.out.println("\t8.�˳� exit\n");
		System.out.println("\t��ѡ��(1-8):\n");
		Scanner scan1=new Scanner(System.in);
		choice=scan1.nextInt();
		return choice;
	}
	public static int submenu() {
		int choice=0;
		System.out.println("��ѡ�񿪿�����");
		System.out.println("\t1.���ÿ� checkingAccount\n");
		System.out.println("\t2.�洢�� savingAccount\n");
		System.out.println("\t3.���� exit\n");
		System.out.println("��ѡ��(1-3):");
		Scanner scan2=new Scanner(System.in);
		choice=scan2.nextInt();
		return choice;
    }

	public static void creat(){
		int choice=submenu();
		while(choice!=3) {
			switch(choice) {
			case 1:createCheckingAccount();break;
			case 2:createSavingAccount(); break;
			default:System.out.println("error!"); ;
			}
			
			choice=submenu();
	    }
    }
	public static void createCheckingAccount() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���������֤�ţ�");
		String ssn=scan.next();
		System.out.println("������������");
		String name=scan.next();
		System.out.println("�����뿨�ţ�");
		String ca=scan.next();
		System.out.println("���������ѣ�");
		Float fee=scan.nextFloat();
		CheckingAccount ca1=new CheckingAccount(ca,0,fee);
		
		customer=new Customer(ssn,name,null,ca1);
	}
	public static void createSavingAccount() {
		Scanner scan=new Scanner(System.in);
		System.out.println("���������֤�ţ�");
		String ssn=scan.next();
		System.out.println("������������");
		String name=scan.next();
		System.out.println("�����뿨�ţ�");
		String ca=scan.next();
		System.out.println("���������ʣ�");
		Float rate=scan.nextFloat();
		SavingAccount sa1=new SavingAccount(ca,0,rate);
		
		customer=new Customer(ssn,name,sa1,null);
	}
	public static void save() {
		if(customer.getSa()==null) {
			System.out.println("���ȿ�����");
			return;
		}
		float money;
		System.out.println("���������");
		Scanner scan3=new Scanner(System.in);
		money=scan3.nextFloat();
		float m=customer.getSa().getBalance();
	    m=m+money;
	    customer.getSa().setBalance(m);
		System.out.println("���ĵ�ǰ���Ϊ��"+customer.getSa().getBalance());
		
	}
	public static void withdraw() {
		if(customer.getSa()==null) {
			System.out.println("���ȿ�����");
			return;
		}
		float money;
		System.out.println("������ȡ���");
		Scanner scan4=new Scanner(System.in);
		money=scan4.nextFloat();
		if(money>customer.getSa().getBalance()) {
			System.out.println("��ȡ�Ľ�������Ĵ��������ԣ�");
			return ;
		}
	    float m=customer.getSa().getBalance();
	    m=m-money;
	    customer.getSa().setBalance(m);
	    System.out.println("���ĵ�ǰ���Ϊ��"+customer.getSa().getBalance());
	}
	
	public static void consume() {
		if(customer.getCa()==null) {
			System.out.println("���ȿ�����");
			return;
		}
		float money;
		System.out.println("�����ѽ��Ϊ��");
		Scanner scan4=new Scanner(System.in);
		money=scan4.nextFloat();
		if(money+(-customer.getCa().getBalance())>10000) {
			System.out.println("�����ѵĽ������������ÿ���ȣ������ԣ�");
			return ;
		}
	    float m=customer.getCa().getBalance();
	    m=m-money;
	    customer.getCa().setBalance(m);
	    System.out.println(customer.getCa().getBalance());
	}
	public static void repay() {
		if(customer.getCa()==null) {
			System.out.println("���ȿ�����");
			return;
		}
		float money;
		System.out.println("����Ҫ����Ľ��Ϊ��"+customer.getCa().getBalance());
		System.out.println("��������Ҫ����ĵĽ��:");
		Scanner scan5=new Scanner(System.in);
		money=scan5.nextFloat();
		if(money-(-customer.getCa().getBalance())>0) {
			System.out.println("������Ľ�������͸֧�ķ��ã������ԣ�");
			return;
		}
	    float m=customer.getCa().getBalance();
	    m=m+money;
	    customer.getCa().setBalance(m);
	    System.out.println(customer.getCa().getBalance());
			
	}
	public static void settle() {
		if(customer.getCa()==null) {
			System.out.println("����δ��ͨ���ÿ���");
		}else {
		customer.getCa().updateBalance();
		System.out.println("���ÿ�����ѽ���ɹ���"+customer.getCa().getBalance());
		}
		if(customer.getSa()==null) {
			System.out.println("����δ��ͨ�洢����");
		}else {
		customer.getSa().updateBalance();
		System.out.println("�洢�����ʽ���ɹ���"+customer.getSa().getBalance());
		}
	}
	public static void balance() {
		if(customer.getCa()==null) {
			System.out.println("����δ��ͨ���ÿ���");
		}else {
		System.out.println("�����ÿ���ǰ͸֧���Ϊ��"+customer.getCa().getBalance());
		}
		if(customer.getSa()==null) {
			System.out.println("����δ��ͨ�洢����");
		}else {
		customer.getSa().updateBalance();
		System.out.println("���洢����ǰ���Ϊ��"+customer.getSa().getBalance());
		}
	}
	public static void exit() {
		return;
	}	
}
