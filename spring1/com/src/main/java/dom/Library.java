package dom;

import java.util.Map;

public class Library {
  String name;
  String loc;
  String timing;
  Map<String,String> bookDetails;
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
public String getTiming() {
	return timing;
}
public void setTiming(String timing) {
	this.timing = timing;
}
public Map<String, String> getBookDetails() {
	return bookDetails;
}
public void setBookDetails(Map<String, String> bookDetails) {
	this.bookDetails = bookDetails;
}
@Override
public String toString() {
	return "Library [name=" + name + ", loc=" + loc + ", timing=" + timing + ", bookDetails=" + bookDetails + "]";
}
  
}
