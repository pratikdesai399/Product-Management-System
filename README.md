# Product Management System

Welcome to the Product Management System! This system comprises three services: Product Service, Order Service, and Inventory Service. These services are designed as Spring Boot microservices that communicate with each other via Eureka Server.

## Features

- **Product Service**: Manages product information including creation, retrieval, update, and deletion.
- **Order Service**: Handles order processing, tracking, and management.
- **Inventory Service**: Manages inventory levels, updates, and notifications.

## Getting Started

To run the application, you have two options: using Docker or without Docker.

### Running with Docker

1. **Build Applications**: Run the following command in the root directory of each service to build the applications and create Docker images:
    ```
    mvn clean package -DskipTests
    ```

2. **Start the Applications**: Execute the following command to start the applications using Docker Compose:
    ```
    docker-compose up -d
    ```

### Running without Docker

1. **Build Applications**: Navigate to the root directory of each service and run the following command to build the applications:
    ```
    mvn clean verify -DskipTests
    ```

2. **Start the Applications**: After building the applications, run the following command in each service's directory to start the applications:
    ```
    mvn spring-boot:run
    ```

## Contributing

We welcome contributions to enhance the Product Management System. Feel free to submit issues, feature requests, or pull requests.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

If you have any questions or suggestions, please feel free to reach out to us via [email](mailto:example@example.com).

Thank you for using the Product Management System! Happy managing your products, orders, and inventory! 🚀
