package homework4;

public class font {
	private String face;
	private String size;
	private String color;
	public font() {
		super();
	}
	public font(String face, String size, String color) {
		super();
		this.face = face;
		this.size = size;
		this.color = color;
	}
	
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "face:\t" + face + "\tsize:\t" + size + "\tcolor:\t" + color;
	}
	
	
}
