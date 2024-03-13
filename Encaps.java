package com.feb29;
class product{
	private int pId;
	private String pname;
	private int prize;
	public int getpId() {
		return pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
}

public class Encaps {

	public static void main(String[] args) {
		product p1=new product();
		p1.setpId(101);
		p1.setPname("Speaker");
		p1.setPrize(2000);
		System.out.println(p1.getpId()+" "+p1.getPname()+" "+p1.getPrize());

	}

}
