package com.caito.tr34cerficates.infrastructure.services.contracts;

import com.caito.tr34cerficates.api.models.requests.TR34Params;

import java.security.PrivateKey;

public interface TR34EncryptionService {
    String encrypt(PrivateKey privateKey, TR34Params params);
}
