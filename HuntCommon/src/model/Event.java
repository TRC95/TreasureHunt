package model;

import java.util.List;

/**
 * Created by 1 on 12/12/2015.
 */
public interface Event {

    Admin getOrganizer();
    Integer getHintCount();
    Hint getHintById(Integer id);
    String getStatus();
    List<Hint> getAllHints();
    Integer getTax();

    void setStatus();
    void setHints(List<Hint> hints);
    void addHint(Hint hint);
    void changeStatus(int status);
    void setTax(Integer taxValue);

}
