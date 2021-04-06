package week4;

public class Address {

	public String country;
	public String province;
	public String city;
	public String street;
	public String postcode;
	
	public Address() {
		country="未知";
		province="未知";
		city="未知";
		street="未知";
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
	String	info="国家:"+this.country+"\n"+"省份："+this.province+"\n"+"城市:"+this.city+"\n"+"街道："+this.street+"\n"+"邮编："+this.postcode;
		return info;
	}
	

}
