package com.tefnick.userservice.service;

import com.tefnick.userservice.model.ProfileDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo {
    ProfileDTO getProfile();
}
