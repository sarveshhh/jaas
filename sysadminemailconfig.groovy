#!Groovy
//This groovy script will configure the email address for admin
//Created By: Sarvesh Gupta/Himanshu Goel

import jenkins.model.*
def jenkinsLocationConfiguration = JenkinsLocationConfiguration.get()
jenkinsLocationConfiguration.setAdminAddress("XYZ <xyz@abc.com>")
jenkinsLocationConfiguration.save()

