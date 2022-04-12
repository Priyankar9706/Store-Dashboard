package in.pinkumaroti.entity;

public class create {
private int id;
private String itemname;
private String price;
private String description;
private String img;




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
@Override
public String toString() {
	return "create [id=" + id + ", itemname=" + itemname + ", price=" + price + ", description=" + description
			+ ", img=" + img + "]";
}


}
