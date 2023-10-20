package com.example.tp1.springbootdemo.Controller;
import com.example.tp1.springbootdemo.Entity.Client;
import com.example.tp1.springbootdemo.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ClientController {
    @Autowired
    private ClientServiceImp clientServiceImp;

    @RequestMapping("/addClient")
    public String addClient(Model model){
        Client client = new Client();
        model.addAttribute("ClientForm",client);
        return "new_client";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("ClientForm") Client client){
        clientServiceImp.createClient(client);
        return "redirect:/";
    }




    @GetMapping("/getone/{Nom}")
    public Client getoneclient(@PathVariable("Nom") String nom){
        return clientServiceImp.getClientByNom(nom);
    }

    @GetMapping("/all")
    public List<Client> getallclient(){
        return clientServiceImp.getAllClient();
    }
    @PatchMapping("update/{id}")
    public String updateClient(@PathVariable("id") long id, @RequestBody Client client){
        Client c1 = clientServiceImp.getClientByID(id);
        if(c1!=null){
            client.setId(id);
            clientServiceImp.updateClient(client);
            return  "updated";
        }else {
            throw new RuntimeException("Failed!!!");
        }
    }


    @GetMapping("delete/{id}")
    public  void deleteVoiture(@PathVariable("id") long id){
        clientServiceImp.deleteClient(id);
    }
}
