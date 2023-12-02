package com.example.condor;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CondorController {

    private final CondorService condorService;

    @GetMapping("/")
    public String condorStatue() {
        CondorDTO condorDTO = condorService.getCondorStatus();
        return condorDTO.getStatus();
    }

}