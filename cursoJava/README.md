# cursoJava

Projeto para o curso de Java baseado em Spring Boot.

## Requisitos

- Java 21
- Maven (ou use o Maven Wrapper incluso no projeto)

## Como executar

Windows (PowerShell):

```powershell
.\mvnw.cmd spring-boot:run
```

Linux/macOS:

```bash
./mvnw spring-boot:run
```

## Como gerar o JAR

```powershell
.\mvnw.cmd clean package
```

O arquivo gerado fica em `target/`.

## Tecnologias

- Spring Boot 4.0.3
- Spring WebMVC
- Spring Data JPA
- Spring Validation
- H2 (console e database)
- Lombok

## Entrada da aplicacao

- `com.kiq.cursoJava.CursoJavaApplication`

