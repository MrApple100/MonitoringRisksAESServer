package com.example.monitoringriskserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkwithDataController {
    ArrayList<AES> aesRepo = new ArrayList<>();
    //@Autowired
    //private AESRepo aesRepo;
    @PostMapping("/AESS")
    public void postAllAES(@RequestBody List<AES> aeses){
        aesRepo.addAll(aeses);

    }
    @PostMapping("/AESS/{Name}")
    public Boolean postAES(@PathVariable("Name") int idaes, @RequestBody AES aes){
        System.out.println(idaes);
        System.out.println(aes.toString());
        if(aes.getId()==idaes) {
            aesRepo.add(aes);
            return true;
        }

        return false;

    }
    @GetMapping("/AESS")
    public List<AES> getAllAES(){
        return aesRepo;
    }
    @GetMapping("/AESS/{Name}")
    public AES getAllAES(@PathVariable("Name") int idaes){
        for (AES aes:aesRepo) {
            if(aes.getId()==idaes){
                return aes;
            }
        }
        return null;
    }
}
