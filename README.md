# Padrões de Projeto
___

## Objetivo do Repositório:

Nesse repositório demonstro a utilização de alguns dos principais padrões de projeto, na prática, implementado usando Java.

## Introdução:

No cotidiano do profissional que atua no ramo da tecnologia, é comum se deparar com problemas arquiteturais recorrentes nos mais distintos sistemas de software.  

E, com esses problemas recorrentes, desenvolvedores e pesquisadores chegaram a padrões que melhoram a comunicação, o ententimento e a manutenção em cada situação para o qual foi definido.


## Padrões de Projetos

### Singleton:

Singleton é o padrão de projeto onde apenas uma instância daquela classe será instanciada.

No presente repositório abortamos 3 tipos de implementação em Java. São eles:

- SingletonEager: o objeto será instanciado quando a classe for usada pela primeira vez, seja através de um método estático ou através do método getInstancia().


- SingletonLazy: no modo SingletonLazy, o objeto apenas será instanciado quando da sua primeira solicitação de uso. E, a cada nova solicitação do objeto, é verificado se precisa instanciar, ou não, a primeira instância.


- SingletonLazyHolder: aqui teremos uma classe interna que guardará a instância. Com isso, temos o benefício da classe ser Thread Safe. Semelhante ao SingletonLazy, somente será gerado a instância no momento de sua primeira utilização, sem precisar checar, a cada solicitação, se a instância já existe.



