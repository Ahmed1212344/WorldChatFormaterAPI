# WorldChatFormatterAPI

A plugin that formats chat messages based on world and player groups.

## Usage

To use the WorldChatFormatterAPI in your project, add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.LGDXCompany</groupId>
    <artifactId>WorldChatFormatterAPI</artifactId>
    <version>1.0.0</version>
    <scope>provided</scope>
</dependency>
```

### Example Plugin
### Here is an example of how to use the WorldChatFormatterAPI in your plugin:
```java
package com.example.plugin;

import com.LGDXCompany.worldchatformats.WorldChatFormatterAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        WorldChatFormatterAPI api = new WorldChatFormatterAPI();
        // Use the API to format chat messages
    }
}
```