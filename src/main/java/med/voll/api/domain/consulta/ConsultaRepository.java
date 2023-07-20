package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {

    //boolean existsByPacienteIdAndDataBeteween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);

    boolean existsByMedicoIdAndData(Long idMedico, LocalDateTime data);

    boolean existsbyPacienteIdAndDataBeteween(Long idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
