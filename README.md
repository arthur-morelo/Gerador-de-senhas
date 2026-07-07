# 🔒 Gerador de Senhas Seguro

Uma aplicação de console desenvolvida em Java que permite gerar senhas criptograficamente seguras com base em critérios personalizáveis fornecidos pelo usuário.

## 🚀 Funcionalidades

- **Comprimento Customizável:** Permite escolher o tamanho exato da senha (entre 4 e 32 caracteres).
- **Filtros Personalizados:** O usuário pode escolher incluir ou remover:
  - Números (`0-9`)
  - Letras Minúsculas (`a-z`)
  - Letras Maiúsculas (`A-Z`)
  - Caracteres Especiais (`!@#$%^&*...`)
- **Segurança Forte:** Utiliza a classe `SecureRandom` do Java para garantir que a geração de caracteres e posições seja imprevisível e segura contra ataques.
- **Validação de Entradas:** Tratamento de erros estruturado para evitar entradas inválidas no terminal.

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java (Compatível com JDK 17+ / otimizado para JDK 25)
- **Segurança:** `java.security.SecureRandom`
- **Ferramentas de Entrada:** `java.util.Scanner`

## 📦 Como Executar o Projeto

1. Certifique-se de ter o **Java JDK** instalado em sua máquina.
2. Clone o repositório ou baixe os arquivos.
3. Abra o terminal na pasta raiz do projeto e navegue até o diretório do código-fonte:
   ```bash
   cd src
