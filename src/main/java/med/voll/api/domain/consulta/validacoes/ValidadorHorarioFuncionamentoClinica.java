package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta{
    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);//validar se a data não é no domingo
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;//verificar se é menos que 7 da manhã
        var depoisDaAberturaDaClinica = dataConsulta.getHour() > 18;
        if (domingo || antesDaAberturaDaClinica || depoisDaAberturaDaClinica){
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica");
        }
    }
}
