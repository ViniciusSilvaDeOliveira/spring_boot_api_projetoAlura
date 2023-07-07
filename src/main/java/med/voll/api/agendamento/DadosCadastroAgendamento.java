package med.voll.api.agendamento;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroAgendamento(
        @NotBlank
        Long idMedico,
        @NotBlank
        Long idPaciente,
        @NotBlank
        String dataAgendamento,
        @NotBlank
        String horaAgendamento) {
}
