package com.ejemplo.ejemplospring.controllers;

import com.ejemplo.ejemplospring.models.entitys.Producto;
import com.ejemplo.ejemplospring.models.services.IProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {

    @Autowired
    private IProductoServices productoServices;

    @GetMapping
    public List<Producto> getAll(){
        return productoServices.getAll();
    }

    @PostMapping
    public Producto save(@RequestBody @Valid Producto producto){
        System.out.println("--- controllador" + producto);
        return productoServices.save(producto);
    }


}
