package com.project.desarrolloempresarial.controllers;

import com.project.desarrolloempresarial.entities.empresaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import javax.validation.Valid;
import java.util.Map;

@Controller
@SessionAttributes("producto1")
public class empresaController {

    @Autowired
    private com.project.desarrolloempresarial.models.services.empresaService empresaService;

    @GetMapping("/listarEmpresa")
    public String listar(Model model) {
        model.addAttribute("titulo","Empresas");
        model.addAttribute("empresa",empresaService.findAll());
        return "listarEmpresa";
    }

    @GetMapping("/crearEmpresa")
    public String crear(Model model) {
        model.addAttribute("empresa", new empresaEntity());
        model.addAttribute("titulo","Crear Empresa");
        return "crearEmpresa";
    }

    //metodo editar
    @RequestMapping(value = "/crearEmpresa/{id}")
    public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model) {
        empresaEntity empresa = null;
        if (id>0) {
            empresa = empresaService.findOne(id);
            if (empresa == null){
                return "redirect:/crearEmpresa";
            }

        } else {

            return "redirect:/listarEmpresa";
        }

        model.put("empresa",empresa);

        return "crearEmpresa";
    }


    @PostMapping("/crearEmpresa")
    public String guardar(@Valid empresaEntity empresaEntity, BindingResult result,
                          SessionStatus status){
        if (result.hasErrors()){
            return "crearProducto";
        }
        empresaEntity.setEstado(true);
        empresaService.save(empresaEntity);
        status.setComplete();
        return "redirect:/listarEmpresa";

    }

    @RequestMapping(value = "/eliminarEmpresa/{id}")
    public String eliminarById(@PathVariable(value = "id") Long id){
        empresaService.deleteById(id);
        return "redirect:/listarEmpresa";
    }

    @RequestMapping(value = "/eliminarIdEmp/{id}")
    public String eliminarState(@PathVariable(value = "id")Long id)
    {
        empresaService.changeByIdAndState(id);
        return "redirect:/listarEmpresa";
    }


    @GetMapping("/editarEmpresa/{id}")
    public String mostrarFormulario(@PathVariable(value = "id")Long id, Model model){

        model.addAttribute("titulo", "Editar Empresa");
        model.addAttribute("empresaupdate",empresaService.findOne(id));

        return "editarEmpresa";
    }

    @PostMapping("editarEmpresa/{id}")
    public String actualizar(@PathVariable(value = "id")Long id,@ModelAttribute("empresaupdate")
    empresaEntity empresa){

        empresaEntity empresa1 = empresaService.findOne(id);
        empresa1.setIdempresa(id);
        empresa1.setNombreempresa(empresa.getNombreempresa());
        empresa1.setCiudad(empresa.getCiudad());
        empresa1.setEstado(true);

        empresaService.update(empresa1);

        return "redirect:/listarEmpresa";

    }




}
