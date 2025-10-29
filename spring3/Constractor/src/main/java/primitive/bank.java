package primitive;

public class bank {
	int id;
	int Acno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAcno() {
		return Acno;
	}
	public void setAcno(int acno) {
		Acno = acno;
	}
	@Override
	public String toString() {
		return "bank [id=" + id + ", Acno=" + Acno + "]";
	}
	

}
