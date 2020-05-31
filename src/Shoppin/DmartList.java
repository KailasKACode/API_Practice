package Shoppin;

import java.util.List;

public class DmartList {
	private String budget;
	private String Month;
	private Kitchen kitchen;
	
	private List<Soap> Soap;
	
	public List<Soap> getSoap() {
		return Soap;
	}
	public void setSoap(List<Soap> soap) {
		Soap = soap;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public Kitchen getKitchen() {
		return kitchen;
	}
	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

}
