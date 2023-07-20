package med.voll.api.domain.paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    /*@Query(value = """
            select ativo from Paciente p where p.id = :id
            """, nativeQuery = true)
    Boolean findAtivoById(Long id);*/
}
