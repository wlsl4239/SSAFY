
public class StudentSystem implements StudentInterface{

	Student s = new Student("abc", "123");

	@Override
	public boolean login(String id, String pw) {
		if(s.getId().equals(id) && s.getPw().equals(pw))
			return true;
		
		return false;
	}

	@Override
	public String getInfo() {
		
		return s.toString();
	}

	@Override
	public void setPW(String pw) {
		s.setPw(pw);
	}
}
