# QR Code Generator

## Projeto Java (Maven) que gera imagens de QR Code a partir de texto ou URLs. Utiliza a biblioteca [Nayuki QR Code Generator](https://www.nayuki.io/page/qr-code-generator-library) para codificar o conteúdo e produzir um `BufferedImage` em PNG. O código permite configurar escala, borda e cores (claro/escuro) do QR Code.

## How to use

1. **Clone o repositório** (se ainda não tiver):

   ```bash
   git clone <url-do-repositorio>
   cd Qrcode-Generator
   ```

2. **Compile o projeto:**

   ```bash
   mvn compile
   ```

3. **Personalize o conteudo:**
   Edite a variável `texto` em `src/main/java/dev/heb/Main.java` com o texto ou URL desejado e execute novamente:

```java
String texto = "https://www.google.com";  // Altere aqui
```

3. **Execute a classe principal:**

   ```bash
   mvn exec:java -Dexec.mainClass="dev.heb.Main"
   ```

4. O QR Code será gerado no arquivo **`qrcode.png`** na raiz do projeto.

---

## Dependencies

- [Java 17](https://adoptium.net/) (ou superior)
- [Maven](https://maven.apache.org/)
