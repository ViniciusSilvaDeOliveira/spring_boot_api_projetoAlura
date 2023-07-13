package med.voll.api.domain.medico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
// os métodos do GRUD já existe na classe JPA e a classe médico está herdando
}
