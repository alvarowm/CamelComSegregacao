# Camel com Segregação.


Um simples exemplo do uso de Apache Camel trabalhando arquivos CSV e distribuindo seu contéudo para diferentes saídas.

Apache Camel é um framework de integração que implementa os EIPS (https://www.amazon.com.br/Enterprise-Integration-Patterns-Designing-Deploying/).

O framework é muito flexível e nesse exemplo ele segrega arquivos CSV de acordo com seu conteúdo.

Inicialmente é usado um router:<br>
https://camel.apache.org/components/latest/eips/dynamicRouter-eip.html

e depois um multicast:<br>

https://camel.apache.org/components/latest/eips/multicast-eip.html

