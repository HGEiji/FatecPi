package com.example.FatecPi.Controller;

import com.example.FatecPi.Entity.Empresa;
import com.example.FatecPi.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaCadController{
    @Bean(name = "index")
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @Autowired
    private EmpresaService empresaService;

    @PostMapping(value = "/save")
    private String saveEmpresa(@RequestBody Empresa empresa)
    {


        empresaService.saveorUpdate(empresa);
        return empresa.get_id();
    }


    @GetMapping(value = "/getAll")
    private Iterable<Empresa>getEmpresas()
    {

        return empresaService.listAll();
    }


    @PutMapping(value = "/edit/{id}")
    private Empresa update(@RequestBody Empresa empresa,@PathVariable(name = "id")String _id)
    {
        empresa.set_id(_id);
        empresaService.saveorUpdate(empresa);
        return empresa;
    }

    @DeleteMapping(value = "/delete/{id}")
    @PutMapping(value = "/edit/{id}")
    private void deleteEmpresa(@PathVariable("id")String _id)
    {
        empresaService.deleteEmpresa(_id);
    }


    @RequestMapping("/procurar/{id}")
    private Empresa getEmpresa(@PathVariable(name ="id")String empresaid){
        return empresaService.getEmpresaById(empresaid);
    }

}
