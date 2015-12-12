package model;

/**
 * Created by 1 on 12/12/2015.
 * In
 */
public interface Hint {
    
	public Integer getId();
	public Integer getPosition();
	public String getUrlImage();
	public String getMessage();
	public Integer getCode();
    
	public void setId(Integer id);
	public void setPosition(Integer position);
	public void setUrlImage(String urlImage);
	public void setMessage(String message);
	public void setCode(Integer code);
}