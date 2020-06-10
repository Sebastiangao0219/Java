package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * 作者 E-mail:sebastiangao0219@gmail.com
 * @date 创建时间：Apr 4, 2020 1:46:59 AM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 */
public class Product {
	private String name;
	private double price;
	/* Description of product*/
	private String description;
	/* service of product*/
	private String[] services;
	
	public Product() {}
	
	public Product(String name, String description) {
		setName(name);
		setDescription(description);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String[] getServices() {
		return services;
	}
	public void setServices(String[] services) {
		this.services = services;
	}
	
}
