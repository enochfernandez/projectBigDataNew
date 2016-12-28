package guiViewClasses;


import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ConnectingAreaClass {
         
    private String[] selectedCities;   
    private List<String> cities;
     
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("10YAT-APG--L");
        cities.add("10YDE-ENBW--N");
        cities.add("10DE-EON--1");
        cities.add("10DE-RWENET-I");
        cities.add("10YDE-VE--2");
 
    }
 
    public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
 
    public List<String> getCities() {
        return cities;
    }
}