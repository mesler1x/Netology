package ru.netology.mesler_roman.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OperationsDTO {
    private final int customerId;
    private final int sum;
    private final String currency;
    private final String merchant;
}
