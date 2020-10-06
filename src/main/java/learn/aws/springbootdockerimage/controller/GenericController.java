package learn.aws.springbootdockerimage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/docker")
public class GenericController {

    @GetMapping("/image")
    public String displayRandomDockerImage(){
      return  "Creating random Instance :"+ UUID.randomUUID();
    }
}
