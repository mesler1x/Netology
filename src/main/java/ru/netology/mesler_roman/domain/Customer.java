package ru.netology.mesler_roman.domain;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Customer implements ConsolePrintable {
    int id;
    String name;

    @Override
    public void printToConsole(){
        System.out.println(id + name);
    }
}
