package com.tefnick.profileService.model.service;

import com.tefnick.config.ProfileConfig;
import com.tefnick.profileService.model.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class ProfileService implements ProfileRepo{
    @Autowired
    private ProfileConfig pConfig;

    @Override
    public ProfileDTO getProfile() {
        ProfileDTO pdto = new ProfileDTO();
        pdto.setPConfig( pConfig );
        return pdto;
    }
}
