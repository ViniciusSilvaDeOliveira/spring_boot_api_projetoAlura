package med.voll.api.controller;

import jakarta.persistence.ManyToOne;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.agendamento.Agendamento;
import med.voll.api.agendamento.DadosCadastroAgendamento;
import med.voll.api.agendamento.agendamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
    @ManyToOne
    private MedicoController medico;
    @ManyToOne
    private PacienteController paciente;
    @Autowired
    private agendamentoRepository repository;

    //Gerando GetterAndSetter
    public MedicoController getMedico() {
        return medico;
    }
    public void setMedico(MedicoController medico) {
        this.medico = medico;
    }

    public PacienteController getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteController paciente) {
        this.paciente = paciente;
    }

    public AgendamentoController() {
    }

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroAgendamento dados){
        repository.save(new Agendamento(dados));
    }
}
