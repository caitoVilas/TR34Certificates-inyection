package com.caito.tr34cerficates.infrastructure.services.contracts;

import com.caito.tr34cerficates.api.models.requests.KeyInyectionRequest;
import com.caito.tr34cerficates.api.models.responses.KeyInyectorResponse;

public interface KeyInyectionService {
    KeyInyectorResponse inyection(KeyInyectionRequest request);
}
