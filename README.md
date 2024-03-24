# springboot-grafana-prometheus
Practice springboot app sending metrics to prometheus and building dashboards using grafana

### Prometheus
Open-source monitoring and alerting system. It collects stores and analyses metrics from various sources like:
  - apps
  - os
  - hardware
It offers insights into performance and system health

### Grafana
Open-source tool for:
  - visualization
  - monitoring
  - troubleshooting
It creates dashboards to visualize metrics from sources like:
  - Prometheus
  - Elasticsearch
  - InfluxDB
  - CloudWatch

## How to's
### Run app
Using maven

`mvn spring-boot:run`

Standalone
```shell
mvn clean package
java -jat target/practice-0.0.1-SNAPSHOT.jar
```

### Start containers
From docker-compose.yml location:

`docker-compose up`

### Resources
- [Monitoring Made Simple: Empowering Spring Boot Applications with Prometheus and Grafana](https://medium.com/simform-engineering/revolutionize-monitoring-empowering-spring-boot-applications-with-prometheus-and-grafana-e99c5c7248cf)