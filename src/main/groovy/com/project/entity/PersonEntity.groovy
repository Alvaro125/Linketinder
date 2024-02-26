package com.project.entity

abstract class PersonEntity {
    String name
    String email
    String description
    AddressEntity address
    List<String> skills = []

    PersonEntity(String name, String email,
                 String description, AddressEntity address, List<String> skills=[]) {
        this.name = name
        this.email = email
        this.description = description
        this.address = address
        this.skills = skills
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }

    String getDescription() {
        return description
    }

    AddressEntity getAddress() {
        return address
    }

    void setAddress(AddressEntity address) {
        this.address = address
    }

    void setDescription(String description) {
        this.description = description
    }

    void setSkills(List<String> skills) {
        this.skills = skills
    }

    List<String> getSkills() {
        return this.skills
    }

    void addSkills(String skill) {
        this.skills.add(skill)
    }


    @Override
    String toString() {
        return """Nome: ${this.name}
Email: ${this.email}
Descrição: ${this.description}
Endereço: 
    ${this.address}
Competencias: ${this.skills}"""
    }
}
