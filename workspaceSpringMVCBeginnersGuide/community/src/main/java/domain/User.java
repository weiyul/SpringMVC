package domain;

public class User {
	private String id;
	private String userName;
	private String password;
	private String realName;
	private String gender;
	private Integer age;
	private String personalSignature;
	public User(){
		
	}
	public User(String userName, String password, String realName, String gender,
			Integer age, String personalSignature) {
	
		
		this.userName = userName;
		this.password = password;
		this.realName = realName;
		this.gender = gender;
		this.age = age;
		this.personalSignature = personalSignature;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPersonalSignature() {
		return personalSignature;
	}
	public void setPersonalSignature(String personalSignature) {
		this.personalSignature = personalSignature;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", realName=" + realName + ", gender=" + gender
				+ ", age=" + age + ", personalSignature=" + personalSignature
				+ "]";
	}
	


}
