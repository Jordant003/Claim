package com.cdp.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.cdp.entity.Account;
import com.cdp.entity.Address;
import com.cdp.service.AccountService;
import com.cdp.service.AddressService;
import com.cdp.service.CarsService;

@Controller
public class AccountController {

    @Autowired
    AccountService accountService;

    @Autowired
    AddressService addressService;

    @Autowired
    CarsService carsService;


    @GetMapping("/")
    public String index(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");

        if (email != null) {

            Account signedInPerson = accountService.getByEmail(email);

            model.addAttribute("account", signedInPerson);

            return "home";
        } else {
            return "home";
        }
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {

        model.addAttribute("account", new Account());

        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(@ModelAttribute Account account, Model model, HttpSession session) {

        Address blankAddressWithId = addressService.save(new Address());
        Account signedInAccount = accountService.save(account, blankAddressWithId);

        session.setAttribute("emailCookie", signedInAccount.getEmail());

        model.addAttribute("account", signedInAccount);

        return "redirect:";
    }

    @GetMapping("/signIn")
    public String signIn(Model model) {

        model.addAttribute("account", new Account());

        return "signIn";
    }

    @PostMapping("/signIn")
    public String signIn(@ModelAttribute Account account, Model model, HttpSession session) {

        Account signedInPerson = accountService.signIn(account);

        if (signedInPerson == null) {
            model.addAttribute("account", new Account());
            return "signIn";
        }

        System.out.println(signedInPerson.toString());

        session.setAttribute("emailCookie", signedInPerson.getEmail());

        model.addAttribute("account", signedInPerson);

        if (signedInPerson.getRole().equals("admin")) {

            return "redirect:admin";

        }

        return "redirect:";

    }

    @GetMapping("/signOut")
    public String signOut(Model model, HttpSession session) {

        session.removeAttribute("emailCookie");

        return "redirect:";

    }

    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {

        String email = (String) session.getAttribute("emailCookie");

        if (email == null) {
            return "redirect:";
        }

        Account account = accountService.getByEmail(email);

        if (account == null) {
            return "redirect:";
        }

        model.addAttribute("account", account);

        return "profile";

    }

    @PostMapping("/profile/{accountId}/{addressId}")
    public String profile(@ModelAttribute Account account, Model model, @PathVariable("accountId") Integer accountId,
            @PathVariable("addressId") Integer addressId) {

        account.setId(accountId);
        account.getAddress().setId(addressId);

        addressService.save(account.getAddress());

        account = accountService.update(account);

        model.addAttribute("account", account);

        return "profile";
    }

}