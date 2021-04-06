package week4;

public class dizhi {
	public static void main(String[] args) {
		Address emp=new Address("中国","湖北","武汉","阳光","s1001");
		System.out.println(emp.tostring());
		Address emp1=new Address();
		emp1.setCountry("中国");
		emp1.setProvince("湖南");
		emp1.setCity("长沙");
		emp1.setStreet("骄阳");
		emp1.setPostcode("s1111");
        System.out.println(emp1.tostring());
        System.out.println("湖南在："+emp1.getCountry());
	}

}
