package com.caito.tr34cerficates.infrastructure.services.impl;

import com.caito.tr34cerficates.infrastructure.services.contracts.PKIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

@Service
@Slf4j
public class PKIServiceImpl implements PKIService {

    @Override
    public X509Certificate getCertificate(PublicKey publicKey, String terminalId) {
        log.info("--> service to obtain the PKI certificate");
        //todo: implementacion para generar un certificado utilizando una entidad de certificacion
        return null;
    }
}
