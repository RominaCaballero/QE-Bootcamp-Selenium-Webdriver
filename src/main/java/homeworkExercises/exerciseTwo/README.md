# Homework 2 - Selenium

For the site [https://demo.applitools.com/](https://demo.applitools.com/):

- Create classes to represent the **login** and **homepage**.
- Add tests to validate:
    - Successful login.
    - Correct loading of the **transactions list** on the homepage:
        - The number of items and their descriptions must match.

- Follow the **Page Object Model (POM)** design pattern.
- Create a **Base Test** class, which will be inherited by other test classes. This Base Test should contain:
    - Common attributes.
    - Actions to be executed before and after each test.

- Use one of the wait types we covered in class.

### Additional Instructions
- Use the same project from the previous assignment.
- Place the page classes in a separate package.