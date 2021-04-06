package week5;

public class subject {
	private int id;
	private String name;
	public subject(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		String m="科目:"+this.id+"科名:"+this.name;
		return m;
		
	}

}
