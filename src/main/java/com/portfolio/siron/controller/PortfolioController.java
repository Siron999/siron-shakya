package com.portfolio.siron.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PortfolioController {

    @GetMapping("")
    public String portfolio(Model model) {
        return "index";

    }

    @GetMapping("portfolio-details-1")
    public String portfolioDetails1(Model model) {
        return "portfolio-details-1";

    }
    
    @GetMapping("portfolio-details-2")
    public String portfolioDetails2(Model model) {
        return "portfolio-details-2";

    }
    
    @GetMapping("portfolio-details-3")
    public String portfolioDetails3(Model model) {
        return "portfolio-details-3";

    }

}
