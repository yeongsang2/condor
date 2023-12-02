package com.example.condor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@AllArgsConstructor
public class CondorDTO {
    private String status;

    public String getStatus(){
        return status;
    }

}
