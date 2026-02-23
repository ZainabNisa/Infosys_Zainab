package com.bank.frauddetection.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnalyticsPageController {

    @GetMapping("/analytics")
    public String analyticsPage() {
        return "analytics";
    }
}