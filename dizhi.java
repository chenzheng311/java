package week4;

public class dizhi {
	public static void main(String[] args) {
		Address emp=new Address("�й�","����","�人","����","s1001");
		System.out.println(emp.tostring());
		Address emp1=new Address();
		emp1.setCountry("�й�");
		emp1.setProvince("����");
		emp1.setCity("��ɳ");
		emp1.setStreet("����");
		emp1.setPostcode("s1111");
        System.out.println(emp1.tostring());
        System.out.println("�����ڣ�"+emp1.getCountry());
	}

}
