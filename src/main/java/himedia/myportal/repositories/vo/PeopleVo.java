package himedia.myportal.repositories.vo;

public class PeopleVo {
	//filed
	private Long id;
	private String name;
	private String phoneNumber;
	private String localNumber;
	
	// Constructor
	public PeopleVo() {
	}
	
	public PeopleVo(String name, String phoneNumber, String localNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.localNumber = localNumber;
	}	
	
	public PeopleVo(Long id, String name, String phoneNumber, String localNumber) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.localNumber = localNumber;
	}
	
	// Getters / Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getLocalNumber() {
		return localNumber;
	}
	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	// ToString
	@Override
	public String toString() {
		return "PeopleVo [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", localNumber=" + localNumber
				+ "]";
	}
}
