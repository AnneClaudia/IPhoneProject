# IPhoneProject

## Desafio Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Chegou a hora de colocar em prática a análise de negócios, requisitos, conceitos de programação orientada a objetos e modelagem UML. Com base no vídeo de lançamento do iPhone, utilize uma ferramenta de UML de sua preferência para elaborar a diagramação das classes e interfaces, representando as funções do iPhone como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Após isso, crie as classes e interfaces no formato de arquivos .java. Desafie-se a reproduzir este projeto em seu próprio repositório Git!

### Diagrama de Interfaces e Classe iPhone:
Interfaces: MusicPlayer, Phone, e InternetBrowser, e uma classe iPhone que implementa todas essas interfaces.

Diagrama de Interfaces
MusicPlayer Interface:

Métodos:
+ play(): void
+ pause(): void
+ stop(): void
+ next(): void
+ previous(): void
Phone Interface:

Métodos:
+ makeCall(number: String): void
+ receiveCall(number: String): void
+ sendMessage(number: String, message: String): void
+ receiveMessage(number: String, message: String): void
InternetBrowser Interface:

Métodos:
+ browse(url: String): void
+ openLink(url: String): void
+ back(): void
+ forward(): void
Diagrama de Classe iPhone
iPhone Class:
Implementa as interfaces MusicPlayer, Phone, e InternetBrowser.
Métodos:
+ play(): void
+ pause(): void
+ stop(): void
+ next(): void
+ previous(): void
+ makeCall(number: String): void
+ receiveCall(number: String): void
+ sendMessage(number: String, message: String): void
+ receiveMessage(number: String, message: String): void
+ browse(url: String): void
+ openLink(url: String): void
+ back(): void
+ forward(): void

![uml](https://github.com/user-attachments/assets/2d5ee386-b728-4289-abb4-a2a2021d74c6)

