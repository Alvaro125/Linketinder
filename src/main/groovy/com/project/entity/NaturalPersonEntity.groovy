package com.project.entity

import com.project.entity.AddressEntity
import com.project.entity.PersonEntity

class NaturalPersonEntity extends PersonEntity {
    String cpf
    Integer age

    NaturalPersonEntity(
            String nome, String email, String description, AddressEntity address,
            String cpf, Integer age, List<String> skills=[]) {
        super(nome, email, description, address, skills)
        this.cpf = cpf
        this.age = age
        this.address = address
    }

    @Override
    String toString() {
        return """${super.toString()}
Idade: ${this.age}
CPF: ${this.cpf}"""
    }
}
