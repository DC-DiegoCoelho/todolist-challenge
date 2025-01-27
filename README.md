# Diego’s Todo List Challenge

## Objective
Build a RESTful Todo List application using Spring Boot. The application will allow users to manage a list of tasks with basic functionalities like creating, reading, updating, and deleting tasks.

---

## Requirements

### User Stories:
- As a user, I want to add a new task to my Todo list.
- As a user, I want to view all tasks in my Todo list.
- As a user, I want to mark a task as completed.
- As a user, I want to update the title and description of a task.
- As a user, I want to delete a task from my list.

### Features:
- Create a task with a title, description, and status (`Pending` or `Completed`).
- Retrieve all tasks or filter by status (*optional* feature for advanced implementation).
- Update a task's details (title, description, or status).
- Delete a task.
- Return meaningful responses (e.g., `404 Not Found` for a non-existent task).

---

## Technical Requirements

### Spring Boot Setup:
- Use Spring Boot (version 3.x or higher).
- Include dependencies for:
  - **Spring Web**
  - **Spring Data JPA**
  - **PostgreSQL Database**
- Configure PostgreSQL database for local development.

### Entity Design:
Create a `Task` entity with the following fields:
- `id` (Long, Primary Key)
- `title` (String, Required)
- `description` (String, Optional)
- `status` (Enum: `PENDING`, `COMPLETED`, Default: `PENDING`)
- `createdAt` (Timestamp, Auto-generated)

### Repository Layer:
- Use `JpaRepository` to manage database interactions.

### Service Layer:
- Add a service layer for business logic (e.g., validations or transformations).

### Controller Layer:
Expose the following REST endpoints:
- `POST /api/tasks`: Create a new task.
- `GET /api/tasks`: Retrieve all tasks.
- `GET /api/tasks/{id}`: Retrieve a task by ID.
- `PUT /api/tasks/{id}`: Update a task.
- `DELETE /api/tasks/{id}`: Delete a task.

### Validation:
- Use annotations like `@NotNull`, `@Size`, etc., for field validations.
- Return appropriate HTTP status codes for validation errors.

### Testing:
- Write unit tests for the service layer.
- Write integration tests for the controller layer using `MockMvc`.

---

## Bonus Challenges
1. **Filter Tasks by Status**:
   - Add a query parameter to the `/api/tasks` endpoint to filter tasks by status (`PENDING` or `COMPLETED`).

2. **Pagination**:
   - Implement pagination for the `/api/tasks` endpoint.

3. **Frontend Integration**:
   - Create a basic HTML/JavaScript frontend to interact with the API (*optional*).

4. **Authentication**:
   - Add a simple authentication mechanism using Spring Security.

---

## Deliverables
- A GitHub repository containing the source code with:
  - Proper project structure.
  - A detailed `README.md` file (this file).
- Instructions to run the application.
- Ensure the code is clean, well-documented, and follows best practices.

---

## Evaluation Criteria
- Correct implementation of the core requirements.
- Code quality and readability.
- Use of Spring Boot conventions and best practices.
- Proper error handling and validation.
- Completeness of the `README.md` with setup instructions and examples.

---

## Helpful Resources
- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA Guide](https://spring.io/guides/gs/accessing-data-jpa/)
- [Building a RESTful API with Spring Boot](https://spring.io/guides/tutorials/rest/)