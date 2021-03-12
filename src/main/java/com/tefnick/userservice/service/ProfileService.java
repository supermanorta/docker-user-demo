package com.tefnick.userservice.service;

import com.tefnick.userservice.model.DataSrc;
import com.tefnick.userservice.model.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.prefs.PreferencesFactory;

@Service
public class ProfileService implements ProfileRepo{

    private DataSrc pConfig;
    @Autowired
    public ProfileService(DataSrc data){
        pConfig = data;
    }

    @Override
    public ProfileDTO getProfile() {
        ProfileDTO dto = new ProfileDTO(this.pConfig);
        return dto;
    }
}
