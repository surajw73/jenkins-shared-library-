def call(String ProjectName, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(
                    'credentialsId':"docker-hub-cred",
                    usernameVariable:"dockerHubUser",
                    passwordVariable:"dockerHubPass")]){
                        sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
                        sh ' docker push "${dockerHubUser}"/"${ProjectName}":"${ImageTag}" '
    
}
