package cc.luole.tech.stuinfo_collection.core.model;


import java.io.Serializable;

public class Books implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long id;//编号
	private int type;//1图书2期刊
	private String name;//名称
	private double price;//单价
	private String detil;//备注 
	private String typeNo;//分类号
	private String author;//作者
	private String press;//出版社 
	private int duplicate;//复本量
	private int status;//状态 0正常 1 失效
	private int surplus;//剩余几本
	private String editor; //主编
	private double totaPrice;//总价
	private double pricing;//定价
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
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
	public String getDetil() {
		return detil;
	}
	public void setDetil(String detil) {
		this.detil = detil;
	}
	public String getTypeNo() {
		return typeNo;
	}
	public void setTypeNo(String typeNo) {
		this.typeNo = typeNo;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getDuplicate() {
		return duplicate;
	}
	public void setDuplicate(int duplicate) {
		this.duplicate = duplicate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getSurplus() {
		return surplus;
	}
	public void setSurplus(int surplus) {
		this.surplus = surplus;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public double getTotaPrice() {
		return totaPrice;
	}
	public void setTotaPrice(double totaPrice) {
		this.totaPrice = totaPrice;
	}
	public double getPricing() {
		return pricing;
	}
	public void setPricing(double pricing) {
		this.pricing = pricing;
	}
	
	
	
	
	
	
}
