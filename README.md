

````markdown
# 🛒 Ecommerce API

Uma API RESTful desenvolvida com Spring Boot para gerenciar produtos, variantes, categorias e clientes de um sistema de comércio eletrônico.

---

## 📚 Tecnologias

- ✅ Java 17
- ✅ Spring Boot 3.5.0
- ✅ Spring Data JPA
- ✅ MySQL
- ✅ Swagger UI (SpringDoc OpenAPI)
- ✅ Maven

---

## 🚀 Como executar o projeto

1. **Clone o repositório**
   ```bash
   git clone https://github.com/mateusp-rezende/Ecommerce.git
   cd Ecommerce
````

2. **Configure o `application.properties`**
   Defina as variáveis de conexão com o banco MySQL:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Execute a aplicação**

   ```bash
   ./mvnw spring-boot:run
   ```

   Ou use sua IDE favorita.

4. **Acesse a documentação Swagger**
   👉 [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

---

## 📌 Endpoints principais

### 🔹 ProdutoController

* `GET /produtos`
* `GET /produtos/{id}`
* `GET /produtos/categoria/{id}`
* `GET /produtos/buscar`
* `POST /produtos`
* `PUT /produtos/{id}`

### 🔹 VarianteController

* `GET /variantes`
* `GET /variantes/{id}`
* `POST /variantes`
* `PUT /variantes/{id}`

### 🔹 CategoriaController

* `GET /categorias`
* `POST /categorias`
* `PUT /categorias/{id}`
* `DELETE /categorias/{id}`

### 🔹 ClienteController

* `GET /clientes`
* `GET /clientes/{id}`
* `POST /clientes`
* `PUT /clientes/{id}`
* `GET /clientes/telefone`

---

## 🧪 Exemplo de schemas no Swagger

* **Categoria**
* **Produto**
* **Variante**
* **Cliente**

Acesse a [interface Swagger](http://localhost:8080/swagger-ui/index.html) para visualizar e testar todos os endpoints disponíveis.

---

## 👤 Autor

**Mateus de Paula Rezende**
💻 Técnico em Informática para Internet pelo IFGOIANO
🎓 Graduando em Engenharia da Computação - IFGOIANO


---

```

