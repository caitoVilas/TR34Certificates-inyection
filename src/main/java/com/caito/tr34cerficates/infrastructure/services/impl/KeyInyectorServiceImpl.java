package com.caito.tr34cerficates.infrastructure.services.impl;

import com.caito.tr34cerficates.api.models.requests.KeyInyectionRequest;
import com.caito.tr34cerficates.api.models.requests.TR34Params;
import com.caito.tr34cerficates.api.models.responses.KeyInyectorResponse;
import com.caito.tr34cerficates.infrastructure.services.contracts.KeyInyectionService;
import com.caito.tr34cerficates.infrastructure.services.contracts.KeyPairService;
import com.caito.tr34cerficates.infrastructure.services.contracts.PKIService;
import com.caito.tr34cerficates.infrastructure.services.contracts.TR34EncryptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class KeyInyectorServiceImpl implements KeyInyectionService {
    private final KeyPairService keyPairService;
    private final PKIService pkiService;
    private final TR34EncryptionService tr34EncryptionService;

    @Override
    public KeyInyectorResponse inyection(KeyInyectionRequest request) {
        log.info("--> key injection service with certificate");
        var keyPair = keyPairService.generateKeyPair();
        var certificate = pkiService.getCertificate(keyPair.getPublic(), request.getTerminalId());
        var tr34Params = TR34Params.builder()
                //meter los campos de TR34Params
                .build();
        var encriptedPrivateKey = tr34EncryptionService.encrypt(keyPair.getPrivate(), tr34Params);
        try {
            //todo: hacer la inyeccion a la terminal con los datos de la teminal, llave publica certificado
            // y la encriptacion de la llave privada
        }catch (Exception e){
            //todo: hacer la captura de las excepciones necesarias
        }

        return null;
    }
}
