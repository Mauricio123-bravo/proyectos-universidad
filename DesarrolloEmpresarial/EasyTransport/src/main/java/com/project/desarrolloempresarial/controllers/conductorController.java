package com.project.desarrolloempresarial.controllers;


import com.project.desarrolloempresarial.entities.Authority;
import com.project.desarrolloempresarial.entities.Usuario;
import com.project.desarrolloempresarial.entities.conductorEntity;
import com.project.desarrolloempresarial.models.services.conductorService;
import com.project.desarrolloempresarial.models.services.empresaService;
import com.project.desarrolloempresarial.models.services.usuarioService;
import com.project.desarrolloempresarial.models.services.vehiculoService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class conductorController {

    @Autowired
    private conductorService conductorService;
    @Autowired
    private empresaService empresaService;

    @Autowired
    private vehiculoService vehiculoService;

    @Autowired
    usuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;


    @GetMapping("/listarConductor")
    public String listar(Model model) {
        model.addAttribute("titulo","Conductores");
        model.addAttribute("conductor",conductorService.findAll());
        return "listarConductor";
    }

    @GetMapping("/crearConductor")
    public String crear(Model model) {
        model.addAttribute("conductor1",new conductorEntity());
        model.addAttribute("empresa",empresaService.findAll());
        model.addAttribute("vehiculo",vehiculoService.findAll());
        model.addAttribute("titulo","Crear Conductor");
        return "crearConductor";
    }

    @PostMapping("/crearConductor")
    public String guardar(@Valid conductorEntity conductorEntity){
        conductorEntity.setEstado(true);
        conductorService.save(conductorEntity);
        return "redirect:/signupdos";

    }

    @RequestMapping(value = "/eliminarConductor/{id}")
    public String eliminarById(@PathVariable(value = "id") Long id){
        conductorService.deleteById(id);
        return "redirect:/listarConductor";
    }

    @RequestMapping(value = "/eliminarIdCon/{id}")
    public String eliminarState(@PathVariable(value = "id")Long id)
    {
        conductorService.changeByIdAndState(id);
        return "redirect:/listarConductor";
    }

    @GetMapping("/editarConductor/{id}")
    public String mostrarFormulario(@PathVariable(value = "id")Long id, Model model){

        model.addAttribute("titulo", "Editar Conductor");
        model.addAttribute("conductorupdate",conductorService.findOne(id));

        model.addAttribute("empresa",empresaService.findAll());
        model.addAttribute("vehiculo",vehiculoService.findAll());

        return "editarConductor";
    }

    @PostMapping("editarConductor/{id}")
    public String actualizar(@PathVariable(value = "id")Long id,@ModelAttribute("conductorupdate")
   conductorEntity conductor){

        conductorEntity conductor1 = conductorService.findOne(id);
        conductor1.setIdconductor(id);
        conductor1.setNombreconductor(conductor.getNombreconductor());
        conductor1.setApellidoconductor(conductor.getApellidoconductor());
        conductor1.setEstado(true);
        conductor1.setIdvehiculo(conductor.getIdvehiculo());
        conductor1.setIdempresa(conductor.getIdempresa());

        conductorService.update(conductor1);

        return "redirect:/listarConductor";

    }

    @RequestMapping(value = "/signupdos")
    public String crearUsuario(Map<String, Object> model) {
        Usuario usuario = new Usuario();
        model.put("usuario", usuario);
        return "signupdos";
    }

    @RequestMapping(value = "/signupdos", method = RequestMethod.POST)
    public String crearUsuarioDos(@Valid Usuario user,
                                  BindingResult result,
                                  Model model,
                                  RedirectAttributes flash,
                                  SessionStatus status) {
        if(result.hasErrors()){
            model.addAttribute("titulo","Crear Uusario");
            return "signupdos";
        }
        conductorEntity con = conductorService.findLastDriver();
        conductorEntity conductor = conductorService.findOne(con.getIdconductor());
        user.setConductor(conductor);
        String pass = passwordEncoder.encode(user.getPassword());
        user.setPassword(pass);
        user.setEstado(true);
        Authority authority = new Authority();
        authority.setAuthority("ROLE_USER");
        authority.setUsuario(user);
        user.addAuthority(authority);
        usuarioService.save(user);
        status.setComplete();
        return "redirect:/login";
    }
}




