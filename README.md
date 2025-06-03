# Ecommerce
API de comercio eletrônico em SPRING

### 📋 **Tabela com Exemplos Práticos de Anotações no Spring Boot**

| Anotação                       | Onde Usar                    | Exemplo de Uso                                                                                                                         | Explicação                                      |
| ------------------------------ | ---------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| `@SpringBootApplication`       | Classe principal             | `java @SpringBootApplication public class App { public static void main(String[] args) { SpringApplication.run(App.class, args); } } ` | Ponto de entrada da aplicação Spring Boot.      |
| `@Entity`                      | Classe de modelo             | `java @Entity public class Produto { ... } `                                                                                           | Informa que a classe é uma tabela no banco.     |
| `@Id`                          | Atributo da entidade         | `java @Id private Long id; `                                                                                                           | Define a chave primária da tabela.              |
| `@GeneratedValue`              | Atributo da entidade         | `java @GeneratedValue(strategy = GenerationType.IDENTITY) `                                                                            | Gera automaticamente o ID (auto-incremento).    |
| `@Table(name="produtos")`      | Classe de modelo             | `java @Table(name = "produtos") `                                                                                                      | Define o nome da tabela no banco (opcional).    |
| `@Column(name="nome")`         | Atributo da entidade         | `java @Column(name = "nome") `                                                                                                         | Personaliza a coluna no banco (opcional).       |
| `@Repository`                  | Interface de repositório     | `java @Repository public interface ProdutoRepo extends JpaRepository<Produto, Long> { } `                                              | Interface para acesso a dados.                  |
| `@RestController`              | Classe de controle           | `java @RestController @RequestMapping("/produtos") public class ProdutoController { ... } `                                            | Define uma API REST.                            |
| `@RequestMapping("/produtos")` | Classe ou método             | `java @RequestMapping("/produtos") `                                                                                                   | Define rota base para os métodos.               |
| `@GetMapping`                  | Método controlador           | `java @GetMapping public List<Produto> listar() { return repo.findAll(); } `                                                           | Rota GET: listar dados.                         |
| `@PostMapping`                 | Método controlador           | `java @PostMapping public Produto salvar(@RequestBody Produto p) { return repo.save(p); } `                                            | Rota POST: criar novo registro.                 |
| `@PutMapping("/{id}")`         | Método controlador           | `java @PutMapping("/{id}") public Produto atualizar(@PathVariable Long id, @RequestBody Produto p) { ... } `                           | Rota PUT: atualizar dados.                      |
| `@DeleteMapping("/{id}")`      | Método controlador           | `java @DeleteMapping("/{id}") public void deletar(@PathVariable Long id) { repo.deleteById(id); } `                                    | Rota DELETE: excluir por ID.                    |
| `@PathVariable`                | Parâmetro de método          | `java @GetMapping("/{id}") public Produto buscar(@PathVariable Long id) { ... } `                                                      | Captura o valor da URL.                         |
| `@RequestBody`                 | Parâmetro de método          | `java public Produto salvar(@RequestBody Produto p) `                                                                                  | Recebe os dados em JSON no corpo da requisição. |
| `@Autowired`                   | Atributo da classe           | `java @Autowired private ProdutoRepository repo; `                                                                                     | Injeta automaticamente uma dependência.         |
| `@Service`                     | Classe de serviço (opcional) | `java @Service public class ProdutoService { ... } `                                                                                   | Define uma camada de lógica de negócio.         |
| `@Component`                   | Qualquer classe              | `java @Component public class Util { ... } `                                                                                           | Marca uma classe como gerenciada pelo Spring.   |

---

