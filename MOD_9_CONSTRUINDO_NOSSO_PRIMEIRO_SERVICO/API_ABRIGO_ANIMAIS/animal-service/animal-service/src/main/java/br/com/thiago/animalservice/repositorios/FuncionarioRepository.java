package br.com.thiago.animalservice.repositorios;

import br.com.thiago.animalservice.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    // Método para contar a quantidade de animais resgatados por cada funcionário
    @Query("SELECT f.nome, COUNT(a) FROM Funcionario f JOIN f.animaisResgatados a " +
            "WHERE a.dataEntrada BETWEEN :startDate AND :endDate GROUP BY f.nome")
    List<Object[]> countAnimaisResgatadosPorFuncionarioNoAno(
            @Param("startDate") Date startDate, @Param("endDate") Date endDate
    );
}
