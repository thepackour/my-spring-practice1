package com.tpopractice.myspringpractice.domain;

import lombok.Getter;

@Getter
public class LeaderboardEntry {
    private String nickname;
    private int clicks;

    public LeaderboardEntry(String nickname, int clicks) {
        this.nickname = nickname;
        this.clicks = clicks;
    }

    public String getNickname() { return this.nickname; }

    public int getClicks () { return this.clicks; }

    public void addClick() { this.clicks++; }
}
