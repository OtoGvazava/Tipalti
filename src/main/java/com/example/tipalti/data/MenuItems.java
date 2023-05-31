package com.example.tipalti.data;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MenuItems {
    HOME("Home"),
    KIKA("Kika"),
    LYCHEE("Lynchee"),
    KIMBA("Kimba");

    private final String name;
}
