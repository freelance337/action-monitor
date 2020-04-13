# action-monitor app

Chat app that allows two or more persons to interact between them. To keep the app as self-contained as possible, the Spring Boot native STOMP message and Apache Derby database were used, but is easily updated to ActiveMQ and other SQL database from application.properties and configuration files.

## Running the App

On the base app folder, just run

    mvn spring-boot:run

the chat app will run on http://localhost:8091/ , you can open as many tabs of the application as needed (one will be used for each user).

## Testing Methodology

Applied Mockist or classical were needed, also used Meanbean library for the model object