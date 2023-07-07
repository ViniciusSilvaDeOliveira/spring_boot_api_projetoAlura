package med.voll.api.agendamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface agendamentoRepository extends JpaRepository<Agendamento, Long> {
    // os métodos do GRUD já existe na classe JPA e a classe médico está herdando
}
