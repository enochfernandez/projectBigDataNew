package guiViewClasses;

  
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;
 
@ManagedBean
public class CheckboxView {
 
    private String[] selectedConsoles;
    private String[] selectedConsoles2;
    private String[] selectedCities;
    private String[] selectedCities2;
    private List<String> cities;
    private List<SelectItem> cars;
    private String[] selectedCars;
 
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("AT");
        cities.add("BE");
        cities.add("CZ");
        cities.add("ES");
        cities.add("FR");
        cities.add("HU");
        cities.add("NL");
        cities.add("NO");
        cities.add("SI");
        cities.add("IT");
        cities.add("DEAT");
        cities.add("DE");
        cities.add("DK");
        cities.add("SE");
        cities.add("UK");
 
        cars = new ArrayList<SelectItem>();
         
        SelectItemGroup americanCars = new SelectItemGroup("Filters");
        americanCars.setSelectItems(new SelectItem[]{
            new SelectItem("Forecast", "Forecast"),
            new SelectItem("Actual", "Actual"),
             });
 
        cars.add(americanCars);
    }
 
    public String[] getSelectedConsoles() {
        return selectedConsoles;
    }
 
    public void setSelectedConsoles(String[] selectedConsoles) {
        this.selectedConsoles = selectedConsoles;
    }
 
    public String[] getSelectedCities() {
        return selectedCities;
    }
 
    public void setSelectedCities(String[] selectedCities) {
        this.selectedCities = selectedCities;
    }
 
    public String[] getSelectedCities2() {
        return selectedCities;
    }
 
   
 
    public String[] getSelectedConsoles2() {
        return selectedConsoles2;
    }
 
    public void setSelectedConsoles2(String[] selectedConsoles2) {
        this.selectedConsoles2 = selectedConsoles2;
    }
 
    public List<String> getCities() {
        return cities;
    }
 
    public List<SelectItem> getCars() {
        return cars;
    }
 
    public void setCars(List<SelectItem> cars) {
        this.cars = cars;
    }
 
    public String[] getSelectedCars() {
        return selectedCars;
    }
 
    public void setSelectedCars(String[] selectedCars) {
        this.selectedCars = selectedCars;
    }
}