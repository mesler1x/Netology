package ru.netology.mesler_roman.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class OperationsGetResponse {
    private final List<OperationsDTO> operations;

}
