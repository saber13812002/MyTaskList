package com.mycompany.mytasklist;

/**
 *
 * @author marcin
 */
public class Language {
    //long, ktory zawiera nulla w przypadku, kiedy nie ma 
    //jeszcze naszego elementu w tablicy bazy danych
    //id zawiera kod jezyka, w ktorym urzytkownik chce dzialac
    private Long id;
    private String message; //nasza wiadomosc
    private String code; //kod jezyka
    
    Language(Long id, String message, String code) {
        this.id = id;
        this.message = message;
        this.code = code;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
}
