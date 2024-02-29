package br.com.thiago.animalservice.repositorios;

import br.com.thiago.animalservice.entidades.Animal;
import br.com.thiago.animalservice.entidades.Animal.TipoAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


//implementação do meu repositório padrão, para utilizar várias operações Jpa
//responsável por criar o banco dedados, diversas querys no banco de dados
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
    //método para encontrar os cachorros que não foram adotados
    //retorna também os animais pela data de entrada do mais velho para o mais novo
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL ORDER BY a.dataEntrada")
    List<Animal> findNotAdopted();

    //metodo para retornar os adotados
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NOT NULL")
    List<Animal> findAdopted();

    //Método para filtrar os animais por cachorro ou gato
    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL AND a.tipoAnimal = 'Cachorro' ORDER BY a.dataEntrada")
    List<Animal> findTypeCachorros();

    @Query("SELECT a FROM Animal a WHERE a.dataAdocao IS NULL AND a.tipoAnimal = 'Gato' ORDER BY a.dataEntrada")
    List<Animal> findTypeGatos();
}
