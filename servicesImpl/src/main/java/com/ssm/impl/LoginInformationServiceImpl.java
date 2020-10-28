package com.ssm.impl;

import com.ssm.dao.LoginInformationDao;
import com.ssm.services.LoginInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginInformationServiceImpl {

    @Autowired
    private LoginInformationDao loginInformationDao;

    /**
     * 登录信息插入
     * @param loginTime
     */
    void insertLoginInformation(String loginTime){
        loginInformationDao.insertLoginInformation(loginTime);
    }
}
