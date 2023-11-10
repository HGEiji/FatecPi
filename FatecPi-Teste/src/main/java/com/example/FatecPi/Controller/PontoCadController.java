package com.example.FatecPi.Controller;

import com.example.FatecPi.Entity.Ponto;
import com.example.FatecPi.Entity.PontoImagem;
import com.example.FatecPi.Service.PontoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class PontoCadController {
    @Autowired
    private PontoService pontoService;
    
     @PostMapping("/savePonto")
    public ResponseEntity<String> savePonto(@ModelAttribute Ponto ponto, @RequestParam ("imagemPonto") MultipartFile imagem){
        /* if(imagemPonto.isEmpty()){
             return ResponseEntity.badRequest().body("DEU RUIM");
         }String imagemPonto = imagem.getOriginalFilename();
         byte[] bytes= imagemPonto.getBytes();
         ponto.savePonto(new PontoImagem(imagemPonto,bytes));*/

        boolean cadastroValido = pontoService.saveorUpdatePonto(ponto);
        if (cadastroValido) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("getAllPonto")
    @ResponseBody
    public Iterable<Ponto> getPontos(){
        return pontoService.listAll();
    }

}
