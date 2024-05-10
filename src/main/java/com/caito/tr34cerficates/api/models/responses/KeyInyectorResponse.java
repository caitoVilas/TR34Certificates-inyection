package com.caito.tr34cerficates.api.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor@AllArgsConstructor
@Data@Builder
public class KeyInyectorResponse implements Serializable {
    private String TerminalId;
    //todo lo que tenga que devolver
}
