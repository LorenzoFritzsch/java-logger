<h1>java-logger</h1>
Just a very basic first version of a java logger.

To implement it in maven, add the following dependency:

```
<dependency>
	<groupId>com.github.LorenzoFritzsch</groupId>
	<artifactId>java-logger</artifactId>
	<version>ae4c3e9</version>
</dependency>
```

<h2>What it does</h2>
You can use this to manage logs. Currently the logs only get printed on the console, but I'm working on implementing a distribuited solution, in order to be able to use this with microservices, the idea would be to have all the logs in the same place, while keeping local logs on the machine, done simply and by me.
