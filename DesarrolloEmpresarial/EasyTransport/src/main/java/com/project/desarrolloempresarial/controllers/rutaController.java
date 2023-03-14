package com.project.desarrolloempresarial.controllers;


import com.project.desarrolloempresarial.entities.rutaEntity;
import com.project.desarrolloempresarial.models.services.conductorService;
import com.project.desarrolloempresarial.models.services.rutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class rutaController {

    @Autowired
    private rutaService rutaService;
    @Autowired
    private conductorService conductorService;

    @GetMapping("/listarRuta")
    public String listar(Model model) {
        model.addAttribute("titulo","Rutas");
        model.addAttribute("ruta", rutaService.findAll());
        return "listarRuta";
    }

        @GetMapping("/crearRuta")
    public String crear(Model model) {
        model.addAttribute("ruta1",new rutaEntity());
        model.addAttribute("conductor1",conductorService.findAll());
        model.addAttribute("titulo","Crear Ruta");
        return "crearRuta";
    }

    @PostMapping("/crearRuta")
    public String guardar(@Valid rutaEntity rutaEntity){
        rutaEntity.setEstado(true);
        rutaService.save(rutaEntity);
        return "redirect:/listarRuta";

    }

    @RequestMapping(value = "/eliminarRuta/{id}")
    public String eliminarById(@PathVariable(value = "id") Long id){
        rutaService.deleteById(id);
        return "redirect:/listarRuta";
    }

    @RequestMapping(value = "/eliminarIdRuta/{id}")
    public String eliminarState(@PathVariable(value = "id")Long id)
    {
       rutaService.changeByIdAndState(id);
        return "redirect:/listarRuta";
    }


    @GetMapping("/editarRuta/{id}")
    public String mostrarFormulario(@PathVariable(value = "id")Long id, Model model){

        model.addAttribute("titulo", "Editar Ruta");
        model.addAttribute("rutaupdate",rutaService.findOne(id));

        model.addAttribute("conductor1", conductorService.findAll());
        return "editarRuta";
    }

    @PostMapping("editarRuta/{id}")
    public String actualizar(@PathVariable(value = "id")Long id,@ModelAttribute("rutaupdate")
    rutaEntity ruta){

        rutaEntity ruta1 = rutaService.findOne(id);
        ruta1.setIdruta(id);
        ruta1.setInicio(ruta.getInicio());
        ruta1.setDestino(ruta.getDestino());
        ruta1.setCombustible(ruta.getCombustible());
        ruta1.setCantpeajes(ruta.getCantpeajes());
        ruta1.setValor(ruta.getValor());
        ruta1.setEstado(true);
        ruta1.setIdconductor(ruta.getIdconductor());

        rutaService.update(ruta1);

        return "redirect:/listarRuta";

    }




}
