package model;

public class HintImpl implements Hint{

	private Integer id;
	private Integer position;
	private String urlImage;
	private String message;
	private Integer code;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public Integer getPosition() {
		return position;
	}

	@Override
	public String getUrlImage() {
		return urlImage;
	}

	@Override
	public String getMessage() {
		return message;
	}

	@Override
	public Integer getCode() {
		return code;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void setCode(Integer code) {
		this.code = code;
	}

}
