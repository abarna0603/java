package has;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Degree {
	@Value("BE")
	private String degree;
	@Value("CSE")
	private String Stream;
	@Value("2024")
	private  String yop;
	@Value("7.9")
	private String cgpa;
	@Override
	public String toString() {
		return "Degree [degree=" + degree + ", Stream=" + Stream + ", yop=" + yop + ", cgpa=" + cgpa + "]";
	}
	 

}
