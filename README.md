# Checkpoint 2 - Microservice and Web Engineering

API Java para checkpoint 2 da disciplina de Microservice and Web Engineering

## Instalação

* Limpar e criar a pasta */target*

```
mvn clean package
```

* Configuração do Swagger

    - https://springdoc.org/properties.html

- application.properties

```
springdoc.swagger-ui.path=/
springdoc.swagger-ui.disable-swagger-default-url=true
```


## Navegação

### Executar a API

-  *Executando* **Maven**

```
mvn spring-boot:run
```

## Docker

### Conexões com BD - Criação de Container
- My SQL
  
```
 docker run -d \
 	--name mysql \
 	--rm \
 	-e MYSQL_ROOT_PASSWORD=root_pwd \
 	-e MYSQL_USER=new_user \
 	-e MYSQL_PASSWORD=my_pwd \
 	-p 3307:3306 \
 	mysql
```

### Documentação da API (Swagger)
- http://localhost:9000/swagger-ui.html


## Referencias

- https://springdoc.org/

## Feito por:
- Isabella Gomes Menezes 
- Ana Luiza de Paula Reis
