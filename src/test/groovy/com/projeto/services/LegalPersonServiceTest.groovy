package com.projeto.services

import com.project.entity.AddressEntity
import com.project.entity.LegalPersonEntity
import com.project.entity.NaturalPersonEntity
import com.project.services.LegalPersonService
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals;

class LegalPersonServiceTest {
    static LegalPersonService legalPersonService
    static List<LegalPersonEntity> legalPersonEntityList

    @BeforeAll
    static void instance() {
    }

    @BeforeEach
    void instanceEach(){
        legalPersonService = new LegalPersonService()
        legalPersonEntityList = [
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
    }
    @Test
    void listAll() {
        //Given:
        int expectedSize = 5
        Class expectedClass = ArrayList.class
        List<LegalPersonEntity> expectedList = legalPersonEntityList

        //When:
        def resultObtained = legalPersonService.listAll()

        //Then:
        assertEquals(expectedSize, resultObtained.size())
        assertEquals(expectedClass, resultObtained.getClass())
        assertEquals(expectedList.toString(), resultObtained.toString())
    }
    @Test
    void addUser() {
        //Given:
        LegalPersonEntity person = new LegalPersonEntity(
                "Empresa TEST", "test@email.com", "Empresa de test",
                new AddressEntity("test", "São test", "111111-111"),
                "12345678901234"
        )
        int expectedSize = 6
        List<NaturalPersonEntity> expectedList = legalPersonEntityList
        expectedList.add(person)

        //When:
        legalPersonService.addUser(person)
        def resultObtained = legalPersonService.listAll()

        //Then:
        assertEquals(expectedSize, resultObtained.size())
        assertEquals(expectedList.toString(), resultObtained.toString())
    }

}
