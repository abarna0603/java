package set;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ipl")
public class Ipl {
	@Value("1")
	private int id;
	@Value("CSK")
	private String name;
	@Value("Yellow")
	private String color;
	@Value("TamilNadu")
	private String State;
	@Autowired
	@Qualifier("p1")
	private Set<String> playersName;
	@Autowired
	@Qualifier("p2")
	private Set<String>playersName2;
	@Override
	public String toString() {
		return "Ipl [id=" + id + ", name=" + name + ", color=" + color + ", State=" + State + ", playersName="
				+ playersName + ", playersName2=" + playersName2 + "]";
	}
	

}
