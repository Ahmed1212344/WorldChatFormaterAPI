```markdown
# WorldChatFormatterAPI

A plugin that formats chat messages based on world and player groups.

## Usage

To use the WorldChatFormatterAPI in your project, add the following dependency to your `pom.xml`:

### Maven
```xml
<dependency>
    <groupId>com.LGDXCompany</groupId>
    <artifactId>WorldChatFormatterAPI</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>

```
### Gradle
```groovy
dependencies {
        implementation 'com.LGDXCompany:WorldChatFormatterAPI:1.0.0'
        }
```

### Example Plugin

### Here is an example of how to use the WorldChatFormatterAPI in your plugin:
```java
package com.example.plugin;

import com.LGDXCompany.Permission;
import com.LGDXCompany.ChatFormatter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ExamplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener() {
            @EventHandler
            public void onPlayerChat(AsyncPlayerChatEvent event) {
                Player player = event.getPlayer();
                if (Permission.hasPermission(player, "chat.use")) {
                    String formattedMessage = ChatFormatter.formatChat(player, event.getMessage());
                    event.setFormat(formattedMessage);
                }
            }
        }, this);
    }
}
```

### Building the Project

To build the project, use the following commands:

1- Clone the repository:
```shell
git clone https://github.com/YourUsername/WorldChatFormatterAPI.git
cd WorldChatFormatterAPI
```
2- Clean and install the project with Maven:
```shell
mvn clean install
```
**_The resulting JAR file will be located in the target directory for Maven 
and the build/libs directory for Gradle._**

### Installing the Plugin

To install the plugin in your project manually, follow these steps:

**Maven**
1- Add the generated JAR file to your project's build path.
2- Install the JAR file to your local Maven repository:
```shell
mvn install:install-file -Dfile=path/to/WorldChatFormatterAPI-1.0.0.jar -DgroupId=com.LGDXCompany -DartifactId=WorldChatFormatterAPI -Dversion=1.0.0 -Dpackaging=jar
```
Add the following dependency to your `pom.xml` :
```xml
<dependency>
    <groupId>com.LGDXCompany</groupId>
    <artifactId>WorldChatFormatterAPI</artifactId>
    <version>1.0.0</version>
</dependency>
```
**Gradle**
1- Add the generated JAR file to your project's `libs` directory.
2- Add the following dependency to your `build.gradle`
```groovy
dependencies {
    implementation files('libs/WorldChatFormatterAPI-1.0.0.jar')
}
```
**License**

**_This project is licensed under the Apache License 2.0. See the LICENSE file for details.**_
```markdown

### Instructions Breakdown

1. **Usage Section:**
   - Explains how to add the API dependency to a Maven or Gradle project.

2. **Example Plugin:**
   - Provides a simple example of how to use the API in a plugin.

3. **Building the Project:**
   - Step-by-step instructions for cloning the repository and building the project using both Maven and Gradle.

4. **Installing the Plugin:**
   - Instructions for manually adding the JAR file to a project for both Maven and Gradle users.

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
     ├── build.gradle
     ├── README.md
     └── LICENSE
     ```

3. **Create and Edit Files:**
   - `pom.xml` should be configured as shown in the previous response.
   - `build.gradle` should be configured as follows:
     ```groovy
     plugins {
         id 'java'
     }

     group 'com.LGDXCompany'
     version '1.0.0'

     repositories {
         mavenCentral()
     }

     dependencies {
         testImplementation 'org.junit.jupiter:junit-jupiter-api:5.7.0'
         testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.7.0'
     }

     test {
         useJUnitPlatform()
     }
     ```
   - `README.md` should contain usage instructions, example code, build instructions, and installation instructions.
   - `LICENSE` should contain your chosen license text (e.g., Apache License 2.0).

4. **Commit and Push to GitHub:**
   - Add, commit, and push your files to the GitHub repository.

```sh
git add .
git commit -m "Initial commit"
git push origin main
```






