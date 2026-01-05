def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker build tag "${DockerHubUser}"/"${ProjectName}":"${ImageTag}" . "
}
