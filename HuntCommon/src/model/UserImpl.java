package model;

public class UserImpl implements User {

	private Integer id;
	private String name;
	private String email;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

}
