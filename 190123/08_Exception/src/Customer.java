
public class Customer {
	private String name;
	private int point;
	
	public Customer(String name) {
		setName(name);
		point=5;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length() < 2)
			return;
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
		builder.append("name=");
		builder.append(name);
		builder.append(", point=");
		builder.append(point);
		return builder.toString();
	}
}
