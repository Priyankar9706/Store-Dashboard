package in.pinkumaroti.entity;

public class signup {
private String fname;
private String email;
private String pwd;
private String pwdr;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getPwdr() {
	return pwdr;
}
public void setPwdr(String pwdr) {
	this.pwdr = pwdr;
}
@Override
public String toString() {
	return "signup [fname=" + fname + ", email=" + email + ", pwd=" + pwd + ", pwdr=" + pwdr + "]";
}

}
