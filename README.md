# 1424-corretor-ortografico
Muitos pacotes populares de software processador de texto têm verificadores ortográficos integrados.
Nesse projeto, exige-se que você desenvolva seu próprio utilitário de verificação ortográfica. Fazemos sugestões para ajudar você a começar.
Você então deve considerar a adição de mais capacidades. Utilize um dicionário computadorizado (se tiver acesso a um) como uma fonte
de palavras.
Por que digitamos tantas palavras com ortografia incorreta? Em alguns casos, isso é porque simplesmente não conhecemos a ortografia correta, então fazemos nossa “melhor suposição”. Em alguns casos, é porque transpomos duas letras (por exemplo, “pardão” em vez de
“padrão)”. Ocasionalmente digitamos duas vezes uma letra acidentalmente (por exemplo, “canssado” em vez de “cansado)”. Às vezes, digitamos uma tecla próxima em vez daquela pretendida (por exemplo, “amiverário” em vez de “aniversário”) e assim por diante
Projete e implemente um aplicativo de verificador ortográfico em Java. Seu aplicativo deve manter um array wordList de strings.
Permita que o usuário insira essas strings. [Observação: no Capítulo 15, introduzimos processamento de arquivo. Com essa capacidade,
você pode obter as palavras para o verificador ortográfico de um dicionário computadorizado armazenado em um arquivo.]
Seu aplicativo deve solicitar que um usuário insira uma palavra. O aplicativo deve então pesquisar essa palavra no array wordList.
Se a palavra estiver no array, seu aplicativo deve imprimir "Word is spelled correctly". Se a palavra não estiver no array, seu aplicativo deve imprimir "Word is not spelled correctly". Então, o aplicativo deve tentar localizar outras palavras em wordList que
podem ser a palavra que o usuário pensou em digitar. Por exemplo, você pode tentar todas as transposições possíveis simples de letras adjacentes para descobrir que a palavra “default” é uma correspondência direta com uma palavra na wordList. Naturalmente, isso implica
que seu aplicativo verificará todas as outras transposições simples, como “edfault”, “dfeault”, “deafult”, “defalut” e “defautl”. Quando você
encontrar uma nova palavra que localiza uma palavra na wordList, imprima-a em uma mensagem, como

Did you mean "default"?

Implemente outros testes, como substituir cada letra dupla por uma única letra e algum outro teste que você pode desenvolver para
aprimorar o valor de seu verificador ortográfico.
