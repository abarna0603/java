package setCon;

import java.util.Set;

public class set {
	String name;
	String loc;
	String type;
	Set<String> menu;
	public set(String name, String loc, String type, Set<String> menu) {
		super();
		this.name = name;
		this.loc = loc;
		this.type = type;
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "set [name=" + name + ", loc=" + loc + ", type=" + type + ", menu=" + menu + "]";
	}
	

}
