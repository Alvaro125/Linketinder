package com.project.ui

import com.project.entity.AddressEntity
import com.project.entity.NaturalPersonEntity
import com.project.entity.LegalPersonEntity

class Terminal {
    List<NaturalPersonEntity> candidatos = [
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
    List<LegalPersonEntity> empresas = [
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
                    println candidatos.join("\n----------------------------------------\n")
                    break
                case "2":
                    println empresas.join("\n----------------------------------------\n")
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

        NaturalPersonEntity novo_candidato = new NaturalPersonEntity(
                name, email, description, new AddressEntity(country,state,cep),
                cpf,age,skills
        )

        println "\n\n"+novo_candidato
        this.candidatos.add(novo_candidato)
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

        LegalPersonEntity nova_empresa = new LegalPersonEntity(
                name, email, description, new AddressEntity(country,state,cep),
                cnpj,skills
        )

        println "\n\n"+nova_empresa
        this.empresas.add(nova_empresa)
    }
}