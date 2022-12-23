package br.com.fourcatsdev.projetowebmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("msnBemVindo", "Bem vindo a biblioteca");
        return "publica-index";
    }
}
