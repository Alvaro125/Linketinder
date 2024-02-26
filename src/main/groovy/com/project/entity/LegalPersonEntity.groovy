package com.project.entity

class LegalPersonEntity extends PersonEntity {
    String cnpj

    LegalPersonEntity(
            String nome, String email, String description, AddressEntity address,
            String cnpj, List<String> skills=[]) {
        super(nome, email, description, address, skills)
        this.cnpj = cnpj
    }

    String getCnpj() {
        return cnpj
    }

    void setCnpj(String cnpj) {
        this.cnpj = cnpj
    }

    @Override
    String toString() {
        return """${super.toString()}
CNPJ: ${this.cnpj}"""
    }
}
