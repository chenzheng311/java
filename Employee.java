package week4;

public class Employee {
	public String num;
	public String name;
	public double basicSalary;
	public double salaryRate;
    public	Employee(){
		num="s00";
		name="����";
		basicSalary=1000;
		salaryRate=1.5;		
		
	}
    public	Employee(String num,String name,double basicSalary,double salaryRate){
    	this.num=num;
    	this.name=name;
    	this.basicSalary=basicSalary;
    	this.salaryRate=salaryRate;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getSalaryRate() {
		return salaryRate;
	}
	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}
	public String tostring() {
		String info="��ţ�"+this.num+"\n������"+this.name+"\n����нˮ��"+this.basicSalary+"\nнˮ�����"+this.salaryRate+"\n";
		info+="�ܹ��ʣ�"+(this.basicSalary*(1+this.salaryRate));
		return info;
	}
}

