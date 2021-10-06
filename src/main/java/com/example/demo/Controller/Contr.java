package com.example.demo.Controller;

import com.example.demo.Model.Drink;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contr {


    @GetMapping("/string")
    public  Drink gimiDrink  (){

        Drink drink = new Drink("łajt raszan", 21.37f);

        return drink;

    }

}
