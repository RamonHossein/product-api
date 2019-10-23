# API Spring Boot Swagger

Foi criado um projeto, no qual implementamos uma API REST utilizando o framework Spring e a ferramenta Swagger.

## Chamadas de API

* ***Index***

```java
GET: /api/produtos/{id}

{
  "id": 0,
  "nome": "string",
  "quantidade": 0,
  "valor": 0
}
```

* ***Show***

```java
GET: /api/produtos

[
  {
    "id": 0,
    "nome": "string",
    "quantidade": 0,
    "valor": 0
  }
]
```

* ***Create***

```java
POST: /api/produto

{
  "nome": "string",
  "quantidade": 0,
  "valor": 0
}
```

* ***Update***

```java
PUT: /api/produto

{
  "id": 0,
  "nome": "string",
  "quantidade": 0,
  "valor": 0
}
```

* ***Delete***

```java
DELETE: /api/produto
```

## Referências

O projeto foi realizado tendo como base as video aulas do canal [Michelli Brito](https://www.youtube.com/channel/UC2WbG8UgpPaLcFSNJYwtPow).

## Criado por

[RamonHossein](https://github.com/RamonHossein)
