def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker buildex build t "${DockerHubUser}"/"${ProjectName}":"${ImageTag}" . "
}
