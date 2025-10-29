package map;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("h")
public class Hotel {
	@Value("pandiyas")
  private String name;
	@Value("vadapalani")
  private String loc;
	@Value("764750275")
  private long phone;
	@Autowired
	@Qualifier("veg")
	Map<String, Double> vegmenu;
	@Autowired
	@Qualifier("nonveg")
	Map<String, Double> nonvegmenu;
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", loc=" + loc + ", phone=" + phone + ", vegmenu=" + vegmenu + ", nonvegmenu="
				+ nonvegmenu + "]";
	}
	
}
