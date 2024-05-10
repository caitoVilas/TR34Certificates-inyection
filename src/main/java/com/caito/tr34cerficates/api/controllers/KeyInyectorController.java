package com.caito.tr34cerficates.api.controllers;

import com.caito.tr34cerficates.api.models.requests.KeyInyectionRequest;
import com.caito.tr34cerficates.api.models.responses.KeyInyectorResponse;
import com.caito.tr34cerficates.infrastructure.services.contracts.KeyInyectionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/keys")
@Slf4j
@RequiredArgsConstructor
public class KeyInyectorController {
    private final KeyInyectionService keyInyectionService;

    @PostMapping("/inyect")
    public ResponseEntity<KeyInyectorResponse> inyect(@RequestBody KeyInyectionRequest request){
        log.info("--> endpoint POST key injection request");
        return ResponseEntity.ok().body(keyInyectionService.inyection(request));
    }
}
