# DSVendas

[![Website Badge](https://img.shields.io/website?url=https%3A%2F%2Fwesraiuga.github.io%2Fweslley-cv%2F)](https://wesraiuga-sds3.netlify.app/)
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WesRaiuga/projeto-sds3/blob/main/LICENSE) 

<br/>

# Sobre o projeto

https://wesraiuga-sds3.netlify.app/

DSVendas é uma aplicação full stack web construída durante a 3ª edição da **Semana DevSuperior** (sds3), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste em um dashboard de vendas, previamente cadastradas no banco de dados, apresentando gráficos de Taxa de sucesso e Total de vendas, por vendedor, além de uma tabela paginada com informações sobre todas as vendas.

## Layout web
![Tela inicial](./readme_assets/ss-home.png)

![Tela do dashboard](./readme_assets/ss-dashboard.png)

## Modelo conceitual
![Modelo Conceitual](./readme_assets/sds3-mc.png)

<br/>

# Tecnologias utilizadas
## Back end
- Java
- Spring Framework
- Maven
## Front end
- ReactJS / TypeScript
- Bootstrap
- Apex Charts
- Axios
## Implantação em produção
- Back end: Heroku
- Front end web: Netlify
- Banco de dados: Postgresql

<br/>

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/WesRaiuga/projeto-sds3.git

# entrar na pasta do projeto backend
cd projeto-sds3/backend

# executar o projeto
./mvnw spring-boot:run
```

## Front end
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/WesRaiuga/projeto-sds3.git

# entrar na pasta do projeto frontend
cd projeto-sds3/frontend

# instalar dependências
yarn install

# executar o projeto
yarn start
```

<br/>

# Autor

Weslley Alves de Aguiar

[![LinkedIn Badge](https://img.shields.io/badge/LinkedIn-blue?style=flat&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/wesraiuga/)

<br/>

# Referência e agradecimentos

- [DevSuperior](https://devsuperior.com "Site da DevSuperior")
- [Professor Nelio Alves](https://www.youtube.com/c/DevSuperior/featured "Canal no youtube da DevSuperior")