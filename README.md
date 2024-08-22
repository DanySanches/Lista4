Projeto de classes de animais em Java:

Projeto de Classes de Animais em Java
Este projeto é uma implementação em Java que demonstra o uso de classes abstratas e interfaces para modelar um sistema de diferentes tipos de animais. O projeto inclui exemplos de animais terrestres, aéreos e marinhos, e usa conceitos de herança e polimorfismo.

Estrutura do Projeto
Interfaces
AnimalIF: Interface que define os métodos comuns a todos os animais:
comer()
moverse()
dormir()
Classes Abstratas
AnimalAB: Classe abstrata que implementa a interface AnimalIF. Define os métodos abstratos que devem ser implementados pelas subclasses:

comer()
moverse()
dormir()
AnimalMarinhoAB: Classe abstrata que estende AnimalAB e adiciona o método abstrato nadar().

AnimalVoadorAB: Classe abstrata que estende AnimalAB e adiciona o método abstrato voar().

AnimalTerrestreAB: Classe abstrata que estende AnimalAB e adiciona os métodos abstratos correr() e pular().

Classes Concretas
Cachorro: Classe que estende AnimalTerrestreAB. Representa um cachorro com a capacidade de comer, mover-se, dormir e pular.

Gato: Classe que estende AnimalTerrestreAB. Representa um gato com a capacidade de comer, mover-se, dormir e pular.

Elefante: Classe que estende AnimalTerrestreAB. Representa um elefante com a capacidade de comer, mover-se, dormir e pular.

Leão: Classe que estende AnimalTerrestreAB. Representa um leão com a capacidade de comer, mover-se, dormir e pular.

Peixe: Classe que estende AnimalMarinhoAB. Representa um peixe com a capacidade de comer, mover-se, dormir e nadar.

Pombo: Classe que estende AnimalVoadorAB. Representa um pombo com a capacidade de comer, mover-se, dormir e voar.

Atributos dos Animais
Cada animal possui os seguintes atributos:

Nome
Tipo de Animal
Idade
Habitat
Quantidade de Patas
Quantidade de Asas
Envergadura das Asas
Altura
Peso
Esses atributos são utilizados para representar as características físicas e comportamentais dos animais no sistema.

Como Executar o Projeto
Clonar o Repositório:

bash
Copiar código
git clone <URL-do-repositório>
Importar para o Eclipse:

Abra o Eclipse.
Vá para File > Import.
Selecione Existing Projects into Workspace.
Navegue até o diretório do projeto clonado e importe.
Executar o Projeto:

No Eclipse, localize a classe principal (Vida Animal).
Clique com o botão direito e selecione Run As > Java Application.

Contato
Para mais informações, você pode me contatar em danysanches@msn.com.
