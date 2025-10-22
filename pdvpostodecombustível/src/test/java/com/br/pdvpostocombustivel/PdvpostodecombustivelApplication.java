package com.br.pdvpostocombustivel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIdefinition;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "PDV Posto Combustível API",
        )
)
public class PdvpostodecombustivelApplication {

    public static <Pessoa> void main(String[] args) {

        SpringApplication.run(PdvpostodecombustivelApplication.class, args);


        Pessoa Pessoa = new Pessoa();
        Pessoa.setApelido("Rud");
        Pessoa.setId(1);
        Pessoa.setIdade(19);
        Pessoa.setNome("Rudson Porfirio");
        rp.salvaPessoa(pessoal);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setApelido("Fu");
        pessoa2.setId(2);
        pessoa2.setIdade(29);
        pessoa2.setNome("Fulano");
        rp.salvaPessoa(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setApelido("Zé");
        pessoa3.setId(3);
        pessoa3.setIdade(23);
        pessoa3.setNome("Jose Pereira");
        rp.salvaPessoa(pessoal);
    }
}