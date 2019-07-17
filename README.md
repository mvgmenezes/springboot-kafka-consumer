# Kafka Consumer

### Reference Documentation
https://www.youtube.com/watch?v=IncG0_XSSBg

* [Documentation ](https://kafka.apache.org/quickstart)


### 1 - Primeiro instalar o kafka e o zookeeper *(Feita no video anterior)*
Quando se faz o download do kafka ele ja vem com o zookeeper juntos, portanto nao precisa fazer o download do zookeeper

* [Baixar o Kafka](https://www.apache.org/dyn/closer.cgi?path=/kafka/2.2.0/kafka_2.12-2.2.0.tgz)

### 2 - Executar o Zookeeper *(Feita no video anterior)*
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/zookeeper-server-start.sh config/zookeeper.properties`

### 3 - Executar o Kafka *(Feita no video anterior)*
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-server-start.sh config/server.properties`

### 4 - Criar um Topic para o Kafka *(Feita no video anterior)*
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example`

### 5 - Criar um Producer no localhost:9092
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example`
3. Digitar a mensagem a ser enviada

### 6 - Criar um novo Topic para o JSON
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example_json  `

### 5 - Criar um Producer no localhost:9092 para o JSON
1. Entrar na pasta do kafka_2.12-2.2.0 e executar o comando:
2. `$ bin/kafka-console-producer.sh --broker-list localhost:9092 --topic Kafka_Example_json  `
3. Digitar a mensagem a ser enviada




