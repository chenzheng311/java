package week7work;

public class Student {
	private String id;
	private String name;
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		String info=" ";
		info+="\t"+this.id+"\t"+this.name;
		return info;
	}
}
