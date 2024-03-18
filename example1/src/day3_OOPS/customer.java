package day3_OOPS;
public class customer {
private int cid;
private String caddress;
private String cname;
// explicit default constructor
public customer()
{
	this.cid=144;
	this.cname="unknown";
	this.caddress="Chennai";
}
// parmeterized constructor 
public customer(int cid,String cname,String caddress)
{
	this.cid=cid;
	this.cname=cname;
	this.caddress=caddress;
}
//getters and setters to access private variable
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
@Override //it is used to indicate the function is overloaded the compiler checks the variable inside it
public String toString() {
	return "customer [cid=" + cid + ", caddress=" + caddress + ", cname=" + cname + "]";
}
}