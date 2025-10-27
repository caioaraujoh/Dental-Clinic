package dentalClinic.dentalClinic.controller;

import dentalClinic.dentalClinic.dentista.DadosCadastroDentista;
import dentalClinic.dentalClinic.dentista.Dentista;
import dentalClinic.dentalClinic.dentista.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dentistas")
public class DentistController {

    @Autowired
    private DentistaRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDentista dados){
        repository.save(new Dentista(dados));
    }
}
