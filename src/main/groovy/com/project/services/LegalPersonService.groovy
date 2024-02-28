package com.project.services

import com.project.entity.AddressEntity
import com.project.entity.LegalPersonEntity
import com.project.entity.NaturalPersonEntity
import com.project.entity.PersonEntity
import com.project.interfaces.IPerson

class LegalPersonService implements IPerson{

    List<LegalPersonEntity> users = [
            new LegalPersonEntity(
                    "Empresa X", "empresax@email.com", "Empresa de software",
                    new AddressEntity("Brasil", "São Paulo", "111111-111"),
                    "12345678901234"
            ),
            new LegalPersonEntity(
                    "Empresa Y", "empresay@email.com", "Empresa de marketing digital",
                    new AddressEntity("Brasil", "Rio de Janeiro", "222222-222"),
                    "09876543210987"
            ),
            new LegalPersonEntity(
                    "Empresa Z", "empresaz@email.com", "Empresa de contabilidade",
                    new AddressEntity("Brasil", "Minas Gerais", "333333-333"),
                    "32145678901234"
            ),
            new LegalPersonEntity(
                    "Empresa W", "empresaw@email.com", "Empresa de logística",
                    new AddressEntity("Portugal", "Lisboa", "444444-444"),
                    "45678901234567"
            ),
            new LegalPersonEntity(
                    "Empresa V", "empresav@email.com", "Empresa de turismo",
                    new AddressEntity("Argentina", "Buenos Aires", "555555-555"),
                    "56789012345678"
            )
    ].toList()

    @Override
    List<LegalPersonEntity> listAll() {
        return users
    }

    @Override
    void addUser(PersonEntity person) {
        users.add(person)
    }
}
