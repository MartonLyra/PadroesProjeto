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


- SingletonLazy: no modo SingletonLazy, a cada solicitação de uso do objeto, é verificado se a primeira instância já foi gerada ou não. Caso não tenha sido, esse primeiro objeto é instânciado. Caso métodos abstratos sejam utilizado, não será criado instância enquanto não for realmente necessário a existência do objeto.


- SingletonLazyHolder: aqui teremos uma classe interna que guardará a instância. Com isso, temos o benefício da classe ser Thread Safe. Semelhante ao SingletonLazy, somente será gerado a instância no momento de sua primeira utilização, sem precisar checar, a cada solicitação, se a instância já existe.



### Strategy:

O padrão Strategy tem como intenção criar uma Strategy para cada variante e fazer com que o método delegue o algotítmo para uma instância de Strategy.

Por exemplo: imagine o contexto de contas bancárias. Imagine que, existam dois tipos de contas bancárias: contas poupança e contas correntes. Cada uma tem suas características como, por exemplo, a conta poupança tem rendimentos enquanto a conta corrente tem limite de crédito pré-aprovado.

Vamos agora imaginar o método 'sacarDaConta'. Dependendo do tipo de conta, o método deve se comportar de forma diferente: na conta poupança simplesmente verifica se há saldo. Já na conta corrente, caso não haja saldo, devemos verificar se há crédito pré-aprovado.

Digamos que o sistema já está implementado e rodando com a existência de dois tipos de contas bancárias. Agora, se aparecer um terceiro tipo de conta bancária, Conta de Investimento, por exemplo, não precisamos alterar o método que chama o metodo 'sacarDaConta' já que essa nova classe da Conta de Investimento irá implementar o método 'sacarDaConta' e, com isso, irá funcionar sem condicionais do tipo de conta.    

Para exemplificar esse padrão, implementamos a classe abstrata [Conta](src/main/java/com/marton/padroesprojeto/strategy/Conta.java) e as classes que a implementam: [ContaPoupanca](src/main/java/com/marton/padroesprojeto/strategy/ContaPoupanca.java) e [ContaCorrente](src/main/java/com/marton/padroesprojeto/strategy/ContaCorrente.java).

E esse padrão pode ser melhor visto no método sacarDaConta(double valorSaque), das classes acima exemplificadas.


## Padrões Comportamentais: Chain of Responsibility, Iterator, Observer, Strategy, Template Method






## Padrões Estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy
