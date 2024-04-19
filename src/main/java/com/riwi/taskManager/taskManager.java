package com.riwi.taskManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//indicar la clase del controlador
@Controller
//RequestMapping crea la ruta base del controlador
@RequestMapping("/controller")
public class taskManager {

  //GetMapping crea una ruta específica para el modelo
  @GetMapping("/taskManager")
  @ResponseBody
  public String showMessage(){
    return "Hola Mundo";
  }
}
