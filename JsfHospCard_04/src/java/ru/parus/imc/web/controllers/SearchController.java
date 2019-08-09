package ru.parus.imc.web.controllers;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import ru.parus.imc.web.enums.SearchType;

@ManagedBean
@SessionScoped
public class SearchController implements Serializable {

    private SearchType searchType;
    private static Map<String, SearchType> searchList = new HashMap<String, SearchType>();

    public SearchController() {
        ResourceBundle bundle = ResourceBundle.getBundle("ru.parus.imc.web.nls.messages", FacesContext.getCurrentInstance().getViewRoot().getLocale());
        searchList.put(bundle.getString("surname"), SearchType.SURNAME);
        searchList.put(bundle.getString("meddoc"), SearchType.MEDDOC);
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public Map<String, SearchType> getSearchList() {
        return searchList;
    }
}
