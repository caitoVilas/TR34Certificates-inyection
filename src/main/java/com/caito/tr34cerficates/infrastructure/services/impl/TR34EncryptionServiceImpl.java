package com.caito.tr34cerficates.infrastructure.services.impl;

import com.caito.tr34cerficates.api.models.requests.TR34Params;
import com.caito.tr34cerficates.infrastructure.services.contracts.TR34EncryptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;

@Service
@Slf4j
public class TR34EncryptionServiceImpl implements TR34EncryptionService {

    @Override
    public String encrypt(PrivateKey privateKey, TR34Params params) {
        log.info("--> TR34 key encryption generation service");
        //todo: Implementación para encriptar la clave privada utilizando el algoritmo TR34
        return "";
    }
}
