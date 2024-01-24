
# Tarefa API

Iremos desenvolver uma API REST para gerênciamento de tarefas do nosso cotidiano. Nela teremos as seguintes funcionalidades:


## Funcionalidades

- Criar uma tarefa;
- Deletar uma tarefa;
- Atualizar uma tarefa;
- Buscar tarefas pelo seu status;


## Dicas

- Use as DTOs fornecidas para as requisições e respostas das APIs;
- A persistência das tarefas deve ser implementada em memória;
- Você tem liberdade para criar qualquer classe que ache necessário, mas não poderá alterar as existes ou dominio;
- Recomendado utilizar os principios do clean code (codigo limpo), caso conheça;
- Nesse momento não será necessário a criação dos testes unitários;




## Documentação da API

#### Criar uma tarefa:
###### Request:


```http
  POST /api/tarefas/
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `titulo` | `string` | **Obrigatório**. Titulo da tarefa |
| `descricao` | `string` |  Descrição da tarefa |
| `user` | `Objeto` | **Obrigatório**. Usuário da tarefa |
| `nome` | `string` | **Obrigatório**. Nome do Usuário |
| `time` | `string` | **Obrigatório**. Time do Usuário|


###### Payload (Exemplo):

```javascript
{
"titulo": "Desenvolver Endpoint 1",
"descricao": "Descricao do endpoint:",
"user": {
    "nome": "Joao",
    "time": "Experiência do usuário"
  }
}

```

###### Response:



- Status:
-   Body (exemplo):
```javascript
  {
    "id": 1,
    "titulo": "Desenvolver Endpoint 1",
    "descricao": "Descricao do endpoint: ...",
    "user": {
        "nome": "Joao",
        "time": "App iOS"
      },
    "status": "TODO"
  }

```




#### Atualizar uma tarefa
```http
  PUT /api/tarefas/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID da tarefa que você quer |
| `titulo` | `string` | Titulo da tarefa |
| `descricao` | `string` |  Descrição da tarefa |
| `status` | `string` |  Status da tarefa |
| `user` | `Objeto` |  Usuário da tarefa |
| `nome` | `string` |  Nome do Usuário |
| `time` | `string` |  Time do Usuário|

###### Payload (Exemplo):

```javascript
    {
    "titulo": "Criação de usuarios",
    "descricao": "ENDPOINT POST /user",
    "user": {
        "nome": "Joao",
        "time": "App iOS"
    },
    "status": "DONE"
    }

```

###### Response:

- Status: 200
-   Body (exemplo):
```javascript
{
    "id": 1,
    "titulo": "Criação de usuarios",
    "descricao": "ENDPOINT POST /user",
    "user": {
        "nome": "Joao",
        "time": "App iOS"
    },
    "status": "DONE"
}

```



#### Consultar uma tarefa

```http
  GET /api/tarefas/${status}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `status`      | `string` | **Obrigatório**. O status da tarefa que você quer |






#### Response:

- Status: 200
-   Body (exemplo):
```javascript
{
    "tarefas": [
      {
        "id": 1,
        "titulo": "Desenvolver Endpoint 1",
        "descricao": "Descricao do endpoint: ...",
        "user": {
            "nome": "Joao",
            "time": "App iOS"
          },
        "status": "TODO"
      },
      {
        "id": 2,
        "titulo": "Desenvolver Tela 1",
        "descricao": "Descricao da tela: ...",
        "user": {
            "nome": "Joao",
            "time": "App iOS"
          },
        "status": "TODO"
      }
    ]
  }

```

