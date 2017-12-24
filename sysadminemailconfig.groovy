#!Groovy
//This groovy script will configure the email address for admin

import jenkins.model.*
def jenkinsLocationConfiguration = JenkinsLocationConfiguration.get()
jenkinsLocationConfiguration.setAdminAddress("XYZ <xyz@abc.com>")
jenkinsLocationConfiguration.save()

