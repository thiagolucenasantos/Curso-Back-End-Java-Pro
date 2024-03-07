package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@EnableDiscoveryClient
@EnableFeignClients
public class HelloWorldClient {
    //o feign utiliza interfaces para que possamos utilizar seus serviços
    @Autowired
    private HWClient hwClient;
    @FeignClient(name = "HelloWorld")//atenção o nome tem que ser exatamente igual ao dado no application.properties da parte do servidor
    interface HWClient{
        @RequestMapping(path = "/helloworld", method = RequestMethod.GET)//este path o nome tem que ser o mesmo que definimos do lado do servidor na classe controller
        @ResponseBody
        String helloWorld();
    }

    public String HelloWorld(){
        return hwClient.helloWorld();
    }
}
