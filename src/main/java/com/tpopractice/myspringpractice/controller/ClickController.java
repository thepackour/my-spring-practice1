package com.tpopractice.myspringpractice.controller;

import com.tpopractice.myspringpractice.service.LeaderboardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClickController {
    LeaderboardService leaderboardService;
    public ClickController(LeaderboardService leaderboardService) { this.leaderboardService = leaderboardService; }

    @PostMapping("/click")
    public void click() {
        leaderboardService.addClick();
    }
}
