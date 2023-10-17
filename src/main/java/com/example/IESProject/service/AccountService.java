package com.example.IESProject.service;

import com.example.IESProject.bindings.UnlockAccForm;
import com.example.IESProject.bindings.UserAccountForm;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface AccountService {

    public boolean CreateUserAccount(UserAccountForm userAccountForm);

    public List<UserAccountForm> fetchUserAccounts();

    public UserAccountForm getUserAccId(Integer accId);

    public String changeAccStatus(Integer accId, String status);

    public String unlockUserAccount(UnlockAccForm unlockAccForm);
}
