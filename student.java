package week5;

public class student {
	private  int ID;
	private  String Name;
	
	public student(String Name,int Id){
		this.ID=Id;
		this.Name=Name;
	}
	public void setID(int ID){
		this.ID=ID;
	}
	public int getID(){
		return this.ID;
	}
	public void setName(String Name){
		this.Name=Name;
	}
	public String getName(){
	     return this.Name;
	}
	public String toString(){
		String m=+this.ID+"\t"+this.Name;
		return m;
		
	}
}
