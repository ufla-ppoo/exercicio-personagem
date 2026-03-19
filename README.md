# Exercício Personagem

O objetivo desse exercício é praticar a implementação de uma classe em Java e
sua utilização em outra classe.

## Orientações Gerais

- Você deve fazer um passo de cada vez, testá-lo, fazer o commit e enviar suas alterações.
Somente depois disso é que você deve passar para o próximo passo.

- **ATENÇÃO**: **desligue o GitHub Copilot para fazer o exercício!**

  - Se você utilizá-lo você não estará realmente praticando os conceitos aprendidos.
  - E, com isso, não desenvolverá as habilidades necessárias para se tornar
	um bom programador/desenvolvedor.
  - Sem contar ainda a questão do plágio.
  - Os exercícios trazem exemplos de código em Java, e você também pode (e deve) consultar os
    slides das aulas teóricas de revisão.

- Esse arquivo README pode ser melhor visualizado no VS Code (com formatação adequada) 
  abrindo-o no modo de visualização. Para isso, basta apertar Ctrl+Sfhit+V com ele aberto.


## Passo 1 - Classe para personagens

Neste exercício vamos criar uma classe para representar personagens e que poderia 
ser usada em um jogo.
Vamos tratar aqui apenas o início do desenvolvimento dessa classe.

Para facilitar, vamos considerar um contexto bem simples, no qual todo personagem
tem apenas um nome, uma quantidade de energia e a distância total percorrida.

Neste passo, você deve então criar uma classe para representar personagens.

- A classe deve ter um nome que represente bem os seus objetos.
- A classe deve ter os atributos conforme citado acima (nome, quantidade de energia e distância percorrida).
  - Considere que a quantidade de energia e a distância são valores inteiros.
- A classe deve ter um construtor que inicialize os personagens com um estado válido.
- A classe deve ter métodos de acesso (_get_) que permitam acessar os valores dos três atributos.
- Por enquanto a classe não deve ter nenhum outro método, apenas os métodos de acesso (_get_).

A classe deve ser criada em um novo arquivo dentro da pasta `src` do projeto, 
e o nome do arquivo deve ser o mesmo da classe criada (com extensão `.java`).

Neste passo ainda não é possível testar o seu código no VS Code.

- Mas seria bem interessante testá-lo usando o `JShell`, como mostrado em aula.

De todo modo, ao terminar, faça o commit e sincronize as suas alterações (use `passo1` no comentário do commit).

- Obs.: se precisar fazer novo commit com alguma correção, use o comentário `passo1 - correções`.

Para ajudá-lo a lembrar da sintaxe do Java, segue abaixo um exemplo de código de uma classe.

```java
// --- CÓDIGO DE EXEMPLO ---
// Por convenção os nomes das classes iniciam-se com letra maiúscula; 
//  e os nomes de atributos e métodos com letra minúscula.
// Também por convenção utilizamos nomes com camelCase.
// - Ou seja, sem separar com _ e cada palavra do nome, a partir da segunda, iniciada com letra maiúscula
public class NomeDaClasse {

	// Atributos
    // Lembre-se que os atributos de uma classe devem ser encapsulados (ou seja, devem ser sempre privados).
	private int atrituboInteiro;
	private String atributoString;

	// Construtor
	public NomeDaClasse(Tipo parametro1, ...) {
		...		
	}

	// Método para retornar um atributo
    // É convenção também abrir as chaves ao final da linha.
	public int getAtributoInteiro() {
		return atributoInteiro;
	}
}
```

## Passo 2 - Primeiro Programa

Agora altere a classe `Principal`, que tem o método `executar`. 

Dentro do método, crie um objeto do tipo da classe que você criou no passo anterior.
O objeto deve representar um personagem com 

- um nome escolhido por você,
- uma quantidade inicial de energia diferente de zero, 
- e distância percorrida igual a zero.
- Obs.: as informações devem ser passadas diretamente no código (sem solicitar dados ao usuário).

Depois de criar o objeto exiba na tela as suas informações (nome, energia e distância).
A exibição deve ser feita na classe `Principal`, e não na classe que representa o personagem.

Teste suas alterações!

Depois, faça o commit e sincronize suas alterações (use `passo2` no comentário do commit).

Segue abaixo um exemplo de código Java que cria um objeto de uma classe e exibe informações na tela.

```java
// --- CÓDIGO DE EXEMPLO ---
public class Programa {

	public static void main(String[] args) {
		// Criamos objetos em Java com a palavra-chave new e 
		// usando o nome da classe (o construtor dela será chamado).
		NomeDaClasse nomeDaVariavel = new NomeDaClasse(parametro1, parametro2, ...);
			
		// exemplo de uso de um método de acesso para obter o valor de um atributo do objeto.
		int a = nomeDaVariavel.getAtributoInteiro();

		// exemplo de exibição de informação no terminal
		System.out.println("Valor de a: " + a);
	}	
}
```

## Passo 3 - Movimentando

Crie na classe que representa o personagem um método chamado `andar`.
Neste método a distância percorrida deve ser aumentada em 5 unidades, representando 5 metros percorridos.
Além disso, a energia deve ser diminuída em 10, considerando-se que são gastas duas
unidades de energia por metro percorrido.

Caso o personagem não tenha energia suficiente para andar, o método deve exibir 
uma mensagem informando isso e não deve alterar os atributos do personagem.

Por fim, acrescente código à classe `Principal` de forma que que o personagem se
movimente uma vez e sejam exibidos novamente os dados dele.

Teste suas alterações!

Depois, faça o commit e sincronize suas alterações.

## Passo 4 - Comendo

Crie na classe que representa o personagem um método chamado `comer`.

Neste método a energia do personagem deve ser aumentada em 20 unidades, 
representando o personagem comendo um alimento que lhe dá energia.

Altere a classe `Principal` de forma a fazer o personagem comer uma vez e 
depois exiba novamente os dados dele.

Teste suas alterações!

Depois, faça o commit e sincronize suas alterações.

## Passo 5 - Obtendo dados do usuário

Altere a classe `Principal` de forma que o usuário escolha a ação a ser realizada pelo personagem.

- ATENÇÃO: o código desenvolvido nos passos anteriores deve ser mantido.

O funcionamento deve ser da seguinte forma:

- Enquanto o usuário não digitar a palavra `sair`, o programa deve solicitar 
  que o usuário digite uma ação a ser realizada pelo personagem.
- As ações possíveis são `andar` e `comer`.
- O programa deve tratar a ação escolhida pelo usuário, ou seja, deve chamar o método correspondente à ação escolhida e, em seguida, exibir os dados do personagem.
- Caso o usuário digite uma ação inválida, o programa deve exibir uma mensagem informando isso e solicitar novamente a ação a ser realizada.
- E, claro, se o usuário digitar `sair`, o programa deve ser encerrado.

Dica 1: lembre-se que, para comparar Strings em Java, não se deve usar o operador `==`, 
mas sim o método `equals` da classe String.

Dica 2: segue abaixo um exemplo de código que mostra como obter dados do usuário usando a classe `Scanner`.


```java
// importamos a classe Scanner
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		// criamos um objeto Scanner que permite obter dados via terminal
		Scanner entrada = new Scanner(System.in);
		// usamos o método nextLine para obter uma String com o objeto Scanner
		String texto = entrada.nextLine();

		// ...

		// Ao final precisamos nos lembrar de fechar o objeto Scanner utilizado para
		// liberar os recursos do objeto quando ele não é mais usado
		// Obs.: No VS Code, enquanto essa linha não é implementada é exibido um aviso (warning) de compilação: 
		// “Resource leak: 'entrada' is never closed". 
		entrada.close();
	}	
}
```

Teste suas alterações!
Depois, faça o commit e sincronize suas alterações.

## Passo 6 - Menu

Crie uma nova classe chamada `PrincipalComMenu`.
Essa classe deve exibir o menu abaixo e tratar as suas ações.
Devem ser criados:

- um método para exibição do menu;
- e um método separado para o tratamento de cada opção de menu escolhida pelo usuário.
- Note que a classe `PrincipalComMenu` precisará ter um atributo da classe que representa o personagem.

```
1. Criar personagem
2. Andar
3. Comer
4. Exibir dados
5. Sair

  Digite sua opção:
```

Altere a classe `App`, acrescentando código para que seja criado um objeto da classe `PrincipalComMenu` 
e chamado o método para exibição do menu.
Mantenha na classe o uso do classe `Principal` para que o professor possa corrigir os passos anteriores do exercício.


Teste suas alterações!
Depois, faça o commit e sincronize suas alterações.

## Passo 7 - Trabalhando com vetores

Vamos agora alterar a classe `PrincipalComMenu` para que ela passe a trabalhar com um vetor de personagens de 4 posições.

Faça as alterações necessárias para tratar o vetor, dentre elas:

- Substitua o atributo do personagem por um vetor e crie-o no construtor.  
- A cada vez que a opção de menu de criar personagem for executada, 
  um único personagem deve ser criado e acrescentado ao vetor.
  - O usuário poderá acessar essa opção várias vezes, para criar vários personagens.
  - Mas depois que o vetor estiver cheio, o usuário deve ser informado que não é possível criar mais personagens.
- Altere as opções `andar` e `comer` do menu perguntando ao usuário qual personagem deve executar a ação.
  - Para isso, peça o nome do personagem ao usuário e encontre-o no vetor.
- Por fim, altere a opção exibir do menu para que sejam exibidas as informações de todos os personagens já criados.

**Dica**: lembre-se de testar todas as opções de menu sem ter criado nenhum personagem, tendo criado alguns e com o vetor cheio.

- O código deve ser cercado para evitar que ocorram erros em quaisquer situações.

Teste suas alterações!
Depois, faça o commit e sincronize suas alterações.


