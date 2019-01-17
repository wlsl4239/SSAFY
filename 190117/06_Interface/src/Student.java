
public class Student {
	private String id;
	private String pw;
	
	public Student(String id, String pw) {
		setId(id);
		setPw(pw);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("id : ");
		builder.append(id);
		builder.append(", pw : ");
		builder.append(pw);
		return builder.toString();
	}

	
}
