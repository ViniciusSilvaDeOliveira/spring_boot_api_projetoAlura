package med.voll.api.agendamento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.medico.Medico;
import med.voll.api.paciente.Paciente;

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
