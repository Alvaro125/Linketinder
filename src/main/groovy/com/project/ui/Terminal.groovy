package com.project.ui

import com.project.entity.AddressEntity
import com.project.entity.NaturalPersonEntity
import com.project.entity.LegalPersonEntity
import com.project.services.LegalPersonService
import com.project.services.NaturalPersonService

class Terminal {
    static NaturalPersonService naturalPersonService
    static LegalPersonService legalPersonService

    Terminal(){
        legalPersonService = new LegalPersonService()
        naturalPersonService = new NaturalPersonService()
    }

    void run() {
        def option = ""
        while (!option.equals("0")){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
            println """
        ####################################
        #PAINEL                            #
        ####################################
        #0-Sair                            #
        #1-Listar Candidatos               #
        #2-Listar Empresas                 #
        #3-Adicionar Candidato             #
        #4-Adicionar Empresa               #
        ####################################
        """
            print 'Opção:'
            option = br.readLine()
            switch (option) {
                case "0":
                    println """
                ░▄▀█░█▀▄░█▀▀░█░█░█▀
                ░█▀█░█▄▀░██▄░█▄█░▄█
                ░░░░░░░░░░░░░░░░░░░░
                """
                    return
                case "1":
                    println(naturalPersonService
                            .listAll()
                            .join("\n----------------------------------------\n"))
                    break
                case "2":
                    println legalPersonService
                            .listAll()
                            .join("\n----------------------------------------\n")
                    break
                case "3":
                    addNaturalPerson(br)
                    break
                case "4":
                    addLegalPerson(br)
                    break
                default:
                    println """
                ░█▀▀░█▀█░█▀█░█▀█░█▀█
                ░██▄░█▀▄░█▀▄░█▄█░█▀▄
                ░░░░░░░░░░░░░░░░░░░░
                """
            }
        }
    }

    private void addNaturalPerson(BufferedReader br) {
        List<String> skills = []
        print "Nome:"
        String name = br.readLine()
        while (name.isEmpty()){
            print "Nome:"
            name = br.readLine()
        }
        print "Email:"
        String email = br.readLine()
        while (email.isEmpty()){
            print "Email:"
            email = br.readLine()
        }
        print "Descrição:"
        String description = br.readLine()
        while (description.isEmpty()){
            print "Descrição:"
            description = br.readLine()
        }
        print "Endereço:\n\tPais:"
        String country = br.readLine()
        while (country.isEmpty()){
            print "\tPais:"
            country = br.readLine()
        }
        print "\tEstado:"
        String state = br.readLine()
        while (state.isEmpty()){
            print "\tEstado:"
            state = br.readLine()
        }
        print "\tCEP:"
        String cep = br.readLine()
        while (cep.isEmpty()){
            print "\tCEP:"
            cep = br.readLine()
        }
        println "caso não queira adicionar um competencia, aperte ENTER"
        int count = 1
        print "Competencia #$count: "
        String skill = br.readLine()
        while (!skill.isEmpty()){
            skills.add(skill)
            count++
            print "Competencia #$count: "
            skill = br.readLine()
        }
        print "Idade:"
        Integer age = br.readLine().toInteger()
        while (age<18){
            print "Idade:"
            age = br.readLine().toInteger()
        }
        print "CPF:"
        String cpf = br.readLine()
        while (cpf.isEmpty()){
            print "CPF:"
            cpf = br.readLine()
        }

        NaturalPersonEntity new_candidate = new NaturalPersonEntity(
                name, email, description, new AddressEntity(country,state,cep),
                cpf,age,skills
        )

        println "\n\n"+new_candidate
        naturalPersonService.addUser(new_candidate)
    }

    private void addLegalPerson(BufferedReader br) {
        List<String> skills = []
        print "Nome da Empresa:"
        String name = br.readLine()
        while (name.isEmpty()){
            print "Nome da Empresa:"
            name = br.readLine()
        }
        print "Email da Empresa:"
        String email = br.readLine()
        while (email.isEmpty()){
            print "Email da Empresa:"
            email = br.readLine()
        }
        print "Descrição:"
        String description = br.readLine()
        while (description.isEmpty()){
            print "Descrição:"
            description = br.readLine()
        }
        print "Endereço:\n\tPais:"
        String country = br.readLine()
        while (country.isEmpty()){
            print "\tPais:"
            country = br.readLine()
        }
        print "\tEstado:"
        String state = br.readLine()
        while (state.isEmpty()){
            print "\tEstado:"
            state = br.readLine()
        }
        print "\tCEP:"
        String cep = br.readLine()
        while (cep.isEmpty()){
            print "\tCEP:"
            cep = br.readLine()
        }
        println "caso não queira adicionar um competencia, aperte ENTER"
        int count = 1
        print "Competencia #$count: "
        String skill = br.readLine()
        while (!skill.isEmpty()){
            skills.add(skill)
            count++
            print "Competencia #$count: "
            skill = br.readLine()
        }
        print "CNPJ:"
        String cnpj = br.readLine()
        while (cnpj.isEmpty()){
            print "CNPJ:"
            cnpj = br.readLine()
        }

        LegalPersonEntity new_company = new LegalPersonEntity(
                name, email, description, new AddressEntity(country,state,cep),
                cnpj,skills
        )

        println "\n\n"+new_company
        legalPersonService.addUser(new_company)
    }
}