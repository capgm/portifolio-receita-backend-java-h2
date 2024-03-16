package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Receita;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
}