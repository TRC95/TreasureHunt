package model;

public class EventImpl implements Event {

	private Admin organizer;
	private Integer hintCount;
	private String status;
	private Integer tax;
	
	@Override
	public Admin getOrganizer() {
		return organizer;
	}

	@Override
	public Integer getHintCount() {
		return hintCount;
	}

	@Override
	public String getStatus() {
		return status;
	}

	@Override
	public Integer getTax() {
		return tax;
	}

	@Override
	public void setOrganizer(Admin organizer) {
		this.organizer = organizer;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void setHintCount(Integer hintCount) {
		this.hintCount = hintCount;
	}

	@Override
	public void setTax(Integer taxValue) {
		// TODO Auto-generated method stub
		
	}


}
