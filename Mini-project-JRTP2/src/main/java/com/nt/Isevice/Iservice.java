package com.nt.Isevice;

import java.util.List;
import java.util.Map;

import com.nt.model.PlanCategorey;
import com.nt.model.TravelPlan;

public interface Iservice {
	
	public String registerTravelPlan(TravelPlan plan);
	public Map<String,Object>  getAllPlanCategoriees();
	public TravelPlan showTravelByid(int id);
	public List<TravelPlan> showAllTravels();
	public String updateTravelPlan(TravelPlan plan);
	public String deleteTravelPlan(int id);
	public String changeTravelPlan(int id);

}
