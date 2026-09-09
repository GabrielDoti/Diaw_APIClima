[README (1).md](https://github.com/user-attachments/files/32009124/README.1.md)
# API de Clima - Belo Horizonte 🌦️

Esse projeto é uma API REST feita com Spring Boot pra mostrar o clima de Belo Horizonte em tempo real. A gente usa a API pública da Open-Meteo pra buscar os dados.

É um trabalho da disciplina de Desenvolvimento de Aplicações Web (DIAW), feito em dupla usando Pair Programming.

## 🚀 O que a gente usou

- Java 25
- Spring Boot 4.1.1
- Spring Web (starter-webmvc)
- Maven
- API Open-Meteo (é gratuita e não precisa de chave)

## 📦 Como o projeto tá organizado

```
src/main/java/com/clima/APIclima/
├── controller/
│   └── ClimaController.java   # onde fica o endpoint
├── service/
│   └── ClimaService.java      # busca os dados na Open-Meteo e monta a resposta
├── dto/
│   └── ClimaResponse.java     # objeto com os dados do clima que a API devolve
└── ApIclimaApplication.java   # classe principal
```

## 🔑 Sobre a API Key

Não precisa configurar nenhuma chave. A Open-Meteo é gratuita e não pede autenticação pro que a gente usa aqui.

## ▶️ Como rodar o projeto

Pra rodar, você precisa ter o Java 25 instalado.

1. Clona o repositório:
   ```
   git clone https://github.com/GabrielDoti/Diaw.git
   ```
2. Entra na pasta do projeto:
   ```
   cd Diaw/APIclima
   ```
3. Roda com o Maven Wrapper:
   ```
   ./mvnw spring-boot:run
   ```
   (se for Windows, usa `mvnw.cmd spring-boot:run`)
4. Pronto, a aplicação sobe em `http://localhost:8080`

## 🌐 Endpoint

### `GET /clima/belo-horizonte`

Retorna as informações do clima atual de Belo Horizonte.

**Exemplo do que a API devolve:**

```json
{
  "cidade": "Belo Horizonte",
  "temperaturaAtual": 24.3,
  "umidade": 58.0,
  "velocidadeVento": 12.4,
  "direcaoVento": 135.0,
  "temperaturaMax": 27.1,
  "temperaturaMin": 18.5,
  "condicoes": "N/A",
  "dataConsulta": "2026-09-09T14:32:10"
}
```

**O que cada campo significa:**

| Campo | O que é |
|---|---|
| `cidade` | Nome da cidade que foi consultada |
| `temperaturaAtual` | Temperatura atual em °C |
| `umidade` | Umidade do ar (%) |
| `velocidadeVento` | Velocidade do vento (km/h) |
| `direcaoVento` | Direção do vento (em graus) |
| `temperaturaMax` | Temperatura máxima prevista pro dia |
| `temperaturaMin` | Temperatura mínima prevista pro dia |
| `condicoes` | Descrição de como tá o tempo |
| `dataConsulta` | Data e hora em que a consulta foi feita |

## 📚 Dependências

- `spring-boot-starter-webmvc` — pra construir a API REST
- `spring-boot-starter-webmvc-test` — pros testes

## 👥 Quem fez

- Gabriel Vinícius Soares Doti
