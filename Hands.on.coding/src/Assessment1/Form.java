package Assessment1;

public class Form {

	private String sname;

	private int sroll;

	private char grade;

	private float percent;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSroll() {
		return sroll;
	}

	public void setSroll(int sroll) {
		this.sroll = sroll;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		return "Form [sname=" + sname + ", sroll=" + sroll + ", grade=" + grade + ", percent=" + percent + "]";
	}
	

	}
