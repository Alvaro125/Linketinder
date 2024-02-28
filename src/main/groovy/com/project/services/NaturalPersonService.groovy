package com.project.services

import com.project.entity.AddressEntity
import com.project.entity.NaturalPersonEntity
import com.project.entity.PersonEntity
import com.project.interfaces.IPerson

class NaturalPersonService implements IPerson{

    List<NaturalPersonEntity> users = [
    new NaturalPersonEntity(
            "João Silva", "joaosilva@email.com", "Desenvolvedor Python",
            new AddressEntity("Brasil", "São Paulo", "111111-111"),
    "12345678900", 25, ["Python", "BackEnd"]
    ),
    new NaturalPersonEntity(
            "Pedro Souza", "pedrosouza@email.com", "Analista de Dados",
            new AddressEntity("Brasil", "Minas Gerais", "333333-333"),
    "32145678901", 28
    ),
    new NaturalPersonEntity(
            "Maria Oliveira", "mariaoliveira@email.com", "Engenheira de Software",
            new AddressEntity("Brasil", "Rio de Janeiro", "222222-222"),
    "09876543210", 30
    ),
    new NaturalPersonEntity(
            "Ana Costa", "anacosta@email.com", "Gerente de Projetos",
            new AddressEntity("Portugal", "Lisboa", "444444-444"),
    "45678901234", 40
    ),
    new NaturalPersonEntity(
            "Carlos Santos", "carloshs@email.com", "Designer UX/UI",
            new AddressEntity("Argentina", "Buenos Aires", "555555-555"),
    "56789012345", 23
    )
    ].toList()

    @Override
    List<NaturalPersonEntity> listAll() {
        return users
    }

    @Override
    void addUser(PersonEntity person) {
        users.add(person)
    }
}
