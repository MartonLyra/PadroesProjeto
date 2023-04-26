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


### Observer:

O padrão Observer tem como finalidade estabelecer a comunicação entre objetos de forma que, sempre que o estado de um objeto seja alterado, ele irá notificar os demais objetos interessados dessa mudança.

Até o Java 9, faríamos uso da implementação das interfaces **Observable** e **Observer**. Mas, devido a alguns problemas dessa abordagem, ficou deprecated. Algns dos problemas são:
  - não ser _thread safe_;
  - não ser _serializável_;
  - das necessidades de realizar _casts_;
  - o estado da propriedade hasChanged() não é entregue um por um, nos parâmetros da notificação, por exemplo, podendo causar inconsistência se um dos observadores alterar o estado durante a notificação;  
  - ainda asism, não resolve todos os problemas necessários como, por exemplo, ter informações do que realmente mudou;

A título didático, implementamos as classes [Revista](src/main/java/com/marton/padroesprojeto/observerObservable/Revista.java) e [Assinante](src/main/java/com/marton/padroesprojeto/observerObservable/Assinante.java), que implementam, respectivamente, _Observable_ e _Observer_, para estudarmos seu funcionamento que pode ser visto através do seu [teste unitário](src/test/java/com/marton/padroesprojeto/observerObservable/AssinanteRevistaTest.java).

Mas isso não significa que o padrão GoF Observer ficou deprecated. Significa apenas que a abordagem acima não é a melhor implementação para esse padrão.

A partir do Java 9, a melhor abordagem para o padrão Observer é fazer uso de Listener.

Para isso, o objeto que disparará os eventos deve guardar uma instância de PropertyChangeSupport pois é através dessa classe que será disparado o gatilho e os ouvintes serão informados.

Diferentemente da implementação via par Observable/Observer, agora é possível informar a propriedade que está sendo alterada e, os ouvintes, terão a oportunidade de receber o valor antigo e o valor novo.

Podemos ver a implementação do padrão Observer na prática através das classes [RevistaSubject](src/main/java/com/marton/padroesprojeto/observerListener/RevistaSubject.java) e [AssinanteListener](src/main/java/com/marton/padroesprojeto/observerListener/AssinanteListener.java).


## Padrões Estruturais: Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy


### Adapter:

O padrão Adapter é muito utilizado quando precisamos encaixar uma nova biblioteca de classes, adquirida de terceiros, em um sistema de software já existente, porém essas bibliotecas de classe do novo fornecedor são diferentes das bibliotecas de classes do fornecedor antigo. Como não temos o código do novo fornecedor e também não podemos alterá-la, o que pode ser feito é criar uma classe que faça essa adaptação, ou seja, ela é responsável por adaptar a interface do novo fornecedor ao formato que o sistema espera. O Adapter é muito utilizado para compatibilizar o seu sistema a outros frameworks.

Portanto, o adaptador é um intermediador que recebe solicitações do cliente e converte essas solicitações num formato que o fornecedor entenda. O adaptador converte uma interface para outra, porém, também poderíamos ter um caso em que precisaríamos adaptar mais de uma classe, nesse caso entra em cena outro padrão de projeto chamado Facade (Fachada).

Se a interface do fornecedor mudar novamente apenas o Adaptador necessitará ser modificado sem alterar o resto do sistema.

Na nossa implementação do padrão Adapter, imagine que nosso sistema sabe trabalhar com tomadas de 3 pinos.

Porém, usamos um framework antigo que só sabe ligar na tomada de 2 pinos.

Com isso, foi criado AdapterTomada para nosso sistema ligar na tomada de 2 pinos.

Se, futuramente, o framework atualizar, não precisamos alterar todo o sistema, alteramos apenas o adapter.
