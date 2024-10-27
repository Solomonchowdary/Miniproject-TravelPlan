package com.nt.ServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Isevice.Iservice;
import com.nt.Repository.PlanCetogeryRepo;
import com.nt.Repository.TravelPlanRepo;
import com.nt.model.PlanCategorey;
import com.nt.model.TravelPlan;
@Service
public class ServiceIml implements Iservice{
	@Autowired
private PlanCetogeryRepo palnRepo;
	@Autowired
	private TravelPlanRepo travelPlan;
	@Override
	public String registerTravelPlan(TravelPlan plan) {
		TravelPlan plan1=travelPlan.save(plan);
		
		return plan1.getPlanId()+" is saved.....";
	}

	@Override
	public Map<String,Object>  getAllPlanCategoriees() {
		List<PlanCategorey> planList=palnRepo.findAll();
		Map<String,Object> mp=new HashMap<>();
		for(PlanCategorey planList1:planList) {
			mp.put(planList1.getPlanId()+"", planList1.getCategory_name());
		}
		
		return mp;
	}

	@Override
	public TravelPlan showTravelByid(int id) {
		Optional<TravelPlan> opt=travelPlan.findById(id);
		TravelPlan pl=opt.orElseThrow();
		return pl;
	}

	@Override
	public List<TravelPlan> showAllTravels() {
		
		return travelPlan.findAll();
	}

	@Override
	public String updateTravelPlan(TravelPlan plan) {
		TravelPlan plan1 =travelPlan.save(plan);
		return plan1.getPlanId()+" is updated.....";
	}

	@Override
	public String deleteTravelPlan(int id) {
		Optional<TravelPlan> opt=travelPlan.findById(id);
		
		
		if(opt.isPresent())
		{		
			travelPlan.delete(opt.get());
			return "Plan is deleted sucessfully ......";
		}
		else
			return "no plan id";
	}

	@Override
	public String changeTravelPlan(int id) {
		Optional<TravelPlan> opt=travelPlan.findById(id);
		if(opt.isPresent())
		{		
			
			opt.get().setActiveSw('F');
		}
		
		return "Updated";
	}

}
