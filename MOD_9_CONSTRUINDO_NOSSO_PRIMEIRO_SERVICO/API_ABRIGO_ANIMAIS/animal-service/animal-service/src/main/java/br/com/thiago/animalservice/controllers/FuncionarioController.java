package br.com.thiago.animalservice.controllers;

import br.com.thiago.animalservice.repositorios.FuncionarioRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController // anotação mostra que ele é um controller
@RequestMapping("/funcionario")
public class FuncionarioController {
    private FuncionarioRepository funcionarioRepository;
    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;

    }

    // Endpoint para recuperar a quantidade de animais resgatados por cada funcionário dentro de um ano
    @GetMapping("/animais-resgatados")
    public ResponseEntity<List<Object[]>> countAnimaisResgatadosPorFuncionarioNoIntervalo(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate
    ) {
        List<Object[]> animaisResgatados = funcionarioRepository.countAnimaisResgatadosPorFuncionarioNoIntervalo(
                Date.valueOf(startDate.atStartOfDay().toLocalDate()), Date.valueOf(endDate.atStartOfDay().toLocalDate())
        );
        return ResponseEntity.ok(animaisResgatados);
    }

}
