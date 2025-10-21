package dentalClinic.dentalClinic.controller;

import dentalClinic.dentalClinic.dentista.DadosCadastroDentista;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dentista")
public class DentistController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDentista cadastro){
        System.out.println(cadastro);

    }
}
