package br.com.triersistemas.bibliotecapessoal.repository;

import br.com.triersistemas.bibliotecapessoal.domain.LivroDesejo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface LivroDesejoRepository extends JpaRepository<LivroDesejo, UUID>, LivroDesejoRepositoryCustom {

    @Query(value = "SELECT l FROM LivroDesejo l ORDER BY l.titulo")
    List<LivroDesejo> buscaPelaOrdemAlfabeticaTituloJPQL();

}
