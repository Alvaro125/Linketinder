# Linketinder Acelera ZG

Linketinder é um sistema de contratação de funcionários inspirado no Linkedin e Tinder. Ele permite que empresas encontrem candidatos com as competências desejadas de forma rápida e eficaz.

## Configuração do Projeto

Certifique-se de ter o JDK 17 e o Groovy 2.4.21+  instalado em sua máquina. Você também precisará do Gradle para compilar e executar o projeto.

## Executando o Projeto

Para executar o projeto, use o seguinte comando:

```bash
./gradlew run --console plain
```

Certifique-se de ter todas as dependências corretamente configuradas no seu ambiente. O projeto depende das seguintes bibliotecas:

- Jansi 1.18
- Groovy 4.0.14
- Junit-bom 5.9.1
- Junit-jupiter

Certifique-se de que essas dependências estejam disponíveis no classpath ao executar o projeto.

## Funcionalidades


- Manter um array de candidatos com informações básicas (Nome, E-mail, CPF, idade, Estado, CEP, descrição pessoal) e competências.
- Manter um array de empresas com informações básicas (Nome, E-mail Corporativo, CNPJ, País, Estado, CEP, Descrição da empresa) e competências desejadas.
- Listar todas as empresas e todos os candidatos cadastrados.
---
## Autor
Álvaro Martinez Ferreira

## Licença
Este projeto está licenciado sob a Licença MIT.