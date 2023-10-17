package com.example.IESProject.service;

import com.example.IESProject.bindings.PlanForm;

import java.util.List;

public interface PlanService {

    public boolean createPlan(PlanForm planForm);

    public List<PlanForm> fetchPlans();

    public PlanForm getPlanId(Integer planId);

    public String changePlanStatus(Integer plan,String status);
}
