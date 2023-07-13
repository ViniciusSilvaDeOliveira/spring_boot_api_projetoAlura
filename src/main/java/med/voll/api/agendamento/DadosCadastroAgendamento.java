package med.voll.api.agendamento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroAgendamento(
        @NotNull
        Long idMedico,
        @NotNull
        Long idPaciente,
        @NotBlank
        String dataAgendamento,
        @NotBlank
        String horaAgendamento) {
}
