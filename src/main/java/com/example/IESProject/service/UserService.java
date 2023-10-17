package com.example.IESProject.service;

import com.example.IESProject.bindings.DashboardCards;
import com.example.IESProject.bindings.LogInForm;

import java.util.List;

public interface UserService {

    public String login(LogInForm logInForm);

    public boolean recoverPwd(String email);

    public DashboardCards fetchDashBoardInfo();
}
