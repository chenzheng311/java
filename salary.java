package week4;

public class salary {

	public static void main(String[] args) {
		Employee e1=new Employee("s01","����", 2000,0.8);
		System.out.println(e1.tostring());
		System.out.println("\n");
		Employee e2=new Employee();
		e2.setNum("s02");
		e2.setName("����");
		e2.setBasicSalary(5000);
		e2.setSalaryRate(1.2);
		System.out.println(e2.tostring());
		
		System.out.println("����Ļ�������Ϊ��"+e2.getBasicSalary());

	}

}
