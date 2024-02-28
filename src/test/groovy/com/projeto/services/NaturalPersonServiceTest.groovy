package com.projeto.services

import com.project.entity.AddressEntity
import com.project.entity.NaturalPersonEntity
import com.project.services.NaturalPersonService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.*;

class NaturalPersonServiceTest {
    static NaturalPersonService naturalPersonService
    static List<NaturalPersonEntity> naturalPersonEntityList

    @BeforeEach
    void instanceEach() {
        naturalPersonService = new NaturalPersonService()
        naturalPersonEntityList= [
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

    }

    @Test
    void listAll() {
        //Given:
        int expectedSize = 5
        Class expectedClass = ArrayList.class
        List<NaturalPersonEntity> expectedList = naturalPersonEntityList

        //When:
        def resultObtained = naturalPersonService.listAll()

        //Then:
        assertEquals(expectedSize, resultObtained.size())
        assertEquals(expectedClass,resultObtained.getClass())
        assertEquals(expectedList.toString(),resultObtained.toString())
    }
    @Test
    void addUser(){
        //Given:
        NaturalPersonEntity person = new NaturalPersonEntity(
                "Fulano de TAl", "test@email.com", "TEste",
                new AddressEntity("TEste", "TEste", "00000-000"),
                "12345678900", 18
        )
        int expectedSize = 6
        List<NaturalPersonEntity> expectedList = naturalPersonEntityList
        expectedList.add(person)

        //When:
        naturalPersonService.addUser(person)
        def resultObtained = naturalPersonService.listAll()

        //Then:
        assertEquals(expectedSize, resultObtained.size())
        assertEquals(expectedList.toString(),resultObtained.toString())
    }

}
