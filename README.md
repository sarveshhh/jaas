# jaas
This is for jenkins as a service
Only For very first time Run environment.sh that have been checked out. This will create /var/jenkins_home on host machine.
Instructions to build and run the dockerfile to launch a JaaS container:
- docker build -t jaas:POC {Path-to-directory-containing-dockerfile}
- nohup docker run -p 8080:8080 -p 50000:50000 -v /var/jenkins_home:/var/jenkins_home jaas:POC &
(In second command above we are using nohup,& in the start and end so that Command runs in background and terminal is free to be used further. You can use another terminal and omit 
nohup, &) 

To Get into container:
- docker exec -ti {ContainerID} /bin/bash


Why we are using tini in our dockerfile:
- https://github.com/krallin/tini/issues/8

Misc:
- Official Jenkins-Repo: https://repo.jenkins-ci.org/public/org/jenkins-ci/main/jenkins-war/

Configurations:
- Plugins will be installed as part of install-plugins.sh file that reads plugins.txt. All these files have to be placed besides Dockerfile
- Jenkins will be configured with skipping installation wizard initially.
- Initial User will be setup using adminuser.groovy that is to be kept besides Dockerfile.
- Ldap configurations will be done using ldap.groovy besides Dockerfile. Don't forget to uncomment line in Dockerfile that copied ldap.groovy to init.groovy.d dir
- sysadminemailconfig.groovy will take care of configuring email address for admin. Currently it has mine email address.
