package med.voll.api.domain.consulta;

import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.medico.MedicoRepository;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaDeConsultas {
    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;
    public void agendar(DadosAgendamentoConsulta dadosConsulta){
        var medico = medicoRepository.findById(dadosConsulta.idMedico()).get();
        var paciente = pacienteRepository.findById(dadosConsulta.idPaciente()).get();
        var consulta = new Consulta(null, medico, paciente, dadosConsulta.data());
        consultaRepository.save(consulta);
    }
}
