package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.agendamento.Agendamento;
import med.voll.api.agendamento.DadosCadastroAgendamento;
import med.voll.api.agendamento.agendamentoRepository;
import med.voll.api.medico.Medico;
import med.voll.api.paciente.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("agendamentos")
public class AgendamentoController {

    @Autowired
    private agendamentoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroAgendamento dados){
        Agendamento agendamento = new Agendamento();
        agendamento.setMedico(new Medico(dados.idMedico()));
        agendamento.setPaciente(new Paciente(dados.idPaciente()));
        agendamento.setDataAgendamento(dados.dataAgendamento());
        agendamento.setHoraAgendamento(dados.horaAgendamento());
        repository.save(agendamento);
    }
}
