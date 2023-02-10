package com.cdp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdp.entity.Account;
import com.cdp.entity.Cars;
import com.cdp.service.AccountService;
import com.cdp.service.CarsService;

@Controller
public class CarsController {

    @Autowired
    CarsService carsService;

    @Autowired
    AccountService accountService;

    @GetMapping("/admin")
    public String admin(Model model, Cars cars) {

        model.addAttribute("cars", new Cars());

        return "admin";
    }

    @PostMapping("/admin")
    public String admin(@ModelAttribute Cars cars, Model model) {

        Cars addCars = carsService.save(cars);

        model.addAttribute("cars", addCars);

        return "redirect:admin";

    }

    @GetMapping("/new")
    public String newCar(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");

        Account signedInPerson = accountService.getByEmail(email);

        model.addAttribute("account", signedInPerson);

        return "new";

    }

    @GetMapping("/used")
    public String usedCar(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");

        Account signedInPerson = accountService.getByEmail(email);

        model.addAttribute("account", signedInPerson);

        return "used";

    }

    @GetMapping("/carDetail/{make}/{newOrUsed}")
    public String carsByMake(Model model, HttpSession session, @PathVariable String make,
            @PathVariable String newOrUsed) {

        String email = (String) session.getAttribute("emailCookie");

        Account signedInPerson = accountService.getByEmail(email);

        List<Cars> carsByMake = carsService.getByMakeAndNeworUsed(make, newOrUsed);

        model.addAttribute("account", signedInPerson);

        model.addAttribute("carsByMake", carsByMake);

        return "carDetail";

    }

    @GetMapping("/carDetail/{vehicleId}")

    public String addToGarage(@ModelAttribute Account account, Model model, HttpSession session,
            @PathVariable Integer vehicleId) {

        String email = (String) session.getAttribute("emailCookie");

        Cars cars = carsService.getCarsById(vehicleId);

        Account loggedInUser = accountService.buyCar(email, cars);


        return "redirect:";
    }

}