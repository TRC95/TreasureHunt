package model;

/**
 * Created by 1 on 12/12/2015.
 */
public interface User {
	
	public Integer getId();
	public String getName();
	public String getEmail();
	
	public void setId(Integer id);
	public void setName(String name);
	public void setEmail(String emai);
}
