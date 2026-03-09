# Testing spring-rest Application

## Overview
This is a Spring Boot REST application built with Gradle. It exposes REST endpoints on the default port 8080.

## Prerequisites
- JDK 17+ installed
- No external databases or services required

## Build & Test Commands
```bash
# Build and run unit tests
./gradlew build

# Run the application locally
./gradlew bootRun

# Run tests only
./gradlew test
```

## Manual Testing
1. Start the app: `./gradlew bootRun`
2. Wait for the log line: `Started SpringRestApplication in X seconds`
3. The app runs on `http://localhost:8080` by default (configurable in `src/main/resources/application.properties`)
4. Verify health endpoint: `GET /` should return `"service health is good"`

## Key Endpoints
- `GET /` — Health check endpoint (returns plain text)

## Notes
- No CI/CD workflow is configured in this repo. Builds must be verified locally.
- The `application.properties` file is empty by default, so the app uses Spring Boot defaults (port 8080, etc.).
- The Gradle wrapper (`gradlew`) is included in the repo, so no global Gradle installation is needed.
- If migrating from older Spring Boot (2.x), remember that Spring Boot 3.x requires the `javax.*` to `jakarta.*` namespace change. This app currently does not use `javax.*` imports directly, but any future additions of servlets, validation, etc. must use `jakarta.*`.

## Devin Secrets Needed
None — no authentication or external services required.
