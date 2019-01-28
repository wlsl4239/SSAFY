
public class Administrator extends Person {
	public Administrator(String id, String pw, String name) {

		super(id,pw,name);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		return builder.toString();
	}
	
}
