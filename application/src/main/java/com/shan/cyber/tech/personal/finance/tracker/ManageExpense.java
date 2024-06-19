package com.shan.cyber.tech.personal.finance.tracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expense")
public class ManageExpense {
    @RequestMapping(path = "list", method = RequestMethod.GET)
    public String getExpenseList() {

        return "Expenses List";
    }
}
