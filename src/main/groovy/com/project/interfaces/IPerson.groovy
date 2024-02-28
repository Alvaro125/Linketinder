package com.project.interfaces

import com.project.entity.AddressEntity
import com.project.entity.NaturalPersonEntity
import com.project.entity.PersonEntity

interface IPerson {
    List<PersonEntity> users

    List<PersonEntity> listAll()

    void addUser(PersonEntity person)
}