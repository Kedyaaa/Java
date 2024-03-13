package com.feb29;

public class Info {
	private String name;
	private String address;
	private String email;
	private int contact;
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		Info i1=new Info();
		i1.setName("Kedar");
		i1.setAddress("Badlapur");
		i1.setContact(123654789);
		i1.setEmail("KD@gmail.com");
		System.out.println("Learner Name:"+i1.getName()+
				"\nLearner Address:"+i1.getAddress()+
				"\nLearner Contact:"+i1.getContact()+
				"\nLearner Email Id:"+i1.getEmail());

	}

}
