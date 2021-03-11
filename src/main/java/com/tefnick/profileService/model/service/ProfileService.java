package com.tefnick.profileService.model.service;

import com.tefnick.configProfiles.ProfileConfig;
import com.tefnick.profileService.model.ProfileDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
