package dentalClinic.dentalClinic.dentista;

import dentalClinic.dentalClinic.endereco.DadosEndereco;

public record DadosCadastroDentista(String nome, String email, String cro, Especialidade especialidade, DadosEndereco endereco) {
}
