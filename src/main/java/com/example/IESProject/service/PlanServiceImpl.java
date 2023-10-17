package com.example.IESProject.service;

import com.example.IESProject.bindings.PlanForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public boolean createPlan(PlanForm planForm) {
        return false;
    }

    @Override
    public List<PlanForm> fetchPlans() {
        return null;
    }

    @Override
    public PlanForm getPlanId(Integer planId) {
        return null;
    }

    @Override
    public String changePlanStatus(Integer plan, String status) {
        return null;
    }
}
