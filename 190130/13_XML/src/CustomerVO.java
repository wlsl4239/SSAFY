
public class CustomerVO {	
	private String num;
	private String name;
	private int point;
	public CustomerVO() {};
	public CustomerVO(String num, String name, int point) {
		this.num = num;
		this.name = name;
		this.point = point;
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [num=");
		builder.append(num);
		builder.append(", name=");
		builder.append(name);
		builder.append(", point=");
		builder.append(point);
		builder.append("]");
		return builder.toString();
	}
	
	
}
