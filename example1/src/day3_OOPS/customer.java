package day3_OOPS;

public class customer {
private int cid;
private String caddress;
private String cname;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCaddress() {
	return caddress;
}
public void setCaddress(String caddress) {
	this.caddress = caddress;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
@Override
public String toString() {
	return "customer [cid=" + cid + ", caddress=" + caddress + ", cname=" + cname + "]";
}
}