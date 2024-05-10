package com.caito.tr34cerficates.infrastructure.services.impl;

import com.caito.tr34cerficates.infrastructure.services.contracts.KeyPairService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.KeyPair;

@Service
@Slf4j
public class KeyPairServiceImpl implements KeyPairService {

    @Override
    public KeyPair generateKeyPair() {
        log.info("--> private and public key generation service");
        return null;
    }
}
