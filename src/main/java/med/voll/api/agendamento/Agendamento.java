package med.voll.api.agendamento;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.medico.DadosCadastroMedico;

@Table(name = "agendamentos")
@Entity(name = "Agendamento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idMedico;
    private Long idPaciente;
    private String dataAgendamento;
    private String horaAgendamento;

    public Agendamento(DadosCadastroAgendamento dados){
        this.idMedico = dados.idMedico();
        this.idPaciente = dados.idPaciente();
        this.dataAgendamento = dados.dataAgendamento();
        this.horaAgendamento = dados.horaAgendamento();
    }
}
