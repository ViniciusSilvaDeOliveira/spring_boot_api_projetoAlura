package med.voll.api.paciente;

public record DadosListagemPaciente(String nome, String email, String Telefone) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone());
    }
}
