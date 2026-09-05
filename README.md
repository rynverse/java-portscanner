# Ryn's Java Portscanner

### Overview
This is a Java script that scans the port of a given domain, telling you whether a port refuses to connect or is open. This was made to recap myself on Java, as well as learn more about port scanning without using tools such as `nmap`.

**This script is for educational purposes only, so please only use this responsibly. By default, the script only scans ports `1-1024`.**

### How it works
The script uses the `Scanner` class to take a user's target domain from the command line, which is then turned into an IP address to be scanned. It then creates a new socket object taking in the `inetAddress` and port, checking what gets returned and returning an output depending on what was caught.

See below a list of configuration variables that can be changed to alter the script.

| Variable | Default Value | Description | 
| ------------- | ------------- | ------------- |
| `startPort` | 1 | Starts scanning ports on the target address from `startport` |
| `endPort` | 1024 | Stops scanning ports on the target address from `endport` |

### What I learnt
I relearnt how to use Scanners in Java, by creating a new Scanner object `input` and then reading what the user enters in the next line - this is very useful for taking inputs from the command line, and greatly contrasts with my Python experience, where it is as simple as using `input()`.

I also learnt how to use Socket in Java, as well as `try` statements too. Similarly to Scanners, you need to create a `Socket` object and supply it with a target `inet` address and a port, which can be done with the step above, and using a for loop. With `try/catch` statements good for repeating a task and seeing what is returned, being more readable than `if/else` statements.

This made me appreciate the simplicity of libraries such as `nmap`, where we give a command, some parameters and it does its job - although we know how to use tools like `nmap`, its important we understand how they work under the hood. Finally, this project has given me the confidence to try make my own cybersecurity tools, rather than fully relying on using tools that are given to me - which can prove exceptionally helpful in incident response.

### Other Notes
As of 05/09/2026, I do not have any current plans of improving this script. Though I may work on using Java's `swing` library to make it an application.