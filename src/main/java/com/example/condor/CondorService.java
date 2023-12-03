package com.example.condor;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
public class CondorService {

    public CondorDTO getCondorStatus(){
        String status = startCondorStatus();
        CondorDTO condorDTO = new CondorDTO(status);
        return condorDTO;
    }

    public String startCondorStatus(){
        try {
            // Run script
            Process process = Runtime.getRuntime().exec("./condor.sh");

            // Read output
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader( new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line);
            }

            System.out.println(output.toString());
            return output.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
