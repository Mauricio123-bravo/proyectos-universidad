package com.project.desarrolloempresarial.controllers;





import com.project.desarrolloempresarial.entities.productoEntity;
import com.project.desarrolloempresarial.models.services.productoService;
import com.project.desarrolloempresarial.models.services.vehiculoService;
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
public class productoController {

    @Autowired
    private productoService productoService;

    @Autowired
    private vehiculoService vehiculoService;

    @GetMapping("/listarProducto")
    public String listar(Model model) {
        model.addAttribute("titulo", "Productos");
        model.addAttribute("producto", productoService.findAll());
        return "listarProducto";
    }



    //metodo editar (NO SIRVIO)
     @RequestMapping(value = "/crearProducto/{id}")
    public String editar(@PathVariable(value = "id") Long id, Map<String, Object> model) {
        productoEntity producto = null;
        if (id>0) {
            producto = productoService.findOne(id);
            if (producto == null){
                return "redirect:/crearProducto";
            }

        } else {

            return "redirect:/listarProducto";
        }

        //Opciones
        model.put("opcion1", "Cemento");
        model.put("opcion2", "Comida");
        model.put("opcion3", "Otro");

        model.put("vehiculo",vehiculoService.findAll());
        model.put("producto1",producto);

        return "crearProducto";
    }


    @GetMapping("/crearProducto")
    public String crear(Model model) {
        model.addAttribute("producto1", new productoEntity());

        //Opciones
        model.addAttribute("opcion1", "Cemento");
        model.addAttribute("opcion2", "Comida");
        model.addAttribute("opcion3", "Otro");

        model.addAttribute("vehiculo", vehiculoService.findAll());
        model.addAttribute("titulo", "Crear Producto");
        return "crearProducto";
    }

    @PostMapping("/crearProducto")
    public String guardar(@Valid productoEntity productoEntity, BindingResult result,
                          SessionStatus status){
        if (result.hasErrors()){
            return "crearProducto";
        }
        productoEntity.setEstado(true);
        productoService.save(productoEntity);
        status.setComplete();
        return "redirect:/listarProducto";

    }

    @RequestMapping(value = "/eliminarProducto/{id}")
    public String eliminarById(@PathVariable(value = "id") Long id){
        productoService.deleteById(id);
        return "redirect:/listarProducto";
    }

    @RequestMapping(value = "/eliminarIdProd/{id}")
    public String eliminarState(@PathVariable(value = "id")Long id)
    {
        productoService.changeByIdAndState(id);
        return "redirect:/listarProducto";
    }


    @GetMapping("/editarProducto/{id}")
    public String mostrarFormulario(@PathVariable(value = "id")Long id, Model model){

        model.addAttribute("titulo", "Editar Producto");
        model.addAttribute("productoupdate",productoService.findOne(id));
        //Opciones
        model.addAttribute("opcion1", "Cemento");
        model.addAttribute("opcion2", "Comida");
        model.addAttribute("opcion3", "Otro");

        model.addAttribute("vehiculo",vehiculoService.findAll());
        return "editarProducto";
    }

    @PostMapping("editarProducto/{id}")
    public String actualizar(@PathVariable(value = "id")Long id,@ModelAttribute("productoupdate")
                                                        productoEntity producto){

        productoEntity producto1 = productoService.findOne(id);
        producto1.setIdproducto(id);
        producto1.setNombreproducto(producto.getNombreproducto());
        producto1.setPesoproducto(producto.getPesoproducto());
        producto1.setTipoproducto(producto.getTipoproducto());
        producto1.setEstado(true);
        producto1.setIdvehiculo(producto.getIdvehiculo());

        productoService.update(producto1);

        return "redirect:/listarProducto";

    }



}
