package com.caito.tr34cerficates.infrastructure.services.contracts;

import com.caito.tr34cerficates.api.models.requests.KeyInyectionRequest;
import com.caito.tr34cerficates.api.models.responses.KeyInyectorResponse;

import java.util.concurrent.CompletableFuture;

public interface KeyInyectionService {
    CompletableFuture<KeyInyectorResponse> inyection(KeyInyectionRequest request);
}
