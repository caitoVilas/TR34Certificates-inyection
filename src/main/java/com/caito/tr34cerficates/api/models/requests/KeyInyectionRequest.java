package com.caito.tr34cerficates.api.models.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor@AllArgsConstructor
@Data@Builder
public class KeyInyectionRequest implements Serializable {
    private String TerminalId;
    //todo lo que reciba en el request
}
