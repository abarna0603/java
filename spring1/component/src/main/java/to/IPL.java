package to;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ipl")
public class IPL {
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
	private List<String> playersName;
	@Autowired
	@Qualifier("p2")
	private List<String>playersName2;
	@Override
	public String toString() {
		return "IPL [id=" + id + ", name=" + name + ", color=" + color + ", State=" + State + ", playersName="
				+ playersName + ", playersName2=" + playersName2 + "]";
	}
	

   
}
