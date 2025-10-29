package Set;

import java.util.Set;

public class hotel {
	String name;
	String loc;
	String type;
	Set<String> menu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Set<String> getMenu() {
		return menu;
	}
	public void setMenu(Set<String> menu) {
		this.menu = menu;
	}
	@Override
	public String toString() {
		return "hotel [name=" + name + ", loc=" + loc + ", type=" + type + ", menu=" + menu + "]";
	}
	

}
