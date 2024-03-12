package br.com.thiago.jogoMonolito.feign;

import br.com.thiago.jogoMonolito.vo.NovoUsuarioVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cliente-novo-usuario", url = "http://localhost:8081")
public interface ClienteFeignNovoUsuario {
    @RequestMapping(method = RequestMethod.POST, path = "/usuarios")
    NovoUsuarioVo criarNovoUsuario(@RequestBody NovoUsuarioVo novoUsuarioVo);
}
