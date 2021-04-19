package week7work;

public class SubjectEnrolment{

	private String ID;
	private String Name;
	private int num;
	private Student list[];
	int max;
	int count;
	
	public SubjectEnrolment(String iD, String name, int a ,int max) {
		super();
		this.ID = iD;
		this.Name = name;
		this.num = a;
		list=new Student[max];
		count=0;
	}
	public boolean add(Student student){
		if(count-1>list.length)
			return false;
		if(student==null)
			return false;
		list[count]=student;
		count++;
		return true;			
	}
	public boolean remove(int index){
		if(index>=count||index<0)
			return false;
		
			
		list[index]=null;
		for(int i=index+1;i<=count-1&&list[i]!=null;i++){
			list[i-1]=list[i];
			list[i]=null;
		}
		count--;
		return true;
		
	}
   public void bianli(){
		for(int i=0;i<list.length&&list[i]!=null;i++){
			System.out.println(list[i].toString());
		}
	}
   public int search(String id){
	   for(int i=0;i<list.length;i++) {
	   if(id.equals(list[i].getId()))
		   return i;
	   }
	   System.out.println("未查找到！");
	   return -1;
   }
   public int getindex() {
		return this.count;
	}

	
	
	public SubjectEnrolment(){
		super();
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int a) {
		this.num = a;
	}
	@Override
	public String toString() {
		String info="";
		info+="课程id:"+this.ID+", 课程名称："+this.Name+", 最大人数："+this.num;
		return info;
	}
 
	
}
