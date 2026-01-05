def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "docker buildex build --platform linux/amd64 -t "${DockerHubUser}"/"${ProjectName}":"${ImageTag}" --load  . "
}
