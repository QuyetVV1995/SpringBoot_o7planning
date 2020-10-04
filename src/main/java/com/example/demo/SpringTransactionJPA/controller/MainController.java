package com.example.demo.SpringTransactionJPA.controller;


import com.example.demo.SpringTransaction.exception.BankTransactionException;
import com.example.demo.SpringTransactionJPA.dao.BankAccountDAO;
import com.example.demo.SpringTransactionJPA.form.SendMoneyForm;
import com.example.demo.SpringTransactionJPA.model.BankAccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@ComponentScan("com.example.demo.SpringTransactionJPA")
public class MainController {

    @Autowired
    private BankAccountDAO bankAccountDAO;

    @GetMapping("/")
    public String showBankAccounts(Model model){
        List<BankAccountInfo> list = bankAccountDAO.listBankAccountInfo();
        model.addAttribute("accountInfos",list);
        return "accountsPage";
    }

    @GetMapping("/sendMoney")
    public String viewSendMoneyPage(Model model){
        SendMoneyForm form = new SendMoneyForm(1L, 2L, 700d);
        model.addAttribute("sendMoneyForm", form);
        return "sendMoneyPage";
    }

    @PostMapping("/sendMoney")
    public String processSendMoney(Model model, SendMoneyForm sendMoneyForm){
        System.out.println("Send Money: " + sendMoneyForm.getAmount());

        try{
            bankAccountDAO.sendMoney(sendMoneyForm.getFromAccountId(),sendMoneyForm.getToAccountId(),
                        sendMoneyForm.getAmount());
        } catch (BankTransactionException e) {
            model.addAttribute("errorMessage", "Error: " + e.getMessage());
            return "/sendMoneyPage";
        }
        return "redirect:/";
    }
}