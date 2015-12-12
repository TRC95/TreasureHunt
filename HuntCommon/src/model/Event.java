package model;

/**
 * Created by 1 on 12/12/2015.
 */
public interface Event {

    public Admin getOrganizer();
    public Integer getHintCount();
    public String getStatus();
    public Integer getTax();

    public void setOrganizer(Admin organizer);
    public void setStatus(String status);
    public void setHintCount(Integer hintCount);
    public void setTax(Integer taxValue);

}
