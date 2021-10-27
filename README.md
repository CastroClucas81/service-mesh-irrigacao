# service-mesh-irrigacao

## CADA PASTA REPRESENTA UM MICROSERVICO

## obs.: para ms eu defini um READ.ME

# ms-irrigacao: ONDE FICAM AS OPERAÇÕES
  - http://localhost:8080/ativar-irrigacao
  - http://localhost:8080/desativar-irrigacao
  
# ms-irrigacao-utiliza-operacoes-irrigacao: CHAMADA DAS OPERAÇÕES
  - http://localhost:8000/usar-irrigacao/ativar
  - http://localhost:8000/usar-irrigacao/desativar
  
  
## exemplo json:
  ```json
    {
      "vazaoAgua": "300",
      "tamanhoArea": "200m²",
      "tipoJato": "potente",
      "tempoIrrigacao": "3 horas"
    }
  ```
  
