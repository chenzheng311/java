package week4;

public class Address {

	public String country;
	public String province;
	public String city;
	public String street;
	public String postcode;
	
	public Address() {
		country="δ֪";
		province="δ֪";
		city="δ֪";
		street="δ֪";
		postcode="a1111";
		
	}
	public Address(String country, String province, String city, String street, String postcode) {
		this.country=country;
		this.province=province;
		this.city=city;
		this.street=street;
		this.postcode=postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String tostring(){
	String	info="����:"+this.country+"\n"+"ʡ�ݣ�"+this.province+"\n"+"����:"+this.city+"\n"+"�ֵ���"+this.street+"\n"+"�ʱࣺ"+this.postcode;
		return info;
	}
	

}
