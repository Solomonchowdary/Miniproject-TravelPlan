package com.nt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.nt.model.TravelPlan;

public interface TravelPlanRepo extends JpaRepository<TravelPlan, Integer> {

}
