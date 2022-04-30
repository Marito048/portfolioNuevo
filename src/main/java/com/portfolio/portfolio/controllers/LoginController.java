package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.LoginModel;
import com.portfolio.portfolio.services.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    
    @GetMapping("/get")
    @ResponseBody
    public ArrayList<LoginModel> obtenerLogin(){
        return loginService.obtenerUsuario();
    }
    @PostMapping("/new")
    
    public void crearUsuario(@RequestBody LoginModel login){
         loginService.crearUsuario(login);
    }
    @PutMapping("/update")
    public void modificarUsuario(@RequestBody LoginModel login){
        loginService.crearUsuario(login);
            
    }    
    @DeleteMapping("/delete/{id_login}")
    public void borrarUsuario(@PathVariable Long id_login){
        loginService.eliminarUsuario(id_login);
            
    } 
    
    
}
