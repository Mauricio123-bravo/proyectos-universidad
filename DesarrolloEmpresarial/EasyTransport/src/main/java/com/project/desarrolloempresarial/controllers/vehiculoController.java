package com.project.desarrolloempresarial.controllers;

import com.project.desarrolloempresarial.entities.vehiculoEntity;
import com.project.desarrolloempresarial.models.services.vehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class vehiculoController {

    @Autowired
    private vehiculoService vehiculoService;


    @GetMapping("/listarVehiculo")
    public String listar(Model model) {
        model.addAttribute("titulo","Vehiculos");
        model.addAttribute("vehiculo",vehiculoService.findAll());
        return "listarVehiculo";
    }


    @GetMapping("/crearVehiculo")
    public String crear(Model model) {
        model.addAttribute("vehiculo1",new vehiculoEntity());

        model.addAttribute("titulo","Crear Vehiculo");
        return "crearVehiculo";
    }

    @PostMapping("/crearVehiculo")
    public String guardar(@Valid vehiculoEntity vehiculoEntity){
        vehiculoEntity.setEstado(true);
        vehiculoService.save(vehiculoEntity);
        return "redirect:/listarVehiculo";

    }

    @RequestMapping(value = "/eliminarVehiculo/{id}")
    public String eliminarById(@PathVariable(value = "id") Long id){
        vehiculoService.deleteById(id);
        return "redirect:/listarVehiculo";
    }

    @RequestMapping(value = "/eliminarIdVeh/{id}")
    public String eliminarState(@PathVariable(value = "id")Long id)
    {
        vehiculoService.changeByIdAndState(id);
        return "redirect:/listarVehiculo";
    }

    @GetMapping("/editarVehiculo/{id}")
    public String mostrarFormulario(@PathVariable(value = "id")Long id, Model model){

        model.addAttribute("titulo", "Editar vehiculo");
        model.addAttribute("vehiculoupdate",vehiculoService.findOne(id));



        return "editarVehiculo";
    }

    @PostMapping("editarVehiculo/{id}")
    public String actualizar(@PathVariable(value = "id")Long id,@ModelAttribute("vehiculoupdate")
    vehiculoEntity vehiculo){

        vehiculoEntity vehiculo1 = vehiculoService.findOne(id);
        vehiculo1.setIdvehiculo(id);
        vehiculo1.setModelo(vehiculo.getModelo());
        vehiculo1.setMarca(vehiculo.getMarca());
        vehiculo1.setEstado(true);


        vehiculoService.update(vehiculo1);

        return "redirect:/listarVehiculo";

    }









}
