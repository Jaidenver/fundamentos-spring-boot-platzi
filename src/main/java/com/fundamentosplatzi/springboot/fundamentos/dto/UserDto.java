package com.fundamentosplatzi.springboot.fundamentos.dto;

import org.aspectj.apache.bcel.classfile.LocalVariable;

import java.time.LocalDate;

public class UserDto {
    private Long id;

    private String name;
    private LocalDate BirthDate;

    public UserDto(Long id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.BirthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        BirthDate = birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDto{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", BirthDate='").append(BirthDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
