# import local repository

Example in:
- importLocalRepo
- demo

## create standard java library

![img.png](img.png)

run package to create library

![img_1.png](img_1.png)

the output in target folder

![img_2.png](img_2.png)


## import standard java library to target project

copy the lib jar file to /lib folder

![img_3.png](img_3.png)


config in pom to import

![img_4.png](img_4.png)

get groupId, artifactId, version from pom of importLocalRepo

![img_6.png](img_6.png)

now we can import and use package of importLocalRepo

![img_5.png](img_5.png)

different between 2 `jar` file

![img_19.png](img_19.png)

# import repository by maven from NEXUS

Example in:
- importNexusServer
- demo


install nexus on docker

    docker pull sonatype/nexus3

![img_7.png](img_7.png)

**run on cmd**

    docker run -d -p 8081:8081 --name nexus sonatype/nexus3

![img_9.png](img_9.png)

Access `http://localhost:8081/`

![img_10.png](img_10.png)

access to get password

![img_11.png](img_11.png)

![img_12.png](img_12.png)

sign-in to web
![img_13.png](img_13.png)



## Config to deploy jar to Nexus
Copy `settings.xml` to .m2 folder

    C:\Users\{user}\.m2

![img_16.png](img_16.png)

Edit file with authorization

![img_17.png](img_17.png)


![img_14.png](img_14.png)

![img_15.png](img_15.png)

check maven on Nexus

![img_18.png](img_18.png)

## Import to demo app

![img_20.png](img_20.png)

# **Result**

![img_21.png](img_21.png)






