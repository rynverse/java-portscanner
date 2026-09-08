# Ryn's Java Portscanner

### Overview
This is a Java script that scans the port of a given domain, telling you whether a port refuses to connect or is open. This was made to recap myself on Java, as well as learn more about port scanning without using tools such as `nmap`.

**This script is for educational purposes only, do not use this on anyone without their permission. Only use legimitate targets to test Port Scanning scripts like `scanme.nmap.org` as these are provided for the explicit use of testing port scanners.**

### How it works
The script uses the `Scanner` class to take a user's target domain from the command line, which is then turned into an IP address to be scanned. It then creates a new socket object taking in the `InetAddress` and port, checking what gets returned and returning an output depending on what was caught.

See below a list of configuration variables that can be changed to alter the script.

| Variable | Default Value | Description | 
| ------------- | ------------- | ------------- |
| `startPort` | 1 | Starts scanning ports on the target address from `startport` |
| `endPort` | 1024 | Stops scanning ports on the target address from `endport` |

### What I learnt
I relearnt how to use Scanners in Java, by creating a new Scanner object `input` and then reading what the user enters in the next line - this is very useful for taking inputs from the command line, and greatly contrasts with my Python experience, where it is as simple as using `input()`.

I also learnt how to use Socket in Java, as well as `try` statements too. Similarly to Scanners, you need to create a `Socket` object and supply it with a target `inet` address and a port, which can be done with the step above, and using a for loop. With `try/catch` statements good for repeating a task and seeing what is returned, being more readable than `if/else` statements.

This made me appreciate the simplicity of libraries such as `nmap`, where we give a command, some parameters and it does its job - although we know how to use tools like `nmap`, its important we understand how they work under the hood. Finally, this project has given me the confidence to try make my own cybersecurity tools, rather than fully relying on using tools that are given to me - which can prove exceptionally helpful in incident response.

### Challenges faced
One challenged I faced while working on this project was making `Main.java` an executable file. Although this sounds trivial at first (for previous Java projects I had been using processing, which automatically turned files into a `.class` file) I had not compiled a Java file before. I overcame this with a quick search (and diagnosing session), installing the Java SDK from Adoptium and running `javac` on `Main.java`.

A second challenge I faced was understanding Java `exceptions`, I had not come across try/catch statements using exceptions. For example, in my code I use the `getbyName` method, however since I was taking user input I get an `UnknownHostException` as it was not given a value. I overcame this by finding ways to handle the `UnknownHostException` on the internet until I found the try/catch statement, which was my chosen solution to the problem.

### Results & Output
When given a link, the script should output:
```
scanme.nmap.org
Scanning Port: 1
 Connection Refused
Scanning Port: 2
 Connection Refused
Scanning Port: 3
 Connection Refused
Scanning Port: 4
 Connection Refused
Scanning Port: 5
 Connection Refused
Scanning Port: 6
```

![An image showing the result of running the Port Scanner](/images/result.png)

### Prerequisites
Requires a Java SDK Installed (I used Adoptium.net [found here](https://adoptium.net/en-GB))

### Where to find the Script
You can find the script in `/Java-Port-Scanner/src/Main.class`.
Alternatively, you use the shortcut [here](/Java-Port-Scanner/src/Main.class)

### How to run the Script
1) Navigate to the directory the `Main.class` file is found.
2) Run `Java Main.class`

### Limitations
As this scans ports sequentially, it is slow for large ranges. This type of scan too is a full connect scan, which is more detectable that SYN scan as well - I am currently unsure on how I can improve on these areas on my own. Should I find a solution in the future, I may update the code to reflect this.

### Other Notes
As of 05/09/2026, I do not have any current plans of improving this script. Though I may work on using Java's `swing` library to make it an application.