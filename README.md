# Padrões de Projeto
___

## Objetivo do Repositório:

Nesse repositório demonstro a utilização de alguns dos principais padrões de projeto, na prática, implementado usando Java.

## Introdução:

No cotidiano do profissional que atua no ramo da tecnologia, é comum se deparar com problemas arquiteturais recorrentes nos mais distintos sistemas de software.  

E, com esses problemas recorrentes, desenvolvedores e pesquisadores chegaram a padrões que melhoram a comunicação, o ententimento e a manutenção em cada situação para o qual foi definido.


## Padrões de Projetos

## Padrões Criacionais: Abstract Factory, Builder, Factory Method, Prototype, Singleton

### Singleton:

Singleton é o padrão de projeto onde apenas uma instância daquela classe será instanciada.

No presente repositório abortamos 3 tipos de implementação em Java. São eles:

- SingletonEager: o objeto será instanciado quando a classe for usada pela primeira vez, seja através de um método estático ou através do método getInstancia().


- SingletonLazy: no modo SingletonLazy, o objeto apenas será instanciado quando da sua primeira solicitação de uso. E, a cada nova solicitação do objeto, é verificado se precisa instanciar, ou não, a primeira instância.


- SingletonLazyHolder: aqui teremos uma classe interna que guardará a instância. Com isso, temos o benefício da classe ser Thread Safe. Semelhante ao SingletonLazy, somente será gerado a instância no momento de sua primeira utilização, sem precisar checar, a cada solicitação, se a instância já existe.



### Strategy:

O padrão Strategy tem como intenção criar uma Strategy para cada variante e fazer com que o método delegue o algotítmo para uma instância de Strategy.

Por exemplo: imagine o contexto de contas bancárias. Imagine que, existam dois tipos de contas bancárias: contas poupança e contas correntes. Cada uma tem suas características como, por exemplo, a conta poupança tem rendimentos enquanto a conta corrente tem limite de crédito pré-aprovado.

Vamos agora imaginar o método 'sacarDaConta'. Dependendo do tipo de conta, o método deve se comportar de forma diferente: na conta poupança simplesmente verifica se há saldo. Já na conta corrente, caso não haja saldo, devemos verificar se há crédito pré-aprovado.

Para exemplificar esse padrão, implementamos a classe abstrata [Conta](src/test/java/com/marton/padroesprojeto/strategy/Conta.java) e as classes que a implementam: [ContaPoupanca](src/test/java/com/marton/padroesprojeto/strategy/ContaPoupanca.java) e [ContaCorrente](src/test/java/com/marton/padroesprojeto/strategy/ContaCorrente.java).

E esse padrão pode ser melhor visto no método sacarDaConta(double valorSaque), das classes acima exemplificadas.


## Padrões Comportamentais: Chain of Responsibility, Iterator, Observer, Strategy, Template Method






## Padrões Estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
