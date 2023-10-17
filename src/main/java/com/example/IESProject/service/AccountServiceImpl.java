package com.example.IESProject.service;

import com.example.IESProject.bindings.UnlockAccForm;
import com.example.IESProject.bindings.UserAccountForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Override
    public boolean CreateUserAccount(UserAccountForm userAccountForm) {
        return false;
    }

    @Override
    public List<UserAccountForm> fetchUserAccounts() {
        return null;
    }

    @Override
    public UserAccountForm getUserAccId(Integer accId) {
        return null;
    }

    @Override
    public String changeAccStatus(Integer accId, String status) {
        return null;
    }

    @Override
    public String unlockUserAccount(UnlockAccForm unlockAccForm) {
        return null;
    }
}
