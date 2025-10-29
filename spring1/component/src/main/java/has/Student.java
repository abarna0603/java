package has;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s")
public class Student {
	@Value("1")
	private int id;
	@Value("abarna")
    private String name;
	@Value("female")
	private String gender;
	@Value("abarna@123")
	private String mail;
	@Value("9056043650")
	private long phone;
	
	@Autowired
	private Degree degree;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", mail=" + mail + ", phone=" + phone
				+ ", degree=" + degree + "]";
	}
	
	
}
