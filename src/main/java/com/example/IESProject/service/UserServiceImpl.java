package com.example.IESProject.service;

import com.example.IESProject.bindings.DashboardCards;
import com.example.IESProject.bindings.LogInForm;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String login(LogInForm logInForm) {
        return null;
    }

    @Override
    public boolean recoverPwd(String email) {
        return false;
    }

    @Override
    public DashboardCards fetchDashBoardInfo() {
        return null;
    }
}
