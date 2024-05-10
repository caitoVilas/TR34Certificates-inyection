package com.caito.tr34cerficates.infrastructure.services.contracts;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

public interface PKIService {
    public X509Certificate getCertificate(PublicKey publicKey, String terminalId);
}
