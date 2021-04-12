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
		System.out.println("欢迎使用银行系统\n");
		System.out.println("\t1.开户 create\n");
		System.out.println("\t2.存款 save\n");
		System.out.println("\t3.取款 withdraw\n");
		System.out.println("\t4.消费 consume\n");
		System.out.println("\t5.还款 repay\n");
		System.out.println("\t6.银行结算 settle\n");
		System.out.println("\t7.查询余额 balance\n");
		System.out.println("\t8.退出 exit\n");
		System.out.println("\t请选择(1-8):\n");
		Scanner scan1=new Scanner(System.in);
		choice=scan1.nextInt();
		return choice;
	}
	public static int submenu() {
		int choice=0;
		System.out.println("请选择开卡类型");
		System.out.println("\t1.信用卡 checkingAccount\n");
		System.out.println("\t2.存储卡 savingAccount\n");
		System.out.println("\t3.返回 exit\n");
		System.out.println("请选择(1-3):");
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
		System.out.println("请输入身份证号：");
		String ssn=scan.next();
		System.out.println("请输入姓名：");
		String name=scan.next();
		System.out.println("请输入卡号：");
		String ca=scan.next();
		System.out.println("请输入服务费：");
		Float fee=scan.nextFloat();
		CheckingAccount ca1=new CheckingAccount(ca,0,fee);
		
		customer=new Customer(ssn,name,null,ca1);
	}
	public static void createSavingAccount() {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入身份证号：");
		String ssn=scan.next();
		System.out.println("请输入姓名：");
		String name=scan.next();
		System.out.println("请输入卡号：");
		String ca=scan.next();
		System.out.println("请输入利率：");
		Float rate=scan.nextFloat();
		SavingAccount sa1=new SavingAccount(ca,0,rate);
		
		customer=new Customer(ssn,name,sa1,null);
	}
	public static void save() {
		if(customer.getSa()==null) {
			System.out.println("请先开户！");
			return;
		}
		float money;
		System.out.println("请输入存款金额：");
		Scanner scan3=new Scanner(System.in);
		money=scan3.nextFloat();
		float m=customer.getSa().getBalance();
	    m=m+money;
	    customer.getSa().setBalance(m);
		System.out.println("您的当前余额为："+customer.getSa().getBalance());
		
	}
	public static void withdraw() {
		if(customer.getSa()==null) {
			System.out.println("请先开户！");
			return;
		}
		float money;
		System.out.println("请输入取款金额：");
		Scanner scan4=new Scanner(System.in);
		money=scan4.nextFloat();
		if(money>customer.getSa().getBalance()) {
			System.out.println("您取的金额大于你的存款金额，请重试！");
			return ;
		}
	    float m=customer.getSa().getBalance();
	    m=m-money;
	    customer.getSa().setBalance(m);
	    System.out.println("您的当前余额为："+customer.getSa().getBalance());
	}
	
	public static void consume() {
		if(customer.getCa()==null) {
			System.out.println("请先开户！");
			return;
		}
		float money;
		System.out.println("您消费金额为：");
		Scanner scan4=new Scanner(System.in);
		money=scan4.nextFloat();
		if(money+(-customer.getCa().getBalance())>10000) {
			System.out.println("您消费的金额大于您的信用卡额度，请重试！");
			return ;
		}
	    float m=customer.getCa().getBalance();
	    m=m-money;
	    customer.getCa().setBalance(m);
	    System.out.println(customer.getCa().getBalance());
	}
	public static void repay() {
		if(customer.getCa()==null) {
			System.out.println("请先开户！");
			return;
		}
		float money;
		System.out.println("您需要还款的金额为："+customer.getCa().getBalance());
		System.out.println("请输入您要还款的的金额:");
		Scanner scan5=new Scanner(System.in);
		money=scan5.nextFloat();
		if(money-(-customer.getCa().getBalance())>0) {
			System.out.println("您还款的金额大于你透支的费用！请重试！");
			return;
		}
	    float m=customer.getCa().getBalance();
	    m=m+money;
	    customer.getCa().setBalance(m);
	    System.out.println(customer.getCa().getBalance());
			
	}
	public static void settle() {
		if(customer.getCa()==null) {
			System.out.println("您暂未开通信用卡！");
		}else {
		customer.getCa().updateBalance();
		System.out.println("信用卡服务费结算成功！"+customer.getCa().getBalance());
		}
		if(customer.getSa()==null) {
			System.out.println("您暂未开通存储卡！");
		}else {
		customer.getSa().updateBalance();
		System.out.println("存储卡利率结算成功！"+customer.getSa().getBalance());
		}
	}
	public static void balance() {
		if(customer.getCa()==null) {
			System.out.println("您暂未开通信用卡！");
		}else {
		System.out.println("您信用卡当前透支余额为："+customer.getCa().getBalance());
		}
		if(customer.getSa()==null) {
			System.out.println("您暂未开通存储卡！");
		}else {
		customer.getSa().updateBalance();
		System.out.println("您存储卡当前余额为："+customer.getSa().getBalance());
		}
	}
	public static void exit() {
		return;
	}	
}
