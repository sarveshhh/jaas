/*
   Disable submitting anonymous usage statistics to the Jenkins project.
   An option like this shouldn't be enabled by default.
 */

def j = Jenkins.instance
if(!j.isQuietingDown()) {
    if(j.isUsageStatisticsCollected()){
        j.setNoUsageStatistics(true)
        j.save()
        println 'Disabled submitting usage stats to Jenkins project.'
    }
    else {
        println 'Nothing changed.  Usage stats are not submitted to the Jenkins project.'
    }
}
else {
    println 'Shutdown mode enabled.  Disable usage stats SKIPPED.'
}
