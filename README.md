# CannonBolt

[![GNU GENERAL PUBLIC LICENSE][license-shield]][license-url]

Blueprint for Large-Scale Distributed System maintaining
* Highly Available
* Highly Consistent

<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Installation](#installation)


<!-- ABOUT THE PROJECT -->
## About The Project
Working on blueprint project that can be further implemented and scaled up to 30k transactions per second.

### Built With
We are working with below mentioned technologies for building this blueprint
* [Nginx](https://www.nginx.com/) - Load balancer
* [Spring Boot Tomcat Application](https://spring.io/projects/spring-boot) - Container for server deployment
* [Redis/Redis-Cluster](https://redis.io/) - Cache layer
* [MySql (Master - Slave)](https://www.mysql.com/) - Persistence layer
* [kafka/ RabbitMQ](https://kafka.apache.org/) - Async Task
* [NewRelic](https://newrelic.com/) - Monitoring


<!-- GETTING STARTED -->
## Getting Started


### Installation


[license-shield]: https://img.shields.io/badge/License-GPLv3-blue.svg               
[license-url]: https://github.com/anujvishwakarma/CannonBolt/blob/master/LICENSE