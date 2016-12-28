package guiViewClasses;

import java.io.Serializable;



import javax.faces.bean.*;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

	  public String moveToPage1(){
	      return "page1";}
	  public String moveToPage(int N){
	     
		if(N==(0)){
				return "index";
			}
	  	if(N==(1)){		  
		  return "page1";
		  }
		if(N==(2)){
			return "page2";
		}
		if(N==(3)){
			return "page3";
		}
		if(N==(4)){
			return "page4";
		}
		
		else
			return "index";
	  }
}