package com.digitalInnovation.springBoot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {

    @Value("${app.message}")
    private String appMessage;

    //VARIAVEL DE AMBIENTE  -- MAPEADA
    @Value("${ENV_DB_UR:NENHUMA}")  //Caso n seja informada retorna Nenhuma
    private String dbEnvironmentVariable;


    @GetMapping("/")
    public String getAppMessage(){
        return appMessage;
    }


    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return "Variavel de ambiente passada: " + dbEnvironmentVariable;
    }
}
