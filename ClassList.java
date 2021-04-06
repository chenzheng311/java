package week5;

public class ClassList {

	private int year;
	private int semester;
	private subject sub;
	private student s1;
	private student s2;
	
	public ClassList(int year,int semester,subject sub,student s1,student s2) {
		this.year=year;
		this.semester=semester;
		this.sub=sub;
		this.s1=s1;
		this.s2=s2;
	}



	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public subject getSun() {
		return sub;
	}
	public void setSun(subject sub) {
		this.sub = sub;
	}
	public student getS1() {
		return s1;
	}
	public void setS1(student s1) {
		this.s1 = s1;
	}
	public student getS2() {
		return s2;
	}
	public void setS2(student s2) {
		this.s2 = s2;
	}
	public String toString(){
		String info="";
		info+=this.year+"学年"+this.semester+"学期\n";
		info+=this.sub.toString()+"\n";
		info+="学号\t姓名\n";
		info+=this.s1.toString()+"\n";
		info+=this.s2.toString();
		return info;
	}
	
	
	
	
	
}
