```### This project is licensed under the Apache License 2.0. See the LICENSE file for details.```


### Instructions Breakdown

1. **Usage Section:**
    - Explains how to add the API dependency to a Maven project.

2. **Example Plugin:**
    - Provides a simple example of how to use the API in a plugin.

3. **Building the Project:**
    - Step-by-step instructions for cloning the repository, building the project using Maven, and finding the resulting JAR file.

4. **Installing the Plugin:**
    - Instructions for manually adding the JAR file to a project, including how to install it to the local Maven repository and then add it as a dependency in `pom.xml`.

5. **License:**
    - Information about the project's licensing.

### Steps to Follow:

1. **Create a GitHub Repository:**
    - Go to [GitHub](https://github.com/) and create a new repository named `WorldChatFormatterAPI`.
    - Clone the repository to your local machine.

2. **Structure Your Project:**
    - Organize your project with the following structure:
      ```
      WorldChatFormatterAPI/
      ├── src/
      │   ├── main/
      │   │   └── java/
      │   │       └── com/
      │   │           └── LGDXCompany/
      │   │               └── App.java
      │   ├── test/
      │   │   └── java/
      │   │       └── com/
      │   │           └── LGDXCompany/
      │   │               └── AppTest.java
      ├── pom.xml
      ├── README.md
      └── LICENSE
      ```

3. **Create and Edit Files:**
    - `pom.xml` should be configured as shown in the previous response.
    - `README.md` should contain usage instructions, example code, build instructions, and installation instructions.
    - `LICENSE` should contain your chosen license text (e.g., Apache License 2.0).

4. **Commit and Push to GitHub:**
    - Add, commit, and push your files to the GitHub repository.

```sh
git add .
git commit -m "Initial commit"
git push origin main
