package med.voll.api.agendamento;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.domain.medico.Medico;
import med.voll.api.domain.paciente.Paciente;

@Table(name = "agendamentos")
@Entity(name = "Agendamento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Long idMedico;
    //private Long idPaciente;
    private String dataAgendamento;
    private String horaAgendamento;

    @ManyToOne
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente;


    //public Agendamento(DadosCadastroAgendamento dados){
        //this.idMedico = dados.idMedico();
        //this.idPaciente = dados.idPaciente();
        //this.dataAgendamento = dados.dataAgendamento();
        //this.horaAgendamento = dados.horaAgendamento();
    //}
}
