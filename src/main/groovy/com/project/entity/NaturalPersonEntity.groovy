package com.project.entity

import com.project.entity.AddressEntity
import com.project.entity.PersonEntity

class NaturalPersonEntity extends PersonEntity {
    String cpf
    Integer age

    NaturalPersonEntity(
            String name, String email, String description, AddressEntity address,
            String cpf, Integer age, List<String> skills=[]) {
        super(name, email, description, address, skills)
        this.cpf = cpf
        this.age = age
        this.address = address
    }

    String getCpf() {
        return cpf
    }

    void setCpf(String cpf) {
        this.cpf = cpf
    }

    Integer getAge() {
        return age
    }

    void setAge(Integer age) {
        this.age = age
    }

    @Override
    String toString() {
        return """${super.toString()}
Idade: ${this.age}
CPF: ${this.cpf}"""
    }
}
