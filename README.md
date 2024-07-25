# spring-kafka

## Описание

Реализация системы мониторинга из двух микросервисов с использованием Spring Kafka

## Сборка backend части

```cmd
cd Metrics-Consumer && mvn clean package
cd Metrics-Producer && mvn clean package
```
Linux (bash):
```bash
(cd Metrics-Consumer && mvn clean package)
(cd Metrics-Producer && mvn clean package)
```

## Запуск

### Простой запуск:
```bash
java -jar target/Metrics-Consumer-0.0.1-SNAPSHOT.jar
java -jar target/Metrics-Producer-0.0.1-SNAPSHOT.jar
```

## Запуск контейнера Kafka и Zookeeper

```bash
cd Metrics-Producer && docker-compose up
```

## Запуск браузера с отключённым CORS

chrome.exe --user-data-dir="C://chrome-dev-disabled-security" --disable-web-security --disable-site-isolation-trials

## Скрпит для создания таблицы метрики в БД

```
CREATE TABLE my_db.health_metric
(
    id     bigint NOT NULL AUTO_INCREMENT,
    metric varchar(100),
    PRIMARY KEY (id)
);
```
