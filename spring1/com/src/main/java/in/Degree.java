package in;

public class Degree {
	private String collegeName;
	 private String degree;
	 private String stream;
	 private double cgpa;
	 private int yop;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Degree [collegeName=" + collegeName + ", degree=" + degree + ", stream=" + stream + ", cgpa=" + cgpa
				+ ", yop=" + yop + "]";
	}
	 
	 

}
