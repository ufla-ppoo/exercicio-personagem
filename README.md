# Exercício Personagem

O objetivo desse exercício é praticar a implementação de uma classe em Java e
sua utilização em outra classe.

## Orientações Gerais

- Você deve fazer um passo de cada vez, testá-lo, fazer o commit e enviar suas alterações.
Somente depois disso é que você deve passar para o próximo passo.

- **ATENÇÃO**: **desligue o GitHub Copilot para fazer o exercício!**
  - Se você utilizá-lo você não estará realmente exercitando de verdade e
    não terá o domínio conceitos para desenvolver as habilidades necessárias para se tornar
	um bom programador/desenvolvedor.
  - Sem contar ainda a questão do plágio.
  - Os exercícios trazem exemplos de código em Java, e você também pode consultar os
    slides das aulas teóricas de revisão.

- Esse arquivo README pode ser melhor visualizado no VS Code (com formatação adequada) 
  abrindo-o no modo de visualização. Para isso, basta apertar Ctrl+Sfhit+V com ele aberto.


## Passo 1 - Classe para personagens

Neste exercício vamos criar uma classe para representar personagens de 
um jogo que pretendemos desenvolver.
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

Neste passo ainda não é possível testar o seu código no VS Code.

- Mas seria bem interessante testá-lo usando o `JShell, como mostrado em aula.

De todo modo, ao terminar, faça o commit e sincronize as suas alterações (use `passo1` no comentário do commit).

- Obs.: se precisar fazer novo commit com alguma correção, use o comentário `passo1 - correções`.

## Passo 2 - Primeiro Programa

Agora altere a classe `Principal`, que tem o método `executar`. 

Dentro do método, crie um objeto do tipo da classe que você criou no passo anterior.
O objeto deve representar um personagem com um nome escolhido por você, e que tenha
uma quantidade inicial de energia diferente de zero, e que tenha distância percorrida
igual a zero.

Depois de criar o objeto exiba na tela as suas informações (nome, energia e distância).

Obs.: a classe que representa o personagem não deve fazer nenhuma exibição de dados para o usuário.

Segue abaixo um exemplo de código que cria um objeto de uma classe e exibe informações na tela.

```java
// --- CÓDIGO DE EXEMPLO ---
public class Programa {

	public static void main(String[] args) {
		// Criamos objetos em Java com a palavra-chave new e 
    // usando o nome da classe (o construtor dela será chamado).
		NomeDaClasse nomeDaVariavel = new NomeDaClasse();
		
    // exemplo de uso de um método de acesso para obter o valor de um atributo do objeto.
		int a = nomeDaVariavel.getAtributoInteiro();
	
     // exemplo de exibição de informação no terminal
		System.out.println("Valor de a:" + a);
	}	
}
```

Teste suas alterações!

Depois, faça o commit e sincronize suas alterações (use `passo2` no comentário do commit).

## Passo 3 - Movimentando

Vamos melhorar nossa classe. 

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
depois exibir novamente os dados dele.

Teste suas alterações!

Depois, faça o commit e sincronize suas alterações.

## Passo 5 - Obtendo dados do usuário

Altere a classe `Principal` de forma que o usuário escolha a ação a ser realizada
pelo personagem.

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

Altere o programa do passo anterior de forma que ele exiba o menu abaixo e permita executar as ações do menu.

Na classe `Principal` devem ser criados:
- Um método separado para exibição do menu;
- e um método para o tratamento de cada opção de menu escolhida pelo usuário.

Obs.: deixe comentado o código da classe `Principal` referente aos passos anteriores para que o professor possa 
fazer a correção dos mesmos.

```
1. Criar personagem
2. Andar
3. Comer
4. Exibir dados
5. Sair

  Digite sua opção:
```

Obs.: Neste passo, passa a fazer sentido que a classe `Principal` tenha um atributo da classe que representa o personagem.

Teste suas alterações!
Depois, faça o commit e sincronize suas alterações.

## Passo 7 - Trabalhando com vetores

Vamos agora alterar a classe `Principal` para que ela passe a trabalhar com um vetor de personagens de 4 posições.

Faça as alterações necessárias para tratar o vetor, dentre elas:

- Declare o atributo e crie-o no construtor.
- Na opção de criar personagem, um único personagem deve ser criado e acrescentado ao vetor.
  - O usuário poderá acessar essa opção várias vezes, para criar vários personagens.
  - Mas depois que o vetor estiver cheio, o usuário deve ser informado que não é possível criar mais personagens.
- Altere as opções `andar` e `comer` do menu pedindo ao usuário qual personagem deve correr.
  - Para isso, peça o nome do personagem ao usuário e encontre-o no vetor.
- Por fim, altere a opção exibir do menu para que sejam exibas as informações de todos os personagens já criados.

**Dica**: lembre-se de testar todas as opções de menu sem ter criado nenhum personagem, tendo criado alguns e com o vetor cheio.
- O código deve ser cercado para evitar que ocorram erros em quaisquer situações.

Teste suas alterações!
Depois, faça o commit e sincronize suas alterações.


